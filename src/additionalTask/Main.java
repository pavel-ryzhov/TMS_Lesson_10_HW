package additionalTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Создать класс Student, представляющий собой ученика. Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
 * Создать список (List) учеников. Найти и вывести ученика с самым высоким средним баллом используя итератор.
 * Отсортировать и вывести список учеников по полному имени (имя + фамилия), возрасту и среднему баллу, используя компараторы.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ivan", "Ivanov", 23, 8));
        list.add(new Student("Alexander", "Alexandrov", 21, 6.6));
        list.add(new Student("Mark", "Markov", 19, 7.6));
        list.add(new Student("Vasiliy", "Vasiliev", 25, 7.9));

        Iterator<Student> iterator = list.iterator();
        Student studentWithMaxAverageScore = new Student();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if (next.getAverageScore() > studentWithMaxAverageScore.getAverageScore())
                studentWithMaxAverageScore = next;
        }

        System.out.println("Student with max average score: " + studentWithMaxAverageScore);

        System.out.println("Sort by name:");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Sort by age:");
        list.sort(Comparator.comparingInt(Student::getAge));
        System.out.println(list);

        System.out.println("Sort by average score:");
        list.sort(Comparator.comparingDouble(Student::getAverageScore));
        System.out.println(list);
    }
}
