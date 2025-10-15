package pckg_s_fst;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SimpleSorter<String> simpleSorter = new SimpleSorter<>(List.of("banana", "apple", "cherry"), new SortPrinciple_1());
        simpleSorter.performSort();
        simpleSorter.setSortPrinciple(new SortPrinciple_2());
        simpleSorter.performSort();
    }
}
