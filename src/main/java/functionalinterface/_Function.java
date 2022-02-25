package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy10AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy10AndThenMultiplyBy10.apply(1));

        // BiFunction takes 2 argument and produces 1 result
        Integer biFunctionResult = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println("biFunctionResult = " + biFunctionResult);
        int normalFunctionResult = incrementByOneAndMultiply(4, 100);
        System.out.println("normalFunctionResult = " + normalFunctionResult);
    }




    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;



    // =================================================================
    // java normal function
    static int incrementByOne(int number) {
        return number + 1;
    }

    // java function interface
    static Function<Integer, Integer> incrementByOneFunction = number -> {
        return number += 1;
    };

    static Integer some = 1;
    // java anonymous class
    static Function<Integer, Integer> incrementByOneAnonymousClass = new Function<Integer, Integer>() {
        @Override
        public Integer apply(Integer integer) {
            some+=1;
            return integer+=1;
        };
    };
    //==================================================================

    //these two are exactly same
    // 1
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    // 2
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
    //====================================================================
}
