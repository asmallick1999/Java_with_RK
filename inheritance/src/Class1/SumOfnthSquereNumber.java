package Class1;

import java.util.Scanner;

public class SumOfnthSquereNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //********* Using Loop *****
//        int i=1,k=0;
//        while(i<=n){
//            k += i*i;
//            i++;
//        }
//        System.out.println(k);

        // Formula
        int sum = n*(n+1)*(2*n+1)/6;
        System.out.println(sum);
    }
}
