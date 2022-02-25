package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }


    //=================================================================
    // normal java function
    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    // Functional Interface
    static Supplier<String> getDBConnectionUrlSupplier = () -> {
        return "jdbc://localhost:5432/users";
    };
    //==================================================================
}
