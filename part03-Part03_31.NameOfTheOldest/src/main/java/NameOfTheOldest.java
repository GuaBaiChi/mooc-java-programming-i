//Write a program that reads names and ages from the user until 
//an empty line is entered. 
//The name and age are separed by a comma.

//After reading all user input, the program prints the name of the oldest person. 
//You can assume that the user enters at least one person, and 
//the that one of the users is older than the others.


import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        String oldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            int age = Integer.valueOf(parts[1]);
            
            if (age > largest) {
                largest = age;
                oldest = parts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + oldest);
    }
}
