package com.arrays;

public class ArrayRotation {
	
	private static void rotateArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
        if(arr == null)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        int temp = arr[0];
        
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]  = arr[i+1];
        }

        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
	
	public static void main(String[] args) {
		
	}

}
