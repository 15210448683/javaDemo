package com.proxy.strategy;

import com.proxy.strategy.inter.Strategy;
/**
 * 策略模式
 * @author moon
 *
 */
public class Context {
	 private Strategy stg;  
	   
    public Context(Strategy theStg) {  
        this.stg = theStg;  
    }  
   
    public void doAction() {  
        this.stg.testStratefy();  
    } 
}
