package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void mehtod() {
        System.out.println("Child.method");
    }
}
