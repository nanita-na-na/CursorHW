package homework6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
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
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");

        System.out.println("Task 1: ");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void task2() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");

        Map<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(4, "Green");
        treeMap2.put(5, "Yellow");
        treeMap2.put(6, "Red");

        treeMap.putAll(treeMap2);
        System.out.println("Task 2: " + treeMap);
    }

    public static void task3() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");

        System.out.print("Task 3: ");
        if (treeMap.containsKey(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task4() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.print("Task 4: ");
        if (treeMap.containsValue("Orange")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task5() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.print("Task 5: " + treeMap.keySet());
    }

    public static void task6() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Red");
        treeMap.put(3, "Pink");
        treeMap.clear();
        System.out.print("\nTask 6: ");

        if (treeMap.isEmpty()) {
            System.out.println("TreeMap is empty. ");
        } else {
            System.out.println("TreeMap is not empty. ");
        }
    }

    public static void task7() {
        Comparator comparator = (Comparator<Object>) (o1, o2) -> 0;

        TreeMap<String, String> treeMap = new TreeMap<>(comparator);
        treeMap.put("3", "White");
        treeMap.put("2", "Red");
        treeMap.put("1", "Pink");
        System.out.println("Task 7: " + treeMap);
    }

    public static void task8() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.print("Task 8: " + "Greater key is " + ((TreeMap<Integer, String>) treeMap).firstEntry() + ". Least key is " + ((TreeMap<Integer, String>) treeMap).lastEntry());
    }

    public static void task9() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.print("\nTask 9: " + "Greater key is " + ((TreeMap<Integer, String>) treeMap).firstKey() + ". Least key is " + ((TreeMap<Integer, String>) treeMap).lastKey());
    }

    public static void task10() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("\nTask 10: " + ((TreeMap<Integer, String>) treeMap).descendingKeySet());
    }

    public static void task11() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 11: " + ((TreeMap<Integer, String>) treeMap).floorEntry(2));
    }

    public static void task12() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 12: " + ((TreeMap<Integer, String>) treeMap).floorKey(2));
    }

    public static void task13() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 13: " + ((TreeMap<Integer, String>) treeMap).headMap(3));
    }

    public static void task14() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 14: " + ((TreeMap<Integer, String>) treeMap).headMap(2, true));
    }

    public static void task15() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 15: " + ((TreeMap<Integer, String>) treeMap).higherEntry(2));
    }

    public static void task16() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 16: " + ((TreeMap<Integer, String>) treeMap).lowerEntry(2));

    }

    public static void task17() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 17: " + ((TreeMap<Integer, String>) treeMap).lowerKey(2));
    }

    public static void task18() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 18: " + ((TreeMap<Integer, String>) treeMap).navigableKeySet());
    }

    public static void task19() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 19: " + ((TreeMap<Integer, String>) treeMap).pollFirstEntry());
    }

    public static void task20() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 20: " + ((TreeMap<Integer, String>) treeMap).pollLastEntry());
    }

    public static void task21() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 21: " + ((TreeMap<Integer, String>) treeMap).subMap(1, 3));
    }

    public static void task22() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 22: " + ((TreeMap<Integer, String>) treeMap).subMap(1, true, 3, true));
    }

    public static void task23() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 23: " + ((TreeMap<Integer, String>) treeMap).tailMap(2));
    }

    public static void task24() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 24: " + ((TreeMap<Integer, String>) treeMap).tailMap(2, false));
    }

    public static void task25() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 25: " + ((TreeMap<Integer, String>) treeMap).ceilingEntry(2));
    }

    public static void task26() {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "White");
        treeMap.put(2, "Blue");
        treeMap.put(3, "Grey");
        System.out.println("Task 26: " + ((TreeMap<Integer, String>) treeMap).ceilingKey(2));
    }


}
