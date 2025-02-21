import java.util.Scanner;

public class Main {
	private static void insertionSort(int[] array) {
		int n = array.length;
		for(int i=0; i<n;i++) {
			int key = array[i];
			int j = i-1;
			while(j >=0 && array[j] > key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
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
			else System.err.println("The number of array must be positive!");
		}
		int[] array = new int[n];
		for(int i =0; i< n;i++) {
			System.out.print("Enter element " +(i+1)+ ": ");
			array[i] = sc.nextInt();
		}
		System.out.print("Unsorted array: ");
		display(array);
		insertionSort(array);
		System.out.print("Sorted array: ");
		display(array);
		sc.close();
	}

}
