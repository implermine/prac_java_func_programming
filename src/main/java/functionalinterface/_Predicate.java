package functionalinterface;

import java.nio.charset.StandardCharsets;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003")
        );

        System.out.println(
                "Is Two phone number summed length is 4 = " +
                        isTwoArgumentsSummedLengthIs4.test("hi","hep")
        );

    }


    //====================================================================
    // normal java function
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // Functional Interface
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
    {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    };
    //=====================================================================

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static BiPredicate<String, String> isTwoArgumentsSummedLengthIs4 =
            (arg1, arg2) -> {
                return (arg1.length() + arg2.length()) == 4;
            };
}
