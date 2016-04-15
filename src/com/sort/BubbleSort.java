package com.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author moon
 *
 */
public class BubbleSort {
	
	public static void bubble(int[] ary){
		for(int i=0;i<ary.length-1;i++){
			System.out.println("这是第"+i+"轮");
			for(int j=0;j<ary.length-1-i;j++){
				if(ary[j]>ary[j+1]){
					int t=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=t;
				}
				
			}
			
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
	   int[] a={4,1,3,7,2,8,5};
	   bubble(a);
	   System.out.println(Arrays.toString(a));
	}

}
