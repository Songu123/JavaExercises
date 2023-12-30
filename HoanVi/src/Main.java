import java.util.Scanner;

public class Main {

    static int dem = 0;

    public static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        dem = dem + 1;
        System.out.println();
    }

    public static void heapPermutation(int arr[], int size, int n) {
        if (size == 1) {
            print(arr, n);
        } else {
            for (int i = 0; i < size; i++) {
                heapPermutation(arr, size - 1, n);
                if (size % 2 != 0) {
                    int temp = arr[0];
                    arr[0] = arr[size - 1];
                    arr[size - 1] = temp;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[size - 1];
                    arr[size - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số lượng phần tử: ");
//        int n = sc.nextInt();
        int[] a = {1, 2, 3, 4};
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập số thứ " + i + ": ");
//            a[i] = sc.nextInt();
//        }
        heapPermutation(a, a.length, a.length);
        System.out.println("Số cách: " + dem);
    }
}