import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Adult or Not Adult
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        //Even Or Odd
        int number = sc.nextInt();

        if(number%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //a=b, a>b, a<b
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater.");
        }
        else{
            System.out.println("a is lesser.");
        }

        //Switch Button
        int button = sc.nextInt();

        switch (button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid");
        }
    }
}