import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        SumOfInteger obj1 = new SumOfInteger();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        int result = obj1.sum(num1);
        System.out.println(result);
    }
    public int sum(int num1){
        int mod, k=0;
        while (num1>0) {
            mod = num1 % 10;
            k = 10 * mod;
            num1 = num1 / 10;
        }
        return k;
    }
    public SumOfInteger(){
        System.out.println("Inside Constructor");
    }
}
