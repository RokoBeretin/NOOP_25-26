package pckg_simduck;

public class QuackNoWay implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
