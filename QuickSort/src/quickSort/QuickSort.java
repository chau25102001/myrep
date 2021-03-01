package quickSort;
import java.util.Arrays;
public class QuickSort {
	static void quickSort(int[] arr, int low, int high) {
		if (low<high) {
		int pivot = arr[low];
		int i = low;
		int current = 0;
		for (int j = low+1; j <= high; j++) {
			if (arr[j]< pivot) {
				i++;
				current = arr[i];
				arr[i] = arr[j];
				arr[j] = current;
				
			}
		}
		
		int curr = arr[i];
		arr[i] = arr[low];
		arr[low] = curr;
		quickSort(arr, low, i-1);
		quickSort(arr, i+1, high);
	}
	}
	public static void main(String[] args) {
		int[] arr = {10, 80, 30, 90, 40, 50, 70};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		int sum =0;
		for (int i:arr) {
			sum+=i;}
		System.out.println("the sum is: " +sum);
		System.out.println("the average value is: " + sum/arr.length);
		
	}

}
