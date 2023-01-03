package Class1;

import java.util.Scanner;

public class PalindromOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            number = number*(-1);
            System.out.println(number);
        }
        int num2 = number; //212
        int vs = 0;
        int result =0;
        while(num2>0) {
            vs = num2 % 10; //2
            result = result * 10 + vs;
            num2 = num2 / 10;
        }
        if(result==number){
            System.out.println("This is palindrom number");
        }
        else {
            System.out.println("This is not a palindrom number");
        }
    }
}
