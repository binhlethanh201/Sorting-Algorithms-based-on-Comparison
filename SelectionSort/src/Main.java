import java.util.Scanner;

public class Main {
	private static void selectionSort(int[] array) {
		int n = array.length;
		for(int i=0; i<n; i++) {
			int min_index = i;
			for(int j= i+1;j<n; j++) {
				if(array[j] < array[min_index]) {
					min_index = j;
				}	
			}
			int temp = array[i];
			array[i] = array[min_index];
			array[min_index] = temp;
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
			if(n >0) break;
			else System.err.println("The number of array must be positive!");
		}
		
		int[] array = new int[n];
		for(int i=0; i<n ;i++) {
			System.out.print("Enter element " + (i+1)+ ": ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("Unsorted Array: ");
		display(array);
		selectionSort(array);
		System.out.print("Sorted Array: ");
		display(array);
		sc.close();
	}
}


