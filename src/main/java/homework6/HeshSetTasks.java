package homework6;

import java.util.*;

public class HeshSetTasks {
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
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Blsck");
        hashSet.add("Brown");
        hashSet.add("Grey");

        System.out.println("Task 1: " + hashSet);

    }

    public static void task2() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");
        System.out.println("Task 2: ");

        for (String i : hashSet) {
            System.out.println(i);
        }
    }

    public static void task3() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        System.out.println("Task 3: " + hashSet.size());
    }

    public static void task4() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        hashSet.removeAll(hashSet);
        System.out.print("Task 4: ");

        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty ");
        } else {
            System.out.println("HashSet is not empty ");
        }
    }

    public static void task5() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");

        System.out.print("Task 5: ");
        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty ");
        } else {
            System.out.println("HashSet is not empty ");
        }
    }

    public static void task6() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("White");
        hashSet1.add("Black");
        hashSet1.add("Brown");
        hashSet1.add("Grey");

        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Blue");
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Yellow");

        Set<String> heshSetResult = new HashSet<>();
        heshSetResult.addAll(hashSet1);
        heshSetResult.addAll(hashSet2);

        System.out.println("Task 6: " + heshSetResult);
    }

    public static void task7() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("Task 7: " + Arrays.toString(array));
    }

    public static void task8() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Task 8: " + treeSet);
    }

    public static void task9() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        List<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("Task 9: " + arrayList);
    }

    public static void task10() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("White");
        hashSet1.add("Black");
        hashSet1.add("Brown");
        hashSet1.add("Grey");

        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Blue");
        hashSet2.add("Red");
        hashSet2.add("White");
        hashSet2.add("Brown");

        Set<String> result = new HashSet<>();

        System.out.print("Task 10: ");

        for (String i : hashSet1) {
            System.out.println(hashSet2.contains(i) ? "Yes " : "No ");
        }
    }

    public static void task11() {
        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("White");
        hashSet1.add("Black");
        hashSet1.add("Brown");
        hashSet1.add("Grey");

        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Blue");
        hashSet2.add("Red");
        hashSet2.add("White");
        hashSet2.add("Brown");

        hashSet1.retainAll(hashSet2);
        System.out.println("Task 11: " + hashSet1);
    }

    public static void task12() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("White");
        hashSet.add("Black");
        hashSet.add("Brown");
        hashSet.add("Grey");

        hashSet.clear();
        System.out.print("Task 12: ");

        if (hashSet.isEmpty()) {
            System.out.println("HashSet is empty ");
        } else {
            System.out.println("HashSet is not empty ");
        }
    }
}

