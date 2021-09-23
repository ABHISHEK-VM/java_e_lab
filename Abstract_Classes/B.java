package Abstract_Classes;

public class B extends A {

    B(String name) {
        super(name);
    }

    @Override
    public void callByName() {
        System.out.println(name + ", Call from B");

    }

}
