import java.util.Scanner;

public class Main {
	 private static void heapify(int arr[], int n, int i) {
	        int largest = i; 
	        int l = 2 * i + 1; 
	        int r = 2 * i + 2;
	        if (l < n && arr[l] > arr[largest]) {
	            largest = l;
	        }
	        if (r < n && arr[r] > arr[largest]) {
	            largest = r;
	        }
	        if (largest != i) {
	            int temp = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = temp;
	            heapify(arr, n, largest);
	        }
	    }

	  private  static void heapSort(int arr[]) {
	        int n = arr.length;
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }
	        for (int i = n - 1; i > 0; i--) {
	            int temp = arr[0]; 
	            arr[0] = arr[i];
	            arr[i] = temp;
	            heapify(arr, i, 0);
	        }
	    }
	  private static void display(int[] array) {
			for(int number : array) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
	  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("Enter number of array: ");
			n = sc.nextInt();
			if(n>0) break;
			else System.err.println("The number of array must be positive.");
		}
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter element " +(i+1)+": ");
			array[i] = sc.nextInt();
		}
		System.out.print("Unsorted array: ");
		display(array);
		heapSort(array);
		System.out.print("Sorted array: ");
		display(array);
		sc.close();

	}
}


