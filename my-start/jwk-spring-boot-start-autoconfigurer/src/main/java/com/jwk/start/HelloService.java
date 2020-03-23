package com.jwk.start;

public class HelloService {
    Helloproperties helloproperties;
    public String sayHello(String name){
        return helloproperties.getPrefix()+name+helloproperties.getSuffix();
    }

    public Helloproperties getHelloproperties() {
        return helloproperties;
    }

    public void setHelloproperties(Helloproperties helloproperties) {
        this.helloproperties = helloproperties;
    }
}
