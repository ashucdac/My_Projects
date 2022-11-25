package com.java.Common;

public class RightRotateArray {

	public static void main(String[] args) {
		 int arr[] = {1,2,5,3,4};
		 int temp[] = new int[arr.length];
		 int n = 4;
		 int cnt = n;
		 //rotate the array by n times
		 int i = 0;
			 while(cnt>0) {
			 temp[i] = arr[arr.length-cnt];
			 cnt--;
			 i++;
			 }
			 for(int j=0;j<arr.length-n;j++) {
				 temp[i] = arr[j];
				 i++;
			 }
		 for (int j : temp) {
			 System.out.println(j);
		}

	}

}
