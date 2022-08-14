package homework10;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: " + task1());
        System.out.println("Task 2: " + task2());
        System.out.println("Task 3: ");
        task3();
        System.out.println("Task 4: ");
        task4();
        System.out.println("Task 5: ");
        task5();
        System.out.println("Task 6: " + task6());
    }
    private static int task1() {

        int SumEvenNum = (int) new Random()
                .ints(20, 1, 40)
                .limit(20)
                .filter(i -> i % 2 == 0)
                .mapToLong(x -> x)
                .sum();
        return SumEvenNum;
    }

    public static int task2() {

        int countOddNum = (int) new Random()
                .ints(20, 1, 40)
                .limit(20)
                .filter(i -> i % 2 == 1)
                .count();
        return countOddNum;
    }

    public static void task3() {

        List<String> strings = List.of("а", "й", "правда", "крилатим", "грунту", "не", "треба", "нема", "землі", "то", "буде", "небо");
        strings.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }

    public static void task4() {

        List<String> stringList = List.of("а", "й", "правда", "крилатим", "грунту", "не", "треба", "нема", "землі", "то", "буде", "небо");
        stringList.stream()
                .filter((s) -> s.contains("а"))
                .forEach(System.out::println);
    }

    public static void task5() {

        List<String> stringList = List.of("а", "й", "правда", "крилатим", "грунту", "не", "треба", "нема", "землі", "то", "буде", "небо");
        stringList.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static long task6() {

        char sought = 'а';
        List<String> stringList = List.of("а", "й", "правда", "крилатим", "грунту", "не", "треба", "нема", "землі", "то", "буде", "небо");
        long result = stringList.stream()
                .collect(Collectors.joining())
                .chars()
                .filter(s -> s == sought)
                .count();
        return result;
    }
}
