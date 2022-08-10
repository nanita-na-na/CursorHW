package homework9;

import java.util.stream.IntStream;

public class FunctionProgramming {
    public static void main(String[] args) {
        Task1 task1 = (a, b) -> Math.max(a, b);
        System.out.println("Task 1: Max of number is: " + task1.maxTwoIntArg(2, 3));


        Task2 task2 = (a, b, c, d, e, i, j) -> (a + b + c + d + e + i + j).toUpperCase();
        System.out.println("Task 2: Connection 7 lines is: " + task2.concatStr("a", "b", "c", "d", "e", "i", "j"));


        Task3 task3 = (a, b) -> {
            for (int i = a; i < b; i++) a = a * (i + 1);
            return a;
        };
        System.out.println("Task 3: Production of numbers is: " + task3.productNumOfRang(3, 6));


        Task4 task4 = (a) -> {
            if (a == 2) return true;
            if (a % 2 == 0) return false;
            for (int i = 2; i * i <= a; i += 2) {
                if (a % i == 0) return false;
            }
            return true;
        };
        System.out.println("Task 4: Number is prime? : " + task4.numIsPrime(9));


        Task5 task5 = (i) -> {
            if (i <= 1) {
                return 1;
            } else {
                return IntStream.rangeClosed(2, i).reduce((x, y) -> x * y).getAsInt();
            }
        };
        System.out.println("Task 5: Factorial number is: " + task5.factorial(5));
    }


}