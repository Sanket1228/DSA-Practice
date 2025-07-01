import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> evenNumbers(int [] arr){
        List<Integer> evens = Arrays.stream(arr).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
        return  evens;
    }

    public static Map<String, Long> countFrequency(List<String> fruits) {
        return fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void removeNull() {
        List<String> words = Arrays.asList("Sanket", null, "Anish", "Shivam", null);

        List<String> notNull = words.stream()
                .filter(Objects::nonNull)
                .toList();

        System.out.println(notNull);
    }

    public static void sortListByWordsLength() {
        String[] names = {"Rahul", "Sai", "Om", "Sanket", "Harishchandra"};

        List<String> sortedList = Arrays.stream(names)
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println(sortedList);
    }

    public static void convertToUpperCase() {
        String[] names = {"sanket", "yash", "swpanil"};

        System.out.println(
                Arrays.stream(names)
                        .map(String::toUpperCase)
                        .toList()
        );
    }

    public static void printFirstNonRepeatedCharacter() {
        String input = "programming";

        Optional<Character> result = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();

        System.out.println(result.orElse(null));
    }

    public static void findMaxInList() {
        List<Integer> nums = Arrays.asList(1,45, 786, 31, 42, 75);

        System.out.println(
                nums.stream()
                        .max(Integer::compare).orElse(-1)
        );
    }

    public static void main(String[] args) {
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(evenNumbers(arr));

//            List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana");
//        System.out.println(countFrequency(fruits));

//        removeNull();

//        sortListByWordsLength();
//        printFirstNonRepeatedCharacter();
        findMaxInList();
    }
}
