                package hw;

                public class Calculator {
                    private int num1;
                    private int num2;


                    //add Method
                    public int add(int num1, int num2) {
                        int sum = num1 + num2;
                    return sum;
                    }
                    //subtraction Method
                    public  int subtraction(int num1, int num2){

                        return num1 - num2;
                    }
                    //Multiplication Method
                    public int multiplication(int num1, int num2){

                        return num1 * num2;
                    }
                    //Division Method
                    public int division(int num1, int num2){
                        if (num1 < num2){
                            int temp = num1;
                            num1 = num2;
                            num2 = temp;
                        }
                        return num1 / num2;
                    }
                    //Square Method
                    public double square(int num1){
                        return num1 * num1;
                    }
                }
