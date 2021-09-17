
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Программа должна получать имена файлов с номерами документов с консоли: каждая новая строка - это путь к файлу и имя файла.
 * Для завершения ввода списка файлов следует ввести 0.
 * После получения списка документов программа должна обработать каждый документ: вычитать из файла номера документов и провалидировать их.
 * В конце работы создать один файл отчет с выходной информаций: номер документа - комментарий(валиден или не валиден и по какой причине).
 * Пусть каждый файл содержит каждый номер документа с новой строки и в строке никакой другой информации, только номер документа.
 * Валидный номер документа должен иметь длину 15 символов и начинаться с последовательности docnum(далее любая последовательность букв/цифр) или kontract(далее любая последовательность букв/цифр).
 * Учесть, что номера документов могут повторяться в пределах одного файла и так же разные документы могут содержать одни и те же номера документов.
 * Если номера документов повторяются, то повторные номера документов не проверять, не валидировать.
 * Немного технических деталей
 * - Считать с консоли список документов: раз список - то это коллекции типа List, никаких других условий нет - значит все имена файлов с консоли сохраняем в структуру данных ArrayList.
 * - Номера документов могут повторяться, но повторные документы обрабатывать не надо и валидировать не надо,т.е. по сути дубликаты нам не нужны - значит, надо считать номера документов из файлов и все номера документов сохранять в коллекцию типа Set. Других условий нет, значит можно использовать HashSet.
 * - В конце должна быть структура номер документа - комментарий - т.е. эта структура типа ключ-значений, значит это коллекция типа Map.
 * Других условий нет - значит, можно использовать HashMap. Создать такую структуру и уже потом сделать цикл по этой структуре и записать всю информацию из этой мапы в файл-отчет.
 */
public class Task2 {//C:\Users\Amigo\OneDrive\Рабочий стол\TMS_Lesson_10_HW_files\

    public static void main(String[] args) {
        ArrayList<String> paths = new ArrayList<>();
        HashSet<String> nums = new HashSet<>();
        HashMap<String, String> validatedNums = new HashMap<>();

        readFilePaths(paths);
        readDocumentNumbers(paths, nums);
        validateNums(nums, validatedNums);

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> item: validatedNums.entrySet()) {
            stringBuilder.append(item.getKey() + " " + item.getValue() + '\n');
        }
        try {
            Files.write(Paths.get("validatedNumbers.txt"), stringBuilder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method reads files' paths
     */
    private static void readFilePaths(List<String> paths) {
        System.out.println("Enter paths to files");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String path = scanner.nextLine();
            if (path.equals("0")) break;
            else paths.add(path);
        }
    }

    /**
     * This method reads documents' numbers from files
     */
    private static void readDocumentNumbers(List<String> paths, Set<String> nums) {
        for (String path : paths) {
            try {
                nums.addAll(Files.readAllLines(Paths.get(path)));
            } catch (IOException e) {
                System.out.println("Can't read file " + path);
            }
        }
    }

    /**
     * This method validate documents' numbers
     */
    private static void validateNums(Set<String> nums, Map<String, String> validatedNums) {
        for (String num : nums) {
            String message = "Invalid: ";
            if (num.length() != 15) {
                message += "wrong length";
            } else if (!(num.startsWith("docnum") || num.startsWith("kontract"))) {
                message += "number doesn't start with docnum/kontract";
            } else if (num.replaceAll("\\w", "").length() != 0) {
                message += "number contains incorrect characters";
            } else {
                message = "Valid";
            }
            validatedNums.put(num, message);
        }
    }
}
