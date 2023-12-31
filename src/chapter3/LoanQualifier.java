package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary here:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years employed with your current employer");
        int years = scanner.nextInt();
        scanner.close();

        if(salary>=requiredSalary){
            if(years>=requiredYearsEmployed){
                System.out.println("Congrats! You are qualified for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job for " +
                      requiredYearsEmployed + " years");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
        }

    }
}
