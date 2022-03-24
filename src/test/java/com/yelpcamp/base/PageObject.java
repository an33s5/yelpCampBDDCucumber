package com.yelpcamp.base;

public class PageObject {

    protected void waitInSeconds(int second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
