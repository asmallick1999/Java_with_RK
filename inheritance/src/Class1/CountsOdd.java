package Class1;

import java.util.Scanner;

public class CountsOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int counter=0;
        while(low<=high){
            if(low%2!=0){
                counter++;
            }
            low++;
        }
        System.out.println(counter);
    }
}
