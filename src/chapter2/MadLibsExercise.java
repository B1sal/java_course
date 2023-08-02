package chapter2;

import java.util.Scanner;

public class MadLibsExercise {
    public static void main(String[] args) {
        System.out.println("adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        System.out.println("Season of the year");
        String season = scanner.next();

        System.out.println("whole number");
        int cupNum = scanner.nextInt();
        scanner.close();

        System.out.println("on a " + adjective + " " + season + " day, I drink a minimum of " + cupNum + " cups of coffee.");

    }
}
