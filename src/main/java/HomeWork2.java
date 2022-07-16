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
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

/*
    2. Вивести в консолі числа від 10 до 0
*/
    public static void numbersTenToNull() {
        int num = 11;
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
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) random.nextInt();
            System.out.print(array[i] + " ");
        }
    }

/*
  4. Знайти найбільше число в масиві
*/

    public static void maxNumberInArray() {
        int[] array = {1, 2, 3, 4, 5, 17, 6, 7, 8, 9, 10, 11, 12};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.print(max + " ");
    }


/*
    5. Знайти найменше число в масиві
*/
    public static void minNumberInArray() {
        int[] array = {1, 2, 3, 4, 5, 17, 6, 7, 8, 9, 10, 11, 12};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.print(min + " ");
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
        System.out.print("Середнє арифметичне чисел: " + sum / array.length);
    }

/*
   7. Знайти найбільше парне число в масиві
*/
    public static void highestEvenNumberInArray() {
        int array[] = {5, 8, 12, 18, 54, 84, 91, 35, 17, 37};
        int arrayEven[] = new int[10];
        int max = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[i] = array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, arrayEven[i]);
        }
        System.out.print(max + " ");
    }

/*
   8. Вивести значення в масиві в яких є парні індекси
*/

    public static void evenIndexArray() {
        int array[] = {5, 8, 12, 18, 54, 84, 91, 35, 17, 37};

        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

    }
}
