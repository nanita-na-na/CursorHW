package homework6;

import java.util.*;


public class LinkedListTasks {
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
        task23();
        task24();
        task25();
        task26();
    }

    public static void task1() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 1: " + list);
    }

    public static void task2() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 2: ");
        for (String i : list) {
            System.out.println(i);
        }
    }

    public static void task3() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 3: ");
        Iterator i = list.listIterator(2);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public static void task4() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.reverse(list);
        System.out.println("Task 4: " + list);
    }

    public static void task5() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        list.add(2, "Gold");
        System.out.println("Task 5: " + list);
    }

    public static void task6() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        ((LinkedList<String>) list).addFirst("Blue");
        ((LinkedList<String>) list).addLast("Yellow");
        System.out.println("Task 6: " + list);
    }

    public static void task7() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        ((LinkedList<String>) list).offerFirst("Pink");
        System.out.println("Task 7: " + list);
    }

    public static void task8() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        ((LinkedList<String>) list).offerLast("Blue");
        System.out.println("Task 8: " + list);
    }

    public static void task9() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");

        List<String> list1 = new LinkedList<>();
        list1.add("Brown");
        list1.add("Yellow");

        list.addAll(1, list1);
        System.out.println("Task 9: " + list);
    }

    public static void task10() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.println("Task 10: " + ((LinkedList<String>) list).getFirst() + " " + ((LinkedList<String>) list).getLast());
    }

    public static void task11() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        System.out.println("Task 11: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + " " + list.get(i));
        }
    }

    public static void task12() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        list.remove(0);
        System.out.println("Task 12: " + list);
    }

    public static void task13() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        ((LinkedList<String>) list).removeFirst();
        ((LinkedList<String>) list).removeLast();
        System.out.println("Task 13: " + list);
    }

    public static void task14() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        list.clear();
        System.out.print("Task 14: ");
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println(list);
        }
    }

    public static void task15() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.swap(list, 0, 3);
        System.out.println("Task 15: " + list);
    }

    public static void task16() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");
        Collections.shuffle(list);
        System.out.println("Task 16: " + list);
    }

    public static void task17() {
        List<String> list1 = new LinkedList<>();
        list1.add("Gray");
        list1.add("White");
        list1.add("Black");
        list1.add("Green");

        List<String> list2 = new LinkedList<>();
        list2.add("Yellow");
        list2.add("Brown");
        list2.add("Gold");
        list2.add("Blue");

        List<String> listResult = new LinkedList<>();
        listResult.addAll(list1);
        listResult.addAll(list2);

        System.out.println("Task 17: " + listResult);
    }

    public static void task18() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        List<String> listResult = new LinkedList<>();
        listResult = (List<String>) ((LinkedList<String>) list).clone();
        System.out.println("Task 18: " + listResult);
    }

    public static void task19() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.println("Task 19: " + "First removed element " +
                ((LinkedList<String>) list).pop() + " \\" +
                " List after pop operation " + list);
    }

    public static void task20() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.println("Task 20: " + "First not removed element " +
                ((LinkedList<String>) list).peekFirst() + " \\" +
                " List after peek operation " + list);
    }

    public static void task21() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.println("Task 21: " + "Last not removed element " +
                ((LinkedList<String>) list).peekLast() + " \\" +
                " List after peek operation " + list);
    }

    public static void task22() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.print("Task 22: ");

        if (list.contains("White")) {
            System.out.println("This color is listed");
        } else {
            System.out.println("This color is not listed");
        }
    }

    public static void task23() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        List<String> arrayList = new ArrayList<>(list);
        System.out.print("Task 23: ");

        for (String i : arrayList) {
            System.out.println(i);
        }
    }

    public static void task24() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        List<String> list2 = new LinkedList<>();
        list2.add("Yellow");
        list2.add("Brown");
        list2.add("Black");
        list2.add("Blue");

        List<String> listResult = new LinkedList<>();
        for (String i : list) {
            listResult.add(list2.contains(i) ? "Yes" : "No");
        }
        System.out.println("Task 24: " + listResult);
    }

    public static void task25() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        System.out.print("Task 25: ");
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
    }

    public static void task26() {
        List<String> list = new LinkedList<>();
        list.add("Gray");
        list.add("White");
        list.add("Black");
        list.add("Green");

        list.set(0, "Red");

        System.out.println("Task 26: " + list);
    }
}
