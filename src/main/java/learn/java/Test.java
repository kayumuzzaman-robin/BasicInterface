package learn.java;

/**
 * Interface
 */
public class Test implements Human{

    public Test() {
        System.out.println("Test(): No Arg. constructor get called");
    }

    @Override
    public void move() {
        System.out.println("Human can move");
    }

    @Override
    public void eat() {
        System.out.println("Human can move");
    }

    @Override
    public boolean isEatable() {
        return false;
    }

    @Override
    public boolean isTerrestrial() {
        return true;
    }

    @Override
    public boolean isAquatic() {
        return false;
    }

    public static void main(String[] args) {
        Test kasem = new Test();
        kasem.move();
        kasem.eat();
        System.out.println("Kasem isAquatic = " + kasem.isAquatic());
        System.out.println("Kasem is Eatable() = " + kasem.isEatable());
        System.out.println("Kasem is Terrestrial() = " + kasem.isTerrestrial());
        System.out.println("Kasem has legs: " + Human.numberOfLegs);
    }
}
