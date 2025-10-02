package org.coding;

import java.time.LocalDate;

import static java.util.FormatProcessor.FMT;


public class StringTemplateDemo {

    public static void main(String[] args) {

        LocalDate fiscalDate = LocalDate.now();
        double value = 4552.2367;
        String employeeCode = "RN4555";

        String jsonBlockStr = STR."""
                                    {"sale": {
                                    "id": 1,
                                    "details": {
                                    "fiscal_year": \{fiscalDate.getYear()},
                                    "employee_nr": "\{employeeCode}",
                                    "value": \{value}
                                    }
                                    }
                                    """;

        String jsonBlockFmt = FMT."""
                                {"sale": {
                                "id": 1,
                                "details": {
                                "fiscal_year": \{fiscalDate.getYear()},
                                "employee_nr": "\{employeeCode}",
                                "value": %.2f\{value}
                                }
                                }
                                """;

        System.out.println(jsonBlockStr);
        System.out.println(jsonBlockFmt);
    }


}
