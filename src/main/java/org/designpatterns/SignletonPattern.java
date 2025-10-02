package org.designpatterns;

public class SignletonPattern {

    private static SignletonPattern signleton;

    private SignletonPattern(){}

    public static SignletonPattern getSignleton() {
        if(signleton==null){
            synchronized (SignletonPattern.class){
                if (signleton==null){
                    signleton= new SignletonPattern();
                }
            }
        }
        return signleton;
    }
    public void logData(String msg){
        System.out.printf("msg "+msg);
    }
}
