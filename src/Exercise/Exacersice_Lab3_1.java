package Exercise;

import java.util.Scanner;

public class Exacersice_Lab3_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        for (int i = 0; i <=12 ; i++) {
            System.out.println(num +"x " + i + " = " +(num*i));

        }

    }
}
