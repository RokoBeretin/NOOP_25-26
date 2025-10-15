package pckg_s_fst;

import java.util.List;

public abstract class Sorter<E> {
    protected List<E> list;
    protected SortPrinciple sortPrinciple;

    protected Sorter(List<E> list, SortPrinciple sortPrinciple) {
        this.list = list;

    }

    protected void setListToSort(List<E>  list, SortPrinciple sortPrinciple) {
        this.sortPrinciple = sortPrinciple;
        this.list = list;
    }

    protected void setSortPrinciple(SortPrinciple sortPrinciple) {
        this.sortPrinciple = sortPrinciple;
    }
    protected abstract void performSort();
}
