package org.coding;

public class MultilineString {

    public static void main(String[] args) {

        String updateOfficeByEmployeeJobTitle = """
                UPDATE "public"."office"
                SET ("address_first", "address_second", "phone") =
                (SELECT "public"."employee"."first_name",
                "public"."employee"."last_name", ?
                FROM "public"."employee"
                WHERE "public"."employee"."job_title" = ?)""".indent(6)
                .stripTrailing();

        System.out.println(updateOfficeByEmployeeJobTitle);

        String address = """
                JASON MILLER (\\"BIGBOY\\")\\n
                \\tMOUNT INC\\n
                \\t104 SEAL AVE\\n
                \\tMIAMI FL 55334 1200\\n
                \\tUSA
                """;
        System.out.println(address.translateEscapes());

    }


}
