package org.coding;

public class StarPatterns {

    static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 ||i==n||j==1||j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");

    }
}
