import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        randomPairsInArray();
        numbersTenToNull();
        randomCharArray();
        maxNumberInArray();
        minNumberInArray();
        avarageOfArray();
        highestEvenNumberInArray();
        evenIndexArray();
    }

    /*
        1. Створити, а потім заповнити масив випадковими парними числами.
    */
    public static void randomPairsInArray() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            int number = random.nextInt(80);
            if (number % 2 == 0) {
                array[i] = number;
            } else {
                array[i] = number + 1;
            }
        }
        System.out.println("\nTask 1. Массив випадкових парних чисел: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    /*
        2. Вивести в консолі числа від 10 до 0
    */
    public static void numbersTenToNull() {
        int num = 11;
        System.out.println("\nTask 2. Зворотній відлік: ");
        while (num > 0) {
            num--;
            System.out.print(num + " ");
        }
    }

    /*
        3. Заповнити масив char випадковими символами
    */
    public static void randomCharArray() {
        Random random = new Random();
        char[] array = new char[10];
        System.out.println("\nTask 3. Массив випадкових символів: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) random.nextInt();
            System.out.print(array[i] + " ");
        }
    }

    /*
      4. Знайти найбільше число в масиві
    */
    public static void maxNumberInArray() {
        int[] array = {112, 2, 3, 4, 5, 17, 6, 7, 8, 9, 10, 11, 12};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.print("\nTask 4. Найбільше число в массиві: " + max);
    }

    /*
        5. Знайти найменше число в масиві
    */
    public static void minNumberInArray() {
        int[] array = {1, 2, 3, 4, 5, 17, 6, 7, 8, 9, 10, 11, 12};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.print("\nTask 5. Найменше число в массиві: " + min);
    }

    /*
        6. Знайти середнє значення суми всіх чисел в масиві
     */
    public static void avarageOfArray() {
        int array[] = {5, 8, 12, 18, 54, 84, 35, 17, 37, 2};
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.print("\nTask 6. Середнє арифметичне чисел: " + sum / array.length);
    }

    /*
       7. Знайти найбільше парне число в масиві
    */
    public static void highestEvenNumberInArray() {
        int[] array = {85, 7, 11, 17, 53, 83, 91, 35, 17, 37};
        boolean isEvenPresent = false;
        int max = Integer.MIN_VALUE;
        for (int i = 0; array.length > i; i++) {
            if (array[i] > max && array[i] % 2 == 0) {
                max = array[i];
                isEvenPresent = true;
            }
        }
        if (!isEvenPresent) {
            System.out.println("\nTask 7. Массив не має парних чисел");
            System.exit(0);
        }
        System.out.print("\nTask 7. Найбільше парне число в массиві:  " + max);
    }

    /*
       8. Вивести значення в масиві в яких є парні індекси
    */
    public static void evenIndexArray() {
        int array[] = {5, 8, 12, 18, 54, 84, 91, 35, 17, 37};
        System.out.println("\nTask 8. Значення парних індексів массива: ");

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
