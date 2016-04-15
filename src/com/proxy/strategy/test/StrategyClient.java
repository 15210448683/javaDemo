package com.proxy.strategy.test;

import com.proxy.strategy.Context;
import com.proxy.strategy.impl.PrintStrategy;
import com.proxy.strategy.inter.Strategy;

public class StrategyClient {
	
	public static void main(String[] args) {
		Strategy stra=new PrintStrategy();
		Context context=new Context(stra);
		context.doAction();
	}

}
