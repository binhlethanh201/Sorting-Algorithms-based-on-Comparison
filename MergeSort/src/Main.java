import java.util.Scanner;

public class Main {
	
	private static void merge(int array[], int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i=0; i < n1; i++ ) {
			L[i] = array[l+i];
		}
		for(int j=0; j <n2; j++) {
			R[j] = array[m+1+j];
		}
		int i =0, j=0;
		int k =l;
		while( i<n1 && j <n2) {
			if(L[i] <=R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while(j <n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
	private static void mergeSort(int array[], int l, int r) {
		if(l<r) {
			int m = l + (r-l) /2;
			mergeSort(array, l,m);
			mergeSort(array, m+1, r);
			merge(array, l, m, r);
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
		mergeSort(array, 0, n-1);
		System.out.print("Sorted array: ");
		display(array);
		sc.close();

	}

}
