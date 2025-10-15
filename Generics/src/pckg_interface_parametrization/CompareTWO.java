package pckg_interface_parametrization;

public class CompareTWO <T extends Comparable<T>>{

    // Oba moraju biti ista vrsta jer koristimo T
    // Ako hocemo da budu razlicite vrste onda koristimo <T extends Comparable<U extends Comparable<T>>


    private final T fst;
    private final T snd;

    public CompareTWO(T fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

//    public void setFst(T fst) {
//        this.fst = fst;
//    } Kompajler neda jer je final

    public void performComparison(){
        if(fst.compareTo(snd) > 0){
            System.out.println(fst + " is greater than " + snd);
        } else if (fst.compareTo(snd) < 0) {
            System.out.println(fst + " is less than " + snd);
        } else {
            System.out.println(fst + " is equal to " + snd);
        }
    }


}
