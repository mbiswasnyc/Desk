package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Fibonacci number you want to see: ");
        int count = scanner.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        for(int i=0; i<count; ++i ){
            System.out.println(n3=n1+n2);
            n1=n2;
            n2=n3;
        }
    }
}
