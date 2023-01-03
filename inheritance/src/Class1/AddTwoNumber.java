package Class1;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the test case number : ");
        int T = sc.nextInt();
        for(int i=1;i<=T;i++){
//            System.out.println("Your "+i+" Test case");
//            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();
//            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();
            int total = num1+num2;
            System.out.println(total);
        }
    }
}
