package org.designpatterns;


public class BuilderPattern {

    User user= new User.UserBuilder("atul",21).setAge(23).build();
}
