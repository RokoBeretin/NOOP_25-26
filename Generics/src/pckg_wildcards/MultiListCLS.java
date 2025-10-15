package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS<E> {
    private final List<E> list;

    public MultiListCLS() {
        this.list = new ArrayList<>();
    }

    public MultiListCLS(List<E> list) {
        this.list = list;
    }

    public void listAllElements(){
        if(list.isEmpty()){
            System.out.println("The list is empty.");
        } else {
            list.forEach(System.out::println); //(LAMBDA) Metoda forEach dolazi iz Iterable sučelja i prolazi kroz svaki element liste, te na svaki poziva funkciju koju joj daš. Znači, za svaku stavku u listi — napravi nešto.
        }
    }

    public void addElement(E element){
        if(list.contains(element)){
            System.out.println("Element already exists in the list: " + element);
        } else {
            list.add(element);
            System.out.println("Element added: " + element);
        }
    }

    public void compareListLenghts(List<?> otherList){
        if(list.size() > otherList.size()){
            System.out.println("The current list is longer than the other list.");
        } else if (list.size() < otherList.size()) {
            System.out.println("The current list is shorter than the other list.");
        } else {
            System.out.println("Both lists are of equal length.");
        }
    }
}
