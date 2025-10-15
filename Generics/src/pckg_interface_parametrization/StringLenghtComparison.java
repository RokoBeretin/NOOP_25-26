package pckg_interface_parametrization;

public class StringLenghtComparison implements Comparable<StringLenghtComparison> {
    private final String str;

    public StringLenghtComparison(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(StringLenghtComparison o) {
        return str.length() - o.str.length(); // o.str.length(); .str jer o je objekat klase StringLenghtComparison sa svojim str.
    }
    @Override
    public String toString() {
        return str + " (length: " + str.length() + ")";
    }
}
