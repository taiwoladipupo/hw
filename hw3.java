package arrays;
import java.lang.Math;
import java.util.Arrays;
import com.sun.jdi.DoubleValue;

public class hw3 {



}
 class Main {

     static double[] toPower(int size, int power) {
         double [] result = new double[size];

         for (int i = 0; i < size; i++) {
             result[i] = Math.pow(Double.valueOf(i),Double.valueOf(power));

         }

         return result;


     }

    public static void main(String[] args) {

        int size = 4;
        int power = 2;
        
        double [] result = toPower(size,power);

        System.out.println("result is " + Arrays.toString(result));
     }
}
