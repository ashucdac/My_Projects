package com.java.Common;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShifting {

	public static void main(String[] args) {
		int arr[] = {1,2,5,3,4};
		
		System.out.println("Given Array : "+Arrays.toString(arr));
		System.out.println("Enter the shifting number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>arr.length) {
			n = n - arr.length; 
		}
		int res[] = new int[arr.length];
		int i = 0;
		int cnt = n;
		 while(cnt>0) {
		 res[i] = arr[arr.length-cnt];
		 cnt--;
		 i++;
		 }
		 for(int j=0;j<arr.length-n;j++) {
			 res[i] = arr[j];
			 i++;
		 }
		System.out.println("Shifted Array : "+Arrays.toString(res));
	}

}
