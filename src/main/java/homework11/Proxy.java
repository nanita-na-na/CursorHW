package homework11;

import java.util.Scanner;

public class Proxy implements AdapterNumber {
    @Override
    public void romanToArabic(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you sure, enter YES ");

        if (sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.println(RomanNumbers.valueOf(input).getValue());
        } else {
            System.out.println("Try again");
        }
    }
}
