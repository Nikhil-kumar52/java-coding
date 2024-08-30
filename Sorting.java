public class Sorting {
    public static void bubbleSort(int array[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSort(array, n - 1);
    }

    public static void main(String args[]) {
        int array[] = {2, 4, 6, 7, 1, 3};
        bubbleSort(array, array.length);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
