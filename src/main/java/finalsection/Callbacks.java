package finalsection;

import java.util.Optional;
import java.util.function.Consumer;

// Callbacks
public class Callbacks {
    public static void main(String[] args) {
        hello("John"
                , null
                , value -> System.out.println("no lastName provided for " + value)
        );

        hello2("John"
                , null
                , () -> System.out.println("no lastName provided")
        );
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("firstName = " + firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println("firstName = " + firstName);
        Optional<String> optLastName = Optional.ofNullable(lastName);
        optLastName.ifPresentOrElse(
                System.out::println,
                callback
        );
    }
}