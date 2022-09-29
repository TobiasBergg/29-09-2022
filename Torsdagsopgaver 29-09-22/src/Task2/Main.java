package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Please type your age");
        int age = scanner.nextInt();
        System.out.println(age);
        int x = 67-age;
        System.out.println("You can retire in "+ x +" years");

    }
}
