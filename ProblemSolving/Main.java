import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static String reverseString(String str) {
//        StringBuilder reverseStr = new StringBuilder("");
        String[] words = str.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString();
    }

    public static boolean isPalindromeNumber(int num) {
        int numCopy = num;
        int reverseNum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            reverseNum = reverseNum * 10 + lastDigit;
        }
        return reverseNum == numCopy;
    }

    /*
    *  s a n k e t
    *  i
    * */
    public static boolean isPalindromeString(String str) {
        StringBuilder strCopy = new StringBuilder(str.toLowerCase());
        for (int i = 0; i < strCopy.length(); i++){
            if(strCopy.charAt(i) != strCopy.charAt((strCopy.length() - i) - 1)){
                return false;
            }
        }
        return true;
    }

    public static void printFizzBuzz(int n ) {
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0 & i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
             else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void missingNumberInArray(int[] arr){
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }
        System.out.println(expectedSum - actualSum);
    }

    public static void xorMissingNumberInArray(int[] arr) {
        int xor = 0;
        int n = arr.length;

        for(int i = 0; i <= n; i++){
            xor ^= i;
        }

        for (int num: arr){
            xor ^= num;
        }

        System.out.println(xor);
    }

    public static void frequencyInString(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> mp: map.entrySet()){
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }

    public static String reverseStringUsingRecursion(String str) {
        if(str.isEmpty()){
            return str;
        }
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public static boolean checkAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

//        char[] arr1 = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        return Arrays.equals(arr1, arr2);

//        int[] count = new int[26];
//        for (int i = 0; i < str1.length(); i++){
//            count[str1.charAt(i) - 'a']++;
//            count[str2.charAt(i) - 'a']--;
//        }

//        for(int num: count){
//            if (num != 0) return false;
//        }
//        return true;

        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch: str1.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch: str2.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (Integer count: countMap.values()){
            if (count != 2) return  false;
        }

        return true;
    }

    public static void removeDuplicateCharaters(String str) {
        Set<Character> chSet = new LinkedHashSet<>();
        for (char ch: str.toLowerCase().toCharArray()){
            chSet.add(ch);
        }
        for (char ch: chSet){
            System.out.print(ch);
        }

    }

    public static void main(String[] args) {
//        System.out.println(reverseString("Sanket is good boy"));
//        System.out.println(isPalindromeNumber(1234));
//        System.out.println(isPalindromeString("Nayan"));
//        int[] arr = { 3, 0 ,1 };
//        xorMissingNumberInArray(arr);
//        System.out.println(reverseStringUsingRecursion("Sanket"));
//        System.out.println(checkAnagrams("tea", "eat"));
            removeDuplicateCharaters("Ssankkket");
    }
}
