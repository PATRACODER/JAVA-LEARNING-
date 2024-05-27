import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        int a =0;
        int b =1;
        for(int i=2;i<=n;i++){
            int sum = a+b;
            a =b;
            b = sum;
        }
        System.out.println("The Nth fabocci number is : " + b);
    }
}
