// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            for(int j = 0; j< 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int k = 1; k<=4;k++){
            for(int l = 1; l<= 5; l++){
                if(k == 1 || k == 4 || l == 1 || l == 5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int k = 1; k<=4;k++){
            for(int l = 1; l<= k; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int k = 4; k>=1;k--){
            for(int l = 1; l<= k; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("-------------");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("-------------");
        int number = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        System.out.println("-------------");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }
}