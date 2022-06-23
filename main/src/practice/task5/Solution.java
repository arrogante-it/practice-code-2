package practice.task5;

// Need write a function that will be converted a name into initials.
// The output should be two capital letters with a dot separating them.
// examples: Jasse Pinkman --> J.P
//           walter white --> w.w

import java.util.List;

public class Solution {

    public static String getAbbreviationOfName(String name) {

        String firstName = List.of(name.split(" ")).get(0).toUpperCase();
        String lastName = List.of(name.split(" ")).get(1).toUpperCase();

        char[] array1 = firstName.toCharArray();
        char[] array2 = lastName.toCharArray();

        char firstSymbolOfFirstName;
        firstSymbolOfFirstName = array1[0];

        char firstSymbolOfLastName;
        firstSymbolOfLastName = array2[0];

        return String.valueOf(firstSymbolOfFirstName) + '.' + firstSymbolOfLastName;
    }
}
