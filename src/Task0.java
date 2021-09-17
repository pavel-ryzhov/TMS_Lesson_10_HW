import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Заполнить коллекцию 10 рандомными целыми числами в промежутке от 2 до 98. Найти два максимальных элемента и вывести их на экран.
 */
public class Task0 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(97) + 2);
        }
        System.out.println(list);
        System.out.println("Max1: " + list.remove(list.indexOf(Collections.max(list))));
        System.out.println("Max2: " + Collections.max(list));
    }
}
