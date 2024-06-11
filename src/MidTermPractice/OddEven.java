package MidTermPractice;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        if(num>0 && num%2==0){
            System.out.println("Its an Even Number.");
        }else if(num>0 && num%2!=0){
            System.out.println("Its an Odd Number.");
        }
    }
}
