import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class HomeWork2 {

    public static void main(String[] args) {
       // randomCharArray();
        //numbersTenToNull();
        maxNumberInArray();
    }

/*
     1. Створити, а потім заповнити масив випадковими парними числами.
*/

    public static void randomPairsInArray() {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {

            int r = random.nextInt(80);
            if (r % 2 == 0) {
                array[i] = r;
            }
            //   System.out.print(array[i] + " ");
        }
    }

    /*
         2. Вивести в консолі числа від 10 до 0
    */
    public static void numbersTenToNull() {
        int num = 11;
        while (num > 0) {
            num--;
            System.out.println(num);
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
            System.out.println(array[i] + " ");
        }
    }

/*
  4. Знайти найбільше число в масиві
 */

    public static void  maxNumberInArray(){
        int [] array = {1, 2, 3, 4, 5, 17, 6, 7, 8, 9, 10, 11,12};
        int max = array[0];
        for(int i =1; i < array.length; i++){
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }



}
