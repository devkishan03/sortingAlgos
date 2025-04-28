public class BestBubble {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    flag = false;
                }
            }
            if (flag)
                return;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 6, 2, 1, 7, 10, 9, 21, 99, 4, 33 };
        int arr2[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Before");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        bubbleSort(arr2);
        System.out.println("\nafter");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
