package DAY3;

import java.util.Scanner;

public class hello {
    public static void main(String[] args){

        //if, if-esle, if-else-if ladder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num under 8:");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println("sunday");  
        }
        else if(num == 2){
            System.out.println("monday");
        }
         else if(num == 3){
            System.out.println("tuesday");
        } 
        else if(num == 4){
            System.out.println("wednesday");
        }
        else if(num == 5){
            System.out.println("thursday");
        }
        else if(num == 6){
            System.out.println("friday");
        }
        else if(num == 7){
            System.out.println("saturday");
        }
        else{
            System.out.println("Invalid number");
        }


        //Ternary operator:same as if-else but in shorter version
        //condition ? valueifTrue : valueifFalse;
        int num1 = 100;
        String age = (num1 > 18)?"eligible for vote":"not eligible for vote";
        System.out.println(age);


        //Switch statement
        Scanner scc = new Scanner(System.in);
        System.out.println("enter the num under 8:");
        int Day = scc.nextInt();

        switch (Day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wensday");
                break; 
            case 4:
                System.out.println("thursday");
                break;
             case 5:
                System.out.println("friday");
                break;
             case 6:
                System.out.println("sat");
                break;            
            default:
                System.out.println("Invalid number?");
                break;
        }
    }
}
