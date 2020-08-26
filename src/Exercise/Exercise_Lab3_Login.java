package Exercise;

import javafx.concurrent.ScheduledService;

import java.util.Scanner;

public class Exercise_Lab3_Login {

    public static void main(String[] args) {

        String username = "mit212";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        int count = 0;
        do {
            System.out.print("Username: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();
            if (u.equals(username) && p.equals(password)) {
                System.out.print("Weicome, to MT System.");
                break;
            } else {
                System.out.println("Userame or Password not corected.");
                count++;

                if (count == 3) {
                    System.out.println("Your account has been locked.Please, contact admin.");
                }

            }

        } while (count < 3);
    }
}
