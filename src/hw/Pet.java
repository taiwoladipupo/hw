            package hw;

            public class Pet {

                private String name;
                private int age;
                private String type;
                private String location;

                //constructor 1
                public Pet() {
                    name = "";
                    age = 0;
                    type = "";
                    location = "";
                }

                //constructor 2
                public Pet(String name, int age, String type, String location) {
                    this.name = name;
                    this.age = age;
                    this.type = type;
                    this.location = location;

                }

                //getName Method
                public String getName() {
                    return name;
                }

                //getAge Method
                public int getAge() {
                    return age;
                }

                //getType Method
                public String getType() {
                    return type;
                }

                //setName Method
                public void setName(String name){


                }

                //setAge Method
                public void setAge(int age){

                }

                //setLocation
                public void setLocation(String location){

                }
            }
