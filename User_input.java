package p4n01;
import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        String n;
        System.out.println("plz enter the number");
        a=sc.nextInt();
        System.out.println("plz enter the number2");
        b=sc.nextInt();
        System.out.println("plz enter name");
        n=sc.next();

        System.out.println("my name is :- "+n);
        System.out.println("my number is :-"+a+b);
    }
}
