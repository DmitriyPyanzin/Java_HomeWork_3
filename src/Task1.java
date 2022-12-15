import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    /*
     1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        (в языке уже есть что-то готовое для этого)
     */

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        List <Integer> list = new ArrayList<>();
        list = t1.fillList(list);
        System.out.println();
        list.removeIf(i -> (i % 2 == 0));
        System.out.println("Стало");
        System.out.println(list);
    }

    public List<Integer> fillList(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой длины будет список? ");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        System.out.println("Было");
        System.out.println(list);
        return list;
    }
}