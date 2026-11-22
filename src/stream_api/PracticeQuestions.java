package stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeQuestions {

    public static void main(String[] args) {

        //duplicate elements in a list
        List<Integer> arr = Arrays.asList(12, 12, 23, 45, 21, 12, 34, 34);

        Set<Integer> duplicates = arr.stream().filter((x) -> Collections.frequency(arr, x) > 1).collect(Collectors.toSet());
        System.out.println("duplicates :" + duplicates);

        // Unique elements in a list
        Set<Integer> uniques = arr.stream().filter((x) -> Collections.frequency(arr, x) == 1).collect(Collectors.toSet());
        System.out.println("uniques :" + uniques);

        // Second-highest number
        List<Integer> list = Arrays.asList(12, 45, 89, 33, 221, 232);
        Optional<Integer> secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighest);

        //Longest String in list
        List<String> listString = Arrays.asList("Ankit", "Kumar", "Singh", "DilipKumar");
        String s = listString.stream().max(Comparator.comparing(String::length)).orElse("");
        System.out.println(s);

        //find kth smallest number
        List<Integer> numList = Arrays.asList(122, 45, 89, 33, 221, 232);
        int k = 3;
        Integer i = numList.stream().sorted().skip(k - 1).findFirst().orElse(-1);
        System.out.println(i);

        //sorting in descending order
        List<Integer> numbers = Arrays.asList(122, 45, 89, 33, 221, 232);
        List<Integer> sortedInDecendingOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedInDecendingOrder);

        //Remove null values
        List<String> stringsList = Arrays.asList("Ankit", null, "Singh", null);
        List<String> notNullStrings = stringsList.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(notNullStrings);


    }

}
