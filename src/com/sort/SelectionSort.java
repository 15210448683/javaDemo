package com.sort;

import java.util.Arrays;

/**
 * 选择排序
 * @author moon
 *
 */
public class SelectionSort {
	
	
	public static void selectionSort(int[] ary){
		 for(int i=0;i<ary.length-1;i++){
			 System.out.println("i第"+i+"个：值为"+ary[i]);
			 
			 for(int j=i+1;j<ary.length;j++){
				 System.out.println("j第"+j+"个：值为"+ary[j]);
				 if(ary[j]<ary[i]){
					 int t=ary[i];
					 ary[i]=ary[j];
					 ary[j]=t;
					 System.out.println(Arrays.toString(ary));
					 
				 }
				 
			 }
			 
			 
		 }
		
		
		
	}
	
	
	public static void main(String[] args){
		 
		int[] a={3,2,5,6,1,4,7};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
		
	}

}
