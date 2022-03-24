package com.yelpcamp.base;

public class PageObject {

    protected void waitInSeconds(int second){
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
