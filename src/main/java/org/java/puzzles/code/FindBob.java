package org.java.puzzles.code;


import org.java.puzzles.tests.FindBobTest;

import java.util.regex.Pattern;

/**
 * Return true if the given string contains a "bob" string,
 * but where the middle 'o' char can be any char.
 * <p>
 * <p>
 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 */

public class FindBob {
    public boolean findBob(String str) {
        return  Pattern.compile("b[a-zA-z0-9]{1}b").matcher(str).find();
    }

    public static void main(String[] args) {
        FindBobTest.checkOutput();
    }
}
