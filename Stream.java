import java.util.Arrays;
//import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
//import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
//import java.lang.Math;
import java.util.function.Function;
//import static org.apache.commons.lang.StringUtils.isNotEmpty;
//import org.apache.commons.lang3.StringUtils;
//import java.lang.Character;


public class Stream {
    public static void main(String[] args)
    {
        List<String> listOfStrings = new ArrayList<>();
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("");
        listOfStrings.add("How are you?");
        listOfStrings.add("");
        listOfNumbers.add(2);
        listOfNumbers.add(3);
        listOfNumbers.add(4);

        countingEmptyString(listOfStrings);
        countStringsWithLengthMoreThanThree(listOfStrings);
        //countStringStartingWithA(listOfStrings);
         removingEmptyString(listOfStrings);
         converToUppercase(listOfStrings);
         squareOfNumbers(listOfNumbers);
         minMaxAverage(listOfNumbers);
    }

    private static void countingEmptyString(List<String> listOfStrings){
        //logic to find empty string
        long count = listOfStrings.stream().filter(x -> x.isEmpty()).count();

        System.out.println("Empty Count: " + count);
        //print the count
    }

    private static void countStringsWithLengthMoreThanThree(List<String> listOfStrings){
        //logic to find string of length more than 3
         long count = listOfStrings.stream().filter(x -> x.length()>3).count();

         System.out.println("Number of Strings with length more than three are: " + count);

         //print the count
    }



    // private static void countStringStartingWithA(List<String> listOfStrings){
    //     //logic to find empty string
    //    // long count = listOfStrings.stream().filter(x -> x.isEmpty()).count();
        
    //     Map<Character, Long> charFrequency = listOfStrings.stream() //Stream<String>
    //     .flatMap(a -> a.charAt(0)=='a'.mapToObj(c -> (char) c)) // Stream<Character>
    //     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    //     System.out.println("Count of Strings starting with a " + charFrequency);
    //     //print the count
    // }
   

    private static void removingEmptyString(List<String> listOfStrings){
       //Object StringUtils;
        
       //Object object;
        listOfStrings.removeAll(Arrays.asList("", null));
       //List<String> list = listOfStrings.stream().filter(item-> item.isEmpty()).collect(Collectors.toList());
       //List<String> filteredListOfString = listOfStrings.stream().filter(str->((Object) StringUtils()).isNotEmpty(str)).collect(Collectors.toList());
       //List<String> list = listOfStrings.stream().filter(item->((Object) StringUtils()).isNotBlank(item)).collect(Collectors.toList());
       System.out.println("Removed empty strings." + listOfStrings); //stringUtils

    }

    // private static Object StringUtils() {
    //     return null;
    // }

    private static void converToUppercase(List<String> listOfStrings){
        //logic to find empty string
        
        //try using streams
        String CommaSeparatedlist = listOfStrings.stream().collect(Collectors.joining(","));
        
        System.out.println(CommaSeparatedlist.toUpperCase());
        //print the count
    }


    private static void squareOfNumbers(List<Integer> listOfNumbers){
        //logic to find empty string

        Function<Integer, Integer> square = x -> x * x;
        listOfNumbers.stream().map(square).forEach(x -> System.out.println(x));

        
    }


    private static void minMaxAverage(List<Integer> listOfNumbers){
        
        IntSummaryStatistics stats = listOfNumbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
    }
}
