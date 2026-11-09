import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wielkosc = 6;
        for(int i = 1; i <= wielkosc; i++){

            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for( int i = 1 ; i<= wielkosc; i++){
            for(int j = 1; j <= wielkosc - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
