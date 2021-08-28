package com.app.lambda;

import java.util.Arrays;

interface Sample1 {
	public void msg();
}

interface Sample2 {
	public void sum(int a,int b);

}

interface Sample3 {
	public Integer operation(int x, int y);
}

public class LambdaExpressionDemo {
	public static void main(String[] args) {


		//  With out parameters 
		Sample1 s = () -> { 
			System.out.println("Hellow world"); 
		}; 
		s.msg();


		// With parameters 
		Sample2 s2 = (int a,int b) -> System.out.println("Sum is :"+(a+b)); 
		s2.sum(10, 10);

		//Parameters with return type
		Sample3 s3 = (x,y) -> {
			if(x>y)
				System.out.println("Multiplication is: "+(x*y));
			else
				System.out.println("Division is: "+(x-y));
			return x-y;
		};

		s3.operation(2, 5);
		
		
		int arr[] = {5,1,0,3,6,11,15,18,16,13,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
