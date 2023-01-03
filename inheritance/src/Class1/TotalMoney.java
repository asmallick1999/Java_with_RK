package Class1;

import java.util.Scanner;

public class TotalMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int i = 1,f=0;
        while(i<=day){
            f=f+i;
        }
        System.out.println(f);
    }
}
