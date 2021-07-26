                package com.tts.project;

                import java.util.ArrayList;
                import java.util.List;
                import java.util.Scanner;

                public class AddressList {
                /*Static scanner object*/
                    static Scanner input = new Scanner(System.in);

                    /* An list that access Entry insatnces*/
                    static List<Entry> entryList = new ArrayList<Entry>();


                    public static void main(String[] args) {

                        //create a response from the user
                        int response;

                        /* An object for the AddressList class*/
                        AddressList addressList = new AddressList();


                        do {
                            System.out.println("========== ========== Welcome ** Address Book");
                            System.out.println("1, Add an entry");
                            System.out.println("2, Remove an entry");
                            System.out.println("3, Search for a specific entry");
                            System.out.println("4, Print Address Book");
                            System.out.println("5, Delete Book");
                            System.out.println("0, Quit");
                            System.out.println("Please choose what you would like to do with the database:");

                            response = input.nextInt();

                            switch (response) {
                                case 1:
                                    Entry entry = new Entry();

                                    System.out.print("Please enter the firstName: ");
                                    entry.setFirstName(input);

                                    System.out.println("Please enter the lastName:");
                                    entry.setLastName(input);

                                    System.out.println("Please enter the phone number:");
                                    entry.setPhoneNumber(input);

                                    System.out.println("Please enter  the email address");
                                    entry.setEmailAddress(input);

                                    entryList.add(entry);
                                    System.out.println("Added new entry!");

                                    break;


                                case 2:

                                    System.out.println("Please enter the email address you want to delete:");
                                    String email = input.next();


                                    if (entryList.contains(email)) {
                                        entryList.remove(email);
                                        System.out.println("Deleted Successfully");
                                    } else {
                                        System.out.println("Delete unsuccessful");
                                    }
                                    break;
                                case 3:

                                        int answer;
                                    do {

                                        System.out.println("1, First Name");
                                        System.out.println("2, Last Name");
                                        System.out.println("3, Phone Number");
                                        System.out.println("4, Email Address");
                                        System.out.println("Chose a search type:");


                                       answer = input.nextInt();
                                        switch (answer) {
                                            case 1:
                                                if (answer == 1) {
                                                    System.out.println("Please enter your search:");
                                                    String answer2 = input.next();
                                                    Entry check = addressList.search(answer2);
                                                    if (check != null){
                                                        System.out.println(" "+ check.getFirstName() + "\n" + check.getLastName() +  "\n" + check.getPhoneNumber()  + " \n" + check.getEmailAddress());
                                                    }
                                                    else{
                                                        System.out.println("No such Person");
                                                    }
                                                }

                                                break;

                                            case 2:
                                                if (answer == 2) {
                                                    System.out.println("Please enter your search:");
                                                    String answer3 = input.next();
                                                    Entry check = addressList.search(answer3);
                                                    if (check != null){
                                                        System.out.println( "" + check.getLastName().toString());
                                                    }
                                                    else {
                                                        System.out.println("No Such Person");
                                                    }
                                                }
                                                break;

                                            case 3:
                                                if (answer == 3) {
                                                    System.out.println("Please enter your search:");
                                                    String answer4 = input.next();
                                                    Entry check = addressList.search(answer4);
                                                    if (check != null){
                                                        System.out.println(answer4 + "" + check.getPhoneNumber());
                                                    }
                                                    else{
                                                        System.out.println("No Such person!");
                                                    }
                                                }
                                                break;
                                            case 4:
                                                if (answer == 4) {
                                                    System.out.println("Please enter your search:");
                                                    String answer5 = input.next();
                                                    Entry check = addressList.search(answer5);
                                                    if (check != null){
                                                        System.out.println(answer5 + "" + check.getEmailAddress());
                                                    }
else    {
                                                        System.out.println("No such email!");
}
                                                }
                                                break;

                                        }
                                    } while (answer != 0);
                                    System.out.println("Innvalid Selection!");

                                    break;
                                case 4:
                                    for (Entry entry2 : entryList) {
                                        System.out.println(entry2.toString() + "" + entry2.getFirstName() + "" + entry2.getLastName() + "" + entry2.getPhoneNumber() + "" + entry2.getEmailAddress());
                                    }
                                    break;
                                case 5:
                                    Entry entry2 = addressList.clear(entryList);

                                    if (entry2 == null) {
                                        System.out.println("Address book cleared!");
                                    }
                                    break;

                                case 6:
                                    System.exit(0);
                                    break;

                                default:
                                    System.out.println("This is not a valid Menu Option! Please Select Another");
                                    break;

                            }
                        }
                            while (response != 0) ;
                            System.out.println("Thank you for using the Address Book!");


                    }



                    public Entry clear(List<Entry> entryList) {
                        entryList.clear();
                        return null;
                    }

                    private boolean remove(String email) {
                        boolean result = entryList.remove(email);
                        if (result == true) {
                            System.out.println("Deleted the following entry:" + result);

                        }
                        return result;
                    }

                    private boolean add(Entry entry) {
                        entryList.add(entry);
                        return true;
                    }






                public Entry search (String name) {
                       Entry en = null;
                       for (Entry e : entryList){
                           if (e.getFirstName().equals(name))
                               en = e;

                           if (e.getLastName().equals(name))
                               en = e;

                           if (e.getPhoneNumber().equals(name))
                               en = e;
                           if (e.getEmailAddress().equals(name))
                               en = e;
                       }
                       return en;
                    }
                    }

