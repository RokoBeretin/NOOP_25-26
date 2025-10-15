package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiList {
    public static void main(String[] args) {
        String someString = "Hello, Generics with Wildcards!, let's split this string into parts.";
        String[] partsOfSomeString = someString.split(" ");
        List<String> listOfStringParts = new ArrayList<>(Arrays.asList(partsOfSomeString));
        System.out.println(Arrays.toString(partsOfSomeString));
        MultiListCLS<String> stringMultiList = new MultiListCLS<>(listOfStringParts);
        List<Integer> listOfIntegerParts = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        stringMultiList.compareListLenghts(listOfIntegerParts);
    }
}
