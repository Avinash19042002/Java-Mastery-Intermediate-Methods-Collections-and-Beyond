import java.util.Scanner;
public class Assignment1
{
    public static long factorial(long n){
        if(n==0L)return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number n(<=20) for which you want to calculate factorial: ");
        Scanner scanner = new Scanner(System.in);
        long n= scanner.nextLong();
        System.out.println("Factorial of "+n+ " is: "+factorial(n));
    }
}