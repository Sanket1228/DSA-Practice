import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BasicMaths {

    public static int countDigit(int num){
        int count = 0;

        while(num > 0){
            count = count + 1;
            num = num / 10;
        }
        return count;
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        int lastDigit;
        while(num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            rev = rev * 10 + lastDigit;
        }

        return rev;
    }

    public static boolean checkPalindrome(int num) {
        boolean isPalindrome = false;
        int numCopy = num;
        int lastDigit;
        int rev = 0;
        while(num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            rev = rev * 10 + lastDigit;
        }
        if(numCopy == rev) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static boolean isArmstrongNo(int num) {
        boolean isArmstrong = false;
        int numCopy = num;
        int lastDigit;
        int sum = 0;
        while(num > 0) {
            lastDigit = num % 10;
            num = num / 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
        }
        if(sum == numCopy){
            isArmstrong = true;
        }
        return isArmstrong;
    }

    public static void printDivisors(int num) {
        Set<Integer> st = new TreeSet<>();

        for (int i = 1; i*i <= num; i++) {
            if(num % i == 0) {
                st.add(i);
                if(num / i != i) {
                    st.add(num/i);
                }
            }
        }

        for (Integer res: st){
            System.out.print(res + " ");
        }
    }

    public static boolean isPrime(int num) {
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0){
                count = count + 1;
                if(num / i != i) {
                    count = count + 1;
                }
            }
        }
        if (count == 2){
            isPrime = true;
        }
        return isPrime;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        System.out.println("Output ----- " + isPrime(input));

    }
}
