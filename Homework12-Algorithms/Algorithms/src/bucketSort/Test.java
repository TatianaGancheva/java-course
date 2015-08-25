package bucketSort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] data = {1,2,3,6,5,8,9,4,5,7,6,8}; 
		
		BucketSort sort = new BucketSort();
		int maxVal=sort.maxValue(data);
		long startTime = System.nanoTime();
		System.out.println("At the beginning: " + Arrays.toString(data));
		
		sort.sort(data,maxVal);
		System.out.println("After sort:  " + Arrays.toString(data));
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		
		float millisecond = (float) totalTime / 1000000;
		float second = (float) millisecond / 1000;
		
		System.out.println();
		
		System.out.println("Execution Time: \n nnanoseconds:"+totalTime+" \n milliseconds:"+millisecond+" \n seconds:"+second );


	}

}
