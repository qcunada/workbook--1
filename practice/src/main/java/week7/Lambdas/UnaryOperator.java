package week7.Lambdas;

@FunctionalInterface
public interface UnaryOperator {

    int apply (int input);

    //Create a functional interface named UnaryOperator that represents an operation on a single integer.
    //
    //Steps:
    //
    //Create a functional interface named UnaryOperator.
    //Define a method named apply that takes an int parameter and returns an int.
    //Annotate the interface with the appropriate annotation for functional interfaces.
}
