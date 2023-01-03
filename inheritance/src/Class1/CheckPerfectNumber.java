package Class1;

import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,add=0,num=n/2;
        while(i<=num){
            if(n%i==0){
                add = i + add;
            }
            i++;
        }
        if(n==add){
            System.out.println(true);
        }
    }
}
