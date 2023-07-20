package org.example;

public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "  ";
        String str2 = "hello1";
        String result = "";

        if(str1.length()==0 || str2.length()==0) return;

        String shorter = str1.length() > str2.length() ? str2 : str1;
        String longer = shorter.equals(str1) ? str2 : str1;

        for (int i = 0; i < shorter.length(); i++) {
            String c = Character.toString(shorter.charAt(i));

            if (longer.contains(c) && Character.isLetter(c.charAt(0))) {
                result += c;
            }
        }
        System.out.println(result);

    }
}
