package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name ");
            String name = scanner.nextLine();
            //scanner.nextLine();
            System.out.println("your city");
            String city = scanner.nextLine();

            int age = 2022- yearOfBirth;
            if(age>= 0 && age <= 100){
                System.out.println("Name: "+ name+" Age: "+age+" City: "+city);
            }else {
                System.out.println("Invalid Birth year");
            }
        }else{
            System.out.println(" Unable to parse year of birth");
        }
        scanner.close();
    }
}
