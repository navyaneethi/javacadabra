import java.lang.System;
import java.util.Scanner;

class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+ age);
        System.out.println("Address is "+ address);
    }
}
