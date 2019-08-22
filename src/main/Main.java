package main;
/**
 * @author parakhtiwari
 * @version 1.0
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        String s;
        System.out.println("Enter the name");
        s = val.next();
        System.out.println("welcome, " + s);
    }
}
