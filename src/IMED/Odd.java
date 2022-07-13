// 2. Write a program to read an integer number and check whether it is odd.

package IMED;

import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 1) {
            System.out.println("IT IS ODD!!!");
        }
        else{
            System.out.println("NOT AN ODD NUMBER!!!");
        }
    }
}
