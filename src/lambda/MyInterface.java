package lambda;

@FunctionalInterface
public interface MyInterface {

    public abstract void sayHello();

    //Here we have defined @FunctionalInterface we cannot have more than one abstract method.
    // public abstract void runFast();
}
