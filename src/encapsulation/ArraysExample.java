package encapsulation;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		int a= 100, b=200,c=300,d=400;
		
		int[] intArr = {100, 200, 300, 400, 500};
		
//		int[] intArr2 = {100, 200.5F, 300, 400, 500.96D};
		
		boolean[] boolArr = {true,false,true,false};
		
		ArraysExample[] arrExArr = {new ArraysExample(), new ArraysExample(), new ArraysExample()};
		
		
		Object[] objArr = {true, 10, 100, 'A', 1000, 100.5F, 10000, 1000.75D, "Java", new ArraysExample()};
		
		System.out.println(intArr);
		
//		System.out.println(intArr[0]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);
//		System.out.println(intArr[4]);
		
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		
//		enhanced for loop
		
		for(int eachValue:intArr) {
			System.out.println(eachValue);
		}
		
		intArr[0] = 1000;
		
//		System.out.println(intArr[0]);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);
//		System.out.println(intArr[4]);
		
//		System.out.println(objArr[0]);
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
		
		for(int eachValue:intArr) {
			System.out.println(eachValue);
		}
		
		int intArr3;		
		intArr3 = 100;
		
		int[] intArr4 = new int[3];
		
		intArr4[0] = 10000;
		intArr4[1] = 20000;
		intArr4[2] = 30000;
		
//		intArr4[3] = 40000; Exception
		
//		System.out.println(intArr4[0]);
//		System.out.println(intArr4[1]);
//		System.out.println(intArr4[2]);
		
//		for(int i = 0; i < intArr4.length; i++) {
//			System.out.println(intArr4[i]);
//		}
		
		for(int eachValue:intArr4) {
			System.out.println(eachValue);
		}
		
//		System.out.println(intArr4[3]);
		
		int[] intArr5 = new int[3];		
		System.out.println(intArr5[0]);
		
		
		boolean[] boolArr2 = new boolean[3];
		System.out.println(boolArr2[0]);
		
		String[] strArr = new String[3];
		System.out.println(strArr[0]);
		
		Object[] objArr2 = new Object[3];
		System.out.println(objArr2[0]);
		
		ArraysExample[] arrExArr1 = new ArraysExample[3];
		System.out.println(arrExArr1[0]);
		
		
//		2D Array
		
		int[] intArr6 = {10,20,30,40};
		int[] intArr7 = {100,200,300,400};
		int[] intArr8 = {1000,2000,3000,4000};
		
		int[][] twoDIntArr = {intArr6,intArr7,intArr8};
		
		int[][] twoDIntArr2 = {{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
		
		
		System.out.println(twoDIntArr2[1][2]);
		
		for(int i = 0; i < twoDIntArr2.length;i++) {
			System.out.println(twoDIntArr2[i]);
			
			for(int j = 0; j < twoDIntArr2[i].length; j++) {
				System.out.println(twoDIntArr2[i][j]);
			}
		}
		
		
		int[] intArrForSort = {50,30,20,10,40};
		
		System.out.println("------------Befor Sorting-------------");
		for(int eachValue:intArrForSort) {
			System.out.println(eachValue);
		}
		
		Arrays.sort(intArrForSort);
		
		System.out.println("------------After Sorting-------------");
		for(int eachValue:intArrForSort) {
			System.out.println(eachValue);
		}
		
	}
	

}
