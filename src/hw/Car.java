            package hw;

            public class Car {
                private String modelName;
                private int year;
                private String color;

                //constructor 1
                public Car() {
                    modelName = "";
                    year = 0000;
                    color = "";
                }
                public Car(String modelName, int year){


                }
                public Car(String modelName, int year, String color){


                }

                //getModelName Method
                public String getModelName(){
                    return modelName;
                }

                //getYear Method
                public int getYear(){
                    return year;

                }

                //getColor Method
                public  String getColor(){
                    return color;
                }

                public  boolean isNewCar(){
                    return year >= 2020;
                }

                public String toString() {
                    return "Car{" +
                            "make='" + modelName + '\'' +
                            ", color='" + color + '\'' +
                            ", manufacturingYear=" + year +
                            '}';
                }
            }