package QuickSort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] data = {2,3,6,5,9,8,7,4,5,6,4,4,4,5}; 
		
		QuickSort sorter = new QuickSort();
		long startTime = System.nanoTime();
		System.out.println("Before: " + Arrays.toString(data));
		sorter.sort(data);
		System.out.println("After:  " + Arrays.toString(data));
		
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		float millisecond = (float) totalTime / 1000000;
		float second = (float) totalTime / 1000000000;
		
		System.out.println();
		
		System.out.println("Execution Time: \n nnanoseconds:"+totalTime+" \n milliseconds:"+millisecond+" \n seconds:"+second );	}

}
