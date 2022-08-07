package homework6;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
    }

    public static void task1() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        System.out.println("Task 1: " + colors);
    }

    public static void task2() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Task 2: ");
        for (String s : colors) {
            System.out.println(s);
        }
    }

    public static void task3() {
        Queue<String> colors1 = new PriorityQueue<>();
        colors1.add("Grey");
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Black");

        Queue<String> colors2 = new PriorityQueue<>();
        colors2.add("Orange");
        colors2.add("White");
        colors2.add("Gold");
        colors2.add("Brown");

        colors1.addAll(colors2);
        System.out.println("Task 3: " + colors1);
    }

    public static void task4() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.offer("Gold");
        System.out.println("Task 4: " + colors);
    }

    public static void task5() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.clear();
        if (colors.isEmpty()) {
            System.out.println("Task 5: Queue is empty");
        } else {
            System.out.println("Task 5: Queue is not empty");
        }
    }

    public static void task6() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Task 6: Amount of elements - " + colors.size());
    }

    public static void task7() {
        Queue<String> colors1 = new PriorityQueue<>();
        colors1.add("Blue");
        colors1.add("Red");
        colors1.add("Black");

        Queue<String> colors2 = new PriorityQueue<>();
        colors2.add("Orange");
        colors2.add("Gold");
        colors2.add("Blue");
        System.out.println("Task 7: ");

        for (String i : colors1) {
            System.out.println(colors2.contains(i) ? "Yes" : "No");
        }
    }

    public static void task8() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Task 8: The first element of Queue is " + colors.peek());
    }

    public static void task9() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        System.out.println("Task 9: Removes and first element of Queue is " + colors.poll());
    }

    public static void task10() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        String[] result = new String[colors.size()];
        colors.toArray(result);
        System.out.println("Task 10: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void task11() {
        Queue<String> colors = new PriorityQueue<>();
        colors.add("Grey");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        String str = colors.toString();
        System.out.println("Task 11: " + str);
    }

    public static void task12() {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(10, Collections.reverseOrder());
        numbers.add(10);
        numbers.add(22);
        numbers.add(36);
        numbers.add(25);
        numbers.add(70);
        numbers.add(82);
        numbers.add(14);
        System.out.print("Task 12: Maximum Priority Queue: ");
        Integer val = null;
        while ((val = numbers.poll()) != null) {
            System.out.print(val + "  ");
        }
        System.out.print("\n");
    }
}

