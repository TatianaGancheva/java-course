package QuickSort;

public class QuickSort {
	protected int[] array;
	
	public void sort(int[] arr){
		
		if (arr == null || arr.length == 0){
			return;
		}
		
		this.array = arr;
		int length = arr.length - 1;
		quickSort(0, length);
		
	}
		public void swapElements(int i , int j){
		int temp = this.array[i];
		this.array[i] = this.array[j];
		this.array[j] = temp;
	}
	
	public void quickSort(int low, int high) {
		if (low >= high)
			return;
 

		int middle = low + (high - low) / 2;
		int pivot = this.array[middle];
 
		int i = low, j = high;
		
		while (i <= j) {
			while (this.array[i] < pivot) {
				i++;
			}
 
			while (this.array[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				swapElements(i, j);
				i++;
				j--;
			}
		}
 
		if (low < j)
			quickSort(low, j);
 
		if (high > i)
			quickSort(i, high);
	}
}
