package homework6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTasks {
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
    }

    public static void task1() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");

        System.out.println("Task 1: " + treeSet);
    }

    public static void task2() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");

        System.out.print("Task2: ");

        for (String i : treeSet) {
            System.out.println(i);
        }
    }

    public static void task3() {
        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Yellow");
        treeSet1.add("Blue");
        treeSet1.add("Green");

        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Red");
        treeSet2.add("Black");
        treeSet2.add("Blue");
        treeSet2.add("Orange");

        treeSet1.addAll(treeSet2);

        System.out.println("Task 3: " + treeSet1);
    }

    public static void task4() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");
        System.out.println("Task 4: " + " BEFORE : " + treeSet);

        Iterator iterator = ((TreeSet<String>) treeSet).descendingIterator();
        System.out.println("AFTER: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void task5() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");

        System.out.println("Task 5: " + "First element is " +
                ((TreeSet<String>) treeSet).first() + ". Last element is "
                + ((TreeSet<String>) treeSet).last());
    }

    public static void task6() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");

        Set<String> result = (Set<String>) ((TreeSet<String>) treeSet).clone();
        System.out.println("Task 6: " + result);
    }

    public static void task7() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Yellow");
        treeSet.add("Blue");
        treeSet.add("Green");

        System.out.println("Task 7: " + treeSet.size());
    }

    public static void task8() {
        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Yellow");
        treeSet1.add("Blue");
        treeSet1.add("Green");

        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Red");
        treeSet2.add("Black");
        treeSet2.add("Blue");
        treeSet2.add("Orange");

        Set<String> result = new TreeSet<>();
        System.out.println("Task 8: ");
        for (String i : treeSet1) {
            System.out.println(treeSet2.contains(i) ? "Yes" : "No");
        }
    }

    public static void task9() {
        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> result;
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(2);

        result = ((TreeSet<Integer>) numbers).headSet(7);
        Iterator iterator = result.iterator();
        System.out.println("Task 9: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }

    public static void task10() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);

        System.out.println("Task 10: " + "Greater than or equal to 28: " +
                ((TreeSet<Integer>) numbers).ceiling(28) +
                ". Greater than or equal to 16 : " + ((TreeSet<Integer>) numbers).ceiling(15));
    }

    public static void task11() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);

        System.out.println("Task 11: " + "Less than or equal to 28: " +
                ((TreeSet<Integer>) numbers).floor(28) +
                ". Less than or equal to 16 : " + ((TreeSet<Integer>) numbers).floor(15));
    }

    public static void task12() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);

        System.out.println("Task 12: " + "Strictly greater than or equal to 28: " +
                ((TreeSet<Integer>) numbers).higher(28) +
                ". Strictly greater than or equal to 16 : " + ((TreeSet<Integer>) numbers).higher(15));
    }

    public static void task13() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);

        System.out.println("Task 13: " + "Strictly less than or equal to 28: " +
                ((TreeSet<Integer>) numbers).lower(28) +
                ". Strictly less than or equal to 16 : " + ((TreeSet<Integer>) numbers).lower(15));
    }

    public static void task14() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);
        System.out.println("Task 14: " + ((TreeSet<Integer>) numbers).pollFirst());
    }

    public static void task15() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);
        System.out.println("Task 15: " + ((TreeSet<Integer>) numbers).pollLast());
    }

    public static void task16() {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(93);
        numbers.add(7);
        numbers.add(28);
        numbers.add(9);
        numbers.add(16);

        numbers.remove(28);
        System.out.println("Task 16: " + numbers);
    }
}
