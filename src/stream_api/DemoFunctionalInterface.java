package stream_api;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class DemoFunctionalInterface {

    public static void main(String[] args) {

        //Predicate is Functional interface where test method return boolean value.
        //Predicate can hold a condition.
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(44));

        Predicate<String> isWordStartWithA = (x) -> x.toLowerCase().startsWith("A");
        Predicate<String> isEndingWithT = (x) -> x.toLowerCase().endsWith("T");
        Predicate<String> and = isWordStartWithA.and(isEndingWithT);
        System.out.println(and.test("Ankit"));

        //Function is functional interface where apply method does some operation.
        Function<Integer, Integer> doubleIt = (x) -> 2 * x;
        Function<Integer, Integer> tripleIt = (x) -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20)); // andThen applies doubleIt first.
        System.out.println(doubleIt.compose(tripleIt).apply(30)); // compose applies tripleIt first.
        System.out.println(doubleIt.apply(100));
        //Identity is a static method return the same value as it takes in input.
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(23);
        System.out.println(res);


        //Consumer is Functional interface which accept single input argument but return no result
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(90);

        List<Integer> arr = Arrays.asList(12,23,44,66);
        Consumer<List<Integer>> printList = x -> {
            for(int i : x){
                System.out.println(i);
            }
        };
        printList.accept(arr);

        //Supplier is Functional Interface which does not accept any input but gives result.
        Supplier<String> giveString = () -> "Hello  Supplier to the World";
        System.out.println(giveString.get());


        // There are some more functional interfaces which takes two inputs
        BiPredicate<Integer, Integer> isSumEven = (x,y) -> (x+y) % 2 == 0;
        System.out.println(isSumEven.test(10,10));

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        biConsumer.accept(12,13);

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x+y).length();
        System.out.println(biFunction.apply("Ankit", "Shiva"));

        //Method Reference
        List<String> studentList = Arrays.asList("Ankit", "Karthik", "Ravi Raman","Deepak");
        List<String> mobileList = Arrays.asList("Apple Iphone","Samsung", "Google Pixel");
        studentList.forEach(x -> System.out.println(x));
        //Here we are using method reference instead of Lambda expression.
        mobileList.forEach(System.out::println);

        //Constructor reference
        List<String> cityNames = Arrays.asList("Delhi", "Mumbai","Bangalore","Hyderabad","Chennai");
        List<CityName> names1 = cityNames.stream().map(x -> new CityName(x)).collect(Collectors.toList());
        // Here we are using Constructor reference.
        List<CityName> names = cityNames.stream().map(CityName::new).collect(Collectors.toList());


    }

}

class CityName{
    String name;

    public CityName(String name) {
        this.name = name;
    }
}

