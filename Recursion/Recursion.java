import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Recursion {

    public static void printNTimes(int n, String name) {
        if(n == 0) {
            return;
        }
        System.out.println(name + " ");
        printNTimes(n - 1, name);
    }

    public static void print1ToN(int n){
        if(n == 0){
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void printNto1(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    public static int sumOfNNumbers(int n) {
        /*
         *  f(4)  -> 2 + 2 = 4
         *  f(3)  -> 1 + 1 = 2
         *  f(2)  -> 0 + 1 = 1
         *  f(1) -> 1
         * */
        if( n == 1 ){
            return 1;
        }
        return n + sumOfNNumbers(n-1);
    }

    public static int factorialOfNNumbers(int n) {
        /*
         * f(4)
         * f(
         * */
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorialOfNNumbers(n-1);
    }

    public static void reverseArray(int start, int end, ArrayList<Integer> arr){
        if(start >= end){
            return;
        }
        Collections.swap(arr, start, end);

        reverseArray(start + 1, end - 1, arr);
    }

    public static boolean checkPalindromeString(int start, int end, String s) {
        if(start >= end) {
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return checkPalindromeString(start + 1, end - 1, s);
    }

    // Not understood completely will work on this independently
    public static int checkFibonacciNumber(int n) {
        if(n <= 1){
            return n;
        }

        return checkFibonacciNumber(n - 1) + checkFibonacciNumber(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        String name = sc.nextLine();
//        printNto1(n);
//        System.out.println(factorialOfNNumbers(n));
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            arr.add(sc.nextInt());
//        }
//        reverseArray(0, arr.size() - 1, arr);
//
//        for(Integer num: arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println(sumOfNNumbers( n));
//        String s = sc.nextLine();
//        System.out.println(checkPalindromeString(0, s.length() - 1, s));
        System.out.print(checkFibonacciNumber(n) + " ");

    }
}
