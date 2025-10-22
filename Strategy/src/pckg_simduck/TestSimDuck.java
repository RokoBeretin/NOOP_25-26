package pckg_simduck;

public class TestSimDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new Duck(new FlyWithWings(), new QuackCanDo());
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck rubberDuck = new Duck(new FlyNoWay(), new QuackNoWay());
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
