import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.lang.Math;

public class StreamUseCases
{
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

    private static void removingEmptyString(List<String> listOfStrings){
       //logic to remove empty string
       listOfStrings.removeAll(Arrays.asList("", null));
      // List<String> filteredListOfString = listOfStrings.stream().filter(str->StringUtils.isNotEmpty(str)).collect(Collectors.toList());
       
       System.out.println("Removed empty strings."); //stringUtils
       System.out.println(listOfStrings);


        //print the count
    }

    private static void converToUppercase(List<String> listOfStrings){
        //logic to find empty string
        
        //try using streams
        String listCommaSeparated = String. join(",", listOfStrings);
        
        System.out.println(listCommaSeparated.toUpperCase());
        //print the count
    }

    private static void squareOfNumbers(List<Integer> listOfNumbers){
        //logic to find empty string
        for(Integer num : listOfNumbers) {
            System.out.println(num * num);
        }

    }


    private static void minMaxAverage(List<Integer> listOfNumbers){
        
        int sum=0;
        for(Integer num : listOfNumbers) {
            sum+=num;
        }
        System.out.println(sum);
        int max = Collections.max(listOfNumbers);
        int min = Collections.min(listOfNumbers);
        double avg = sum / listOfNumbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
    
}