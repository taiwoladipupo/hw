package hw;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calculator myCalculator = new Calculator();
        myCalculator.division(4,6);
        myCalculator.square(4);
        myCalculator.add(4,6);
        myCalculator.subtraction(4,6);

        System.out.println(myCalculator.division(3,6));
        System.out.println(myCalculator.square(4));
    }
}
