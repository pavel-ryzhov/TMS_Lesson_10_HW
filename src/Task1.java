import java.util.ArrayList;
import java.util.Scanner;

/**
 * Заполнить коллекцию 5 строками введенными с консоли. В каждой строке заменить "+" на "+++". Вывести коллекцию-результат на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replace("+", "+++"));
        }
        System.out.println(list);
    }
}
