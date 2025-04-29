public class InsertionSort {

    public static void insertion(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int p = arr[i];
            while (j > -1 && arr[j] > p) {
                arr[j + 1] = arr[j--];
            }
            arr[++j] = p;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 1, 8, 3, 2, 9, 6, 10, 4 };
        int n = 9;
        System.out.println("before");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        insertion(arr, n);
        System.out.println("after");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
