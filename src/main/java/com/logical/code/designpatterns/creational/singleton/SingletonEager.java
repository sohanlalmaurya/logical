package com.logical.code.designpatterns.creational.singleton;

public class SingletonEager {
	
	 private static final SingletonEager instance = new SingletonEager();
	    
	    //private constructor to avoid client applications to use constructor
	    private SingletonEager(){}

	    public static SingletonEager getInstance(){
	        return instance;
	    }
}
