import java.util.Scanner;

public class Main {
	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low -1;
		for(int j = low; j <= high-1 ; j++ ) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}
	
	private static void quickSort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array,low,high);
			quickSort(array, low, pi-1);
			quickSort(array, pi+1, high);
		}
	}
	private static void display(int[] array) {
		for(int number : array) {
			System.out.print(number+ " ");
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
			else System.out.println("The number of array must be positive");
		}
		int[] array = new int[n];
		for(int i=0; i<n;i++) {
			System.out.print("Enter element " +(i+1)+ ": ");
			array[i] = sc.nextInt();
		}
		System.out.print("Unsorted array: ");
		display(array);
		quickSort(array, 0, n-1);
		System.out.print("Sorted array: ");
		display(array);
		sc.close();
	}

}
