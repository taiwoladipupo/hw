package arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i < 6; i++){

            sum +=i;
        }
        System.out.println("The sum of the array is " + sum);
    }
}
