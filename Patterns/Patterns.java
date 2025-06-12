import java.sql.SQLOutput;
import java.util.Scanner;

public class Patterns {

    public static void printPattern1(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++){
                if(i == 0 || i == num - 1) {
                    System.out.print("*");
                }
                else if(j == 0 || j == num - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printPattern2(int num){

        //[5, 1, 5]
        //[4, 2, 4]
        //[3, 3, 3]
        //[2, 4, 2]
        //[1, 5, 1]
        //[0, 6, 0]

        for(int i = 1; i <= num; i++){
            // spaces
            for (int j = 0; j < num - i; j++){
                System.out.print(" ");
            }
            // number
            for (int j = 0; j < i; j ++){
                System.out.print(i + " ");
            }
            // spaces
            for (int j = 0; j < num - i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
    public static void printPattern3(int num){
        for(int i = 1; i <= num; i ++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printPattern4(int num){
        for(int i = 1; i<= num; i++){
            for (int j = 1; j <= (num + 1) - i; j ++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void printPattern5(int num){
        int n = 1;
        for (int i = 0; i<num; i++){
            for (int j = 0; j < i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
    public static void printPattern6(int num){
        for (int i = 0; i < num; i++){
            for (int j = 0; j < i; j++) {
                if ((i+j) % 2 == 0){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void printPattern7(int num){
        /*
        * [5, 1 ,5]
        * [4, 3, 4]
        * [3, 5, 3]
        * [2, 7, 2]
        * [1, 9 ,1]
        * [0, 11, 0]
        * */

        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }
            // number
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // spaces
            for (int j = 1; j <= num - i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public static void printPattern8(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPattern9(int num) {
        for (int i = 1; i <= num; i++) {

           for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner myScnObj = new Scanner(System.in);

        int num = myScnObj.nextInt();
        printPattern9(num);
    }
}
