package homework10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1());
        System.out.println(task2());

    }

    private static int task1() {          //1. Заповнити колекцію рандомними числами, і повернути суму всіх парних

        int SumEvenNum = (int) new Random()
                .ints(20, 1, 40)
                .limit(20)
                .filter(i -> i % 2 == 0)
                .mapToLong(x -> x)
                .sum();
        return SumEvenNum;
    }

    public static int task2() { // 2. Заповнити колекцію рандомними числами, і повернути кількість всіх не парних

        int countOddNum = (int) new Random()
                .ints(20, 1, 40)
                .limit(20)
                .filter(i -> i % 2 == 1)
                .count();
        return countOddNum;
    }


}
