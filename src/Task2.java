import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    /*
     2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
     */

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        List<Integer> list = new ArrayList<>();
        list = t2.fillList(list);
        t2.findMinMaxAverage(list);
    }

    public List<Integer> fillList(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой длины будет список? ");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println(list);
        return list;
    }

    public void findMinMaxAverage(List<Integer> list) {
        int sum = list.get(0), max = list.get(0), min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum += list.get(i);
            max = Math.max(list.get(i), max);
            min = Math.min(list.get(i), min);
        }
        System.out.println("Минимальное число списка " + min);
        System.out.println("Максимальное число списка " + max);
        System.out.println("Среднее арифметическое списка " + ((double) sum / list.size()));
    }
}
