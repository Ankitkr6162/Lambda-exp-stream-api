package lambda;

public class Main {

    public static void main(String[] args) {
        System.out.println("System starts...");

        // Lambda expression introduced in JAVA 8 implement Functional Interface, which helps to pass
        // code as an argument helps to write more functional Style coding.

        // create a child class of Functional interface and calling its implementation method
        MyInterfaceImpl myInterfaceImpl = new MyInterfaceImpl();
        myInterfaceImpl.sayHello();

        // Here we are creating anonymous class of interface.
        MyInterface myInterface = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous class is called..");
            }
        };

        myInterface.sayHello();


        //Lambda expression.
        // Here we are using Functional Interface to call lambda
        MyInterface i = () -> System.out.println("Say hello from lambda expression");
        i.sayHello();

        MyInterface i2 = () -> System.out.println("Say hello 2nd time from lambda expression");
        i2.sayHello();


        SumInterface sum = (int a, int b) -> a + b;
        System.out.println(sum.addNumbers(12, 12));



        LengthInterface len = (String str) -> str.length();
        System.out.println(len.getLength("Ankit Kumar Paswan"));
    }


}
