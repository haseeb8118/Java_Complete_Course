import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");

        System.out.println("----------------------------------");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        System.out.println("----------------------------------");
        String name ="Abdul Haseeb";
        int a = 5;
        int b = 10;
        int sub = a-b;
        System.out.println(sub);

        System.out.println("----------------------------------");
        Scanner sc = new Scanner(System.in);
        //String inputName = sc.next(); //it prints first word
        String inputName = sc.nextLine(); //it prints first word
        System.out.println(inputName);

        System.out.println("----------------------------------");
        Scanner cs = new Scanner(System.in);
        int c = cs.nextInt();
        int d = cs.nextInt();
        int sum = c + d;
        System.out.println(sum);
    }
}