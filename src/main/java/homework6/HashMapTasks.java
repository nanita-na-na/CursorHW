package homework6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTasks {
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
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");
        System.out.println("Task 1: ");
        for (Map.Entry i : hashMap.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }

    public static void task2() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");
        System.out.println("Task 2: " + hashMap.size());
    }

    public static void task3() {
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "White");
        hashMap1.put(2, "Red");
        hashMap1.put(3, "Pink");

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(6, "Black");
        hashMap2.put(4, "Red");
        hashMap2.put(5, "Green");

        hashMap2.putAll(hashMap1);
        System.out.println("Task 3: " + hashMap2);
    }

    public static void task4() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");
        hashMap.clear();
        System.out.print("Task 4: ");
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty. ");
        } else {
            System.out.println("HashMap is not empty. ");
        }
    }

    public static void task5() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        boolean result = hashMap.isEmpty();
        System.out.print("Task 5: " + result);

        hashMap.clear();
        result = hashMap.isEmpty();
        System.out.print(". After clear " + result);
    }

    public static void task6() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        Map<Integer, String> result = new HashMap<>(hashMap);
        System.out.println("\nTask 6: " + result);
    }

    public static void task7() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        System.out.print("Task 7: ");
        if (hashMap.containsKey(2)) {
            System.out.print("Yes " + hashMap.get(2));
        } else {
            System.out.println("No");
        }
    }

    public static void task8() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        System.out.print("\nTask 8: ");
        if (hashMap.containsValue("Red")) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
    }

    public static void task9() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        Set set = hashMap.entrySet();
        System.out.println("\nTask 9: " + set);
    }

    public static void task10() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        System.out.println("Task 10: " + hashMap.get(3));
    }

    public static void task11() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        System.out.println("Task 11: " + hashMap.keySet());
    }

    public static void task12() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "White");
        hashMap.put(2, "Red");
        hashMap.put(3, "Pink");

        System.out.println("Task 12: " + hashMap.values());
    }
}
