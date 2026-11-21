package DAY2;

import java.util.Scanner;

public class hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second num:");
        int secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("The sum of two numbers is :" + sum);


        sc.close();  //closing the scanner object to avoid memory/resource leak
    }
}