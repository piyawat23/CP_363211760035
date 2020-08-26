package Lab2;

import sun.text.resources.CollationData;

import java.util.Scanner;

public class BasicInput {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter you name ?: ");
            String name = scanner.nextLine();

            System.out.println("Your name is "+name);

            System.out.print("Enter you old: ");
            int old = scanner.nextInt();
            System.out.println("Enter your old" +old);

            System.out.print("Enter you nick name ?: ");
            String nickName = scanner.nextLine();
            System.out.println("Your nick name is "+nickName);
}


}
