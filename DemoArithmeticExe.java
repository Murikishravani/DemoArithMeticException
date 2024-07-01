package com.exe;

public class DemoArithmeticExe {

	public static void main(String[] args) {
		//Intializing the variables
		int a, b, c;
		a = 10;
		b = 6;
		System.out.println("start  of the pgm");
		try {
			//Handling Arithmetic Exception
			c = a / b;
          System.out.println("c=" + c);
       //System.out.println("End of the pgm");
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[4]);
		} catch (ArithmeticException ae) {
			System.out.println("Exception caught");
      //Handling ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Exception caught");
		} finally {
			System.out.println("End of the pgm");
		}

	}

}
