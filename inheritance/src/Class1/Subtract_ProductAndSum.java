package Class1;

import java.util.Scanner;

public class Subtract_ProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dv,add=0,mul=1;
        while(n>0){
            dv= n%10;
            System.out.println("dv : "+dv);
            n = n/10;
            mul *= dv;
            System.out.println("mul : "+mul);
            System.out.println("add 1st : "+add);
            add += dv;
            System.out.println("add 2nd : "+add);
        }
        int result = mul-add;
        System.out.println(result);
    }
}
