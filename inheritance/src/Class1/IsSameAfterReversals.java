package Class1;

import java.util.Scanner;

public class IsSameAfterReversals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int m = number;
        int k,reverseValue=0;
        while(m!=0){
            k = m%10;
            m = m/10;
            reverseValue = reverseValue*10 + k;
        }
        System.out.println(reverseValue);
        m = reverseValue;
        reverseValue=0;
        while(m!=0){
            k = m%10;
            m = m/10;
            reverseValue = reverseValue*10 + k;
        }
        System.out.println(reverseValue);
    }
}
