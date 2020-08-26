package Lab4;

public class Examqle_BasicMethod {
    public static int C(int x , int y){
        //statement
        System.out.println("Hello c.");
        int sum = x+y;
        return sum;


    }//C
    public static void B(int x){
        System.out.println("Hello B"+x);

        //Statement


    }//B
    public static void main(String[] args) {
        System.out.println("Hello Main.");
        //call A()
        A();
        A();
        A();
        //call B()
        B(200);
        //call C()
        int num = C(300,500); //800
        System.out.println(num);
        System.out.println(C(30, 50));

    }//main

    public static void A (){
        //statement
        System.out.println("Hello A.");
        B(500);

    }//A
}//class
