import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        System.out.print("Enter the third number : ");
        int third = input.nextInt();

        if(first>second && first>third){
            System.out.println("First number is gretest number ");
        }
        else if(second>first && second>third){
            System.out.println("Second number is the gretest number");
        }
        else{
            System.out.println("Third number is the gretest number ");
        }
    }
}
