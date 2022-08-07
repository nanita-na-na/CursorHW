package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {

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
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    public static void task1() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 1: " + list);
    }

    public static void task2() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.print("Task 2: ");
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void task3() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        list.add(0, "Red");
        System.out.println("Task 3: " + list);
    }

    public static void task4() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 4: " + list.get(3));
    }

    public static void task5() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        list.set(3, "Orange");
        System.out.println("Task 5: " + list);
    }

    public static void task6() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        list.remove(2);
        System.out.println("Task 6: " + list);
    }

    public static void task7() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.print("Task 7: ");
        if (list.contains("White")) {
            System.out.println("Element found!");
        } else {
            System.out.println("No such element");
        }
    }

    public static void task8() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.sort(list);
        System.out.println("Task 8: " + list);
    }

    public static void task9() {
        List<String> list1 = new ArrayList<>();
        list1.add("Gray");
        list1.add("White");
        list1.add("Black");
        list1.add("Green");

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println("Task 9: " + "List 2 before: " + list2);
        Collections.copy(list2, list1);
        System.out.println("List 2 after: " + list2);

    }

    public static void task10() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.shuffle(list);
        System.out.println("Task 10: " + list);
    }

    public static void task11() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.reverse(list);
        System.out.println("Task 11:" + list);
    }

    public static void task12() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        List<String> subList = list.subList(0, 2);
        System.out.println("Task 12: " + subList);

    }

    public static void task13() {
        List<String> list1 = new ArrayList<>();
        list1.add("Gray");
        list1.add("White");
        list1.add("Black");
        list1.add("Green");

        List<String> list2 = new ArrayList<>();
        list2.add("Gray");
        list2.add("White");
        list2.add("Yellow");
        list2.add("Green");

        List<String> containsList = new ArrayList<>();

        for (String i : list1)
            containsList.add(list2.contains(i) ? "Yes" : "No");
        System.out.println("Task 13: " + containsList);

    }

    public static void task14() {
        List<String> list = new ArrayList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.swap(list, 0, 3);
        System.out.println("Task 14: " + list);
    }

    public static void task15() {
        List<String> list1 = new ArrayList<>();
        list1.add("Gray");
        list1.add("White");
        list1.add("Black");
        list1.add("Green");

        List<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Brown");
        list2.add("Gold");
        list2.add("Blue");

        List<String> listConc = new ArrayList<>();
        listConc.addAll(list1);
        listConc.addAll(list2);

        System.out.println("Task 15: " + listConc);
    }

    public static void task16() {
        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Brown");
        list1.add("Gold");
        list1.add("Blue");

        List<String> list2 = (List<String>) ((ArrayList<String>) list1).clone();
        System.out.println("Task 16: " + list2);
    }

    public static void task17() {
        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Brown");
        list1.add("Gold");
        list1.add("Blue");
        list1.clear();
        System.out.print("Task 17: ");
        if (list1.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println(list1);
        }
    }

    public static void task18() {
        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Brown");
        list1.add("Gold");
        list1.add("Blue");

        System.out.print("Task 18: ");
        if (list1.isEmpty()) {
            System.out.print("List is empty");
        } else {
            System.out.println(list1);
        }
    }

    public static void task19() {
        List<String> list = new ArrayList<>();
        list.add("Yellow");
        list.add("Brown");
        list.add("Gold");
        list.add("Blue");
        ((ArrayList<String>) list).trimToSize();
        System.out.println("Task 19: " + list);
    }

    public static void task20() {
        List<String> list = new ArrayList<>(4);
        list.add("Yellow");
        list.add("Brown");
        list.add("Gold");
        list.add("Blue");

        ((ArrayList<String>) list).ensureCapacity(7);
        list.add("Black");
        list.add("Gray");
        list.add("White");
        System.out.println("Task 20: " + list);
    }

    public static void task21() {
        List<String> list = new ArrayList<>(4);
        list.add("Yellow");
        list.add("Brown");
        list.add("Gold");
        list.add("Blue");
        String newColor = "Black";
        list.set(1, newColor);
        System.out.println("Task 21: " + list);
    }

    public static void task22() {
        List<String> list = new ArrayList<>(4);
        list.add("Yellow");
        list.add("Brown");
        list.add("Gold");
        list.add("Blue");
        System.out.print("Task 22: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
