package forLoopExamples;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int factorial = 1;

        for(int i=1; i <= num; i++){
            factorial*= i;
        }


        System.out.println("The forLoopExamples.Factorial is: " +factorial);
    }
}