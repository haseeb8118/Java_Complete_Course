import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int counter = 0; counter <100; counter++){
            System.out.println("Hello World");
        }

        System.out.println("---------------------------------");
        for(int i = 0; i <100; i++){
            System.out.println(i);
        }

        System.out.println("---------------------------------");
        int j = 0;
        while(j < 11){
            System.out.println(j);
            j = j+1;
        }

        System.out.println("---------------------------------");
        int k = 0;
        do {
            System.out.println("Hello World");
            k = k + 1;
        }while (k < 11);

        System.out.println("---------------------------------");
        //Print the sum of first n natural numbers.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println("---------------------------------");
        //Print table on user input
        int tbl = sc.nextInt();

        for(int l=1; l<=10;l++){
            System.out.println(tbl+" x "+ l +" = " + tbl*l);
        }
    }
}