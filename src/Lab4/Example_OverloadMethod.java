package Lab4;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

public class Example_OverloadMethod {
    public static int findMax(int x,int y){
        return (x>y)?x:y;

    }


        //if(x>y)


    public static double findMax (double x, double y){
        return (x>y)? x:y;
    }

    //
    public static void main(String[] args) {
        int max = findMax(5, 10);
        System.out.println("Maximun is"+max);
        double max2 = findMax(5.0, 10.0);
        System.out.println("Maximun(2) is"+max2);

    }
}
