package org.coding.program;

public class CustomTemplateDemo {

    public static void main(String[] args) {
        CustomStringTemplate pp = new CustomStringTemplate();
        String workPhone = "072-825-9009";
        String homePhone = "(040)234-9670";
        String message = pp."""
                            You can contact me at work at \{workPhone}
                            or at home at \{homePhone}.
                            """;

        System.out.println(message);
    }
}
