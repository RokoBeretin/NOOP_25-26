package pckg_interface_parametrization;

public class TestComparison {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana213124";
        CompareTWO<String> stringComparison = new CompareTWO<>(s1, s2);
        stringComparison.performComparison();

        // Stringovi se porede leksikografski, pa je "Apple" manje od "Banana" jer mu je prvi karakter 'A' manje od 'B'

        Integer i1 = 42;
        Integer i2 = 42;
        CompareTWO<Integer> integerComparison = new CompareTWO<>(i1, i2);
        integerComparison.performComparison();
        StringLenghtComparison strLen1 = new StringLenghtComparison(s1);
        StringLenghtComparison strLen2 = new StringLenghtComparison(s2);
        CompareTWO<StringLenghtComparison> stringLengthComparison = new CompareTWO<>(strLen1, strLen2); // CompareTWO<StringLenghtComparison> moze jer implementira Comparable
        stringLengthComparison.performComparison();
    }
}
