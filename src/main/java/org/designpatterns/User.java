package org.designpatterns;

public class User{

    private String name;
    private int age;

    private String address;
    private String pin;
    private String loc;

    public User(UserBuilder userBuilder) {
        this.name=userBuilder.name;
        this.age=userBuilder.age;
        this.address=userBuilder.address;
        this.loc=userBuilder.loc;
        this.pin=userBuilder.pin;
    }

    public static class UserBuilder{
        private String name;
        private int age;

        private String address;
        private String pin;
        private String loc;

        UserBuilder(String name, int age){
            this.name=name;
            this.age=age;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setLoc(String loc) {
            this.loc = loc;
            return this;
        }

        public UserBuilder setPin(String pin) {
            this.pin = pin;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
    
}
