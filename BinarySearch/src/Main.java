public class Main {
    public static int binarySearch(int a[], int n, int left, int right, int s) {
        if (left == right) {
            if (a[left] == s) {
                return left;
            } else {
                return 0;
            }
        } else {
            int mid = (left + right)/ 2;
            if (a[mid] == s) {
                return mid;
            } else {
                if (a[mid] < s) {
                    return binarySearch(a, n, mid + 1, right, s);
                } else {
                    return binarySearch(a, n, left, mid - 1, s);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {6, 7, 10, 11, 12, 14};
        int length = a.length;
        int left = 0;
        int right = length - 1;
        int s = 10;
        System.out.println("Vị trí tìm là: " +
                binarySearch(a, length, left, right, 10)
        );
    }
}