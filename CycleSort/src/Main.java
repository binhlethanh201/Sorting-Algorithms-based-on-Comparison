import java.util.Scanner;

public class Main {
    private static void cycleSort(int arr[], int n) {
        int writes = 0;
        for (int cycle_start = 0; cycle_start < n - 1; cycle_start++) {
            int item = arr[cycle_start];
            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++;
                }
            }
            if (pos == cycle_start) {
                continue;
            }
            while (item == arr[pos]) {
                pos++;
            }
            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }
            while (pos != cycle_start) {
                pos = cycle_start;
                for (int i = cycle_start + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++;
                    }
                }
                while (item == arr[pos]) {
                    pos++;
                }
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    writes++;
                }
            }
        }
    }

    private static void display(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Enter number of array: ");
            n = sc.nextInt();
            if (n > 0) break;
            else System.err.println("The number of array must be positive.");
        }
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print("Unsorted array: ");
        display(array);
        cycleSort(array, n);
        System.out.print("Sorted array: ");
        display(array);
        sc.close();
    }
}