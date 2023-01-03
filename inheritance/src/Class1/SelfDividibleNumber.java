package Class1;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfDividibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fast = sc.nextInt();
        int last = sc.nextInt();
        int f = 0,n,m;
        ArrayList<Integer> listItem = new ArrayList<>();
        while(fast<=last){
            m=fast;
            n=fast;
            while(n!=0) {
                int k = n % 10;
                if (k == 0) {
                    f = 0;
                    break;
                }
                if (m % k == 0) {
                    f++;
                } else {
                    f = 0;
                    break;
                }
                n = n / 10;
            }
            if(f>0){

                listItem.add(fast);
            }
            fast++;

        }
        System.out.println(listItem);

    }
}
