package object;

import java.util.ArrayList;

public class StringPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String numbers = "123456789";
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i<numbers.length-1; i++)
		{
			
			System.out.print(numbers[i]+"-");
		}
			System.out.println(numbers[numbers.length-1]);
		
		
	}

}
