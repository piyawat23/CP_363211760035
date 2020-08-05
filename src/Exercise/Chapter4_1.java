package Exercise;

import java.util.Scanner;

public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);



        System.out.println("num 1:");
        int num1 = scanner.nextInt();
        System.out.println("num2:");
        int num2 = scanner.nextInt();
        System.out.println("num3:");
        int num3 = scanner.nextInt();
        System.out.println("num4:");
        int num4 = scanner.nextInt();
        System.out.println("num5:");
        int num5 = scanner.nextInt();
        System.out.println("num6:");
        int num6 = scanner.nextInt();
        System.out.println("num7:");
        int num7 = scanner.nextInt();
        System.out.println("num8:");
        int num8 = scanner.nextInt();
        System.out.println("num9:");
        int num9 = scanner.nextInt();
        System.out.println("num10:");
        int num10 = scanner.nextInt();

        int Toal = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        int avg = Toal/10;




        System.out.println("num :"+Toal);
        System.out.println("avg:"+avg);



    }
}
