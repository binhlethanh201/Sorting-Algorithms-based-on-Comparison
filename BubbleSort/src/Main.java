import java.util.Scanner;

public class Main {
	private static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped;
		for(int i=0; i<n;i++) {
			swapped = false;
			for(int j =0; j< n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
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
		bubbleSort(array);
		System.out.print("Sorted Array: ");
		display(array);
		sc.close();
	}
}
