import java.util.Scanner;

public class Main {
    public static void findRange(int a[], int n) {
        int max = 0;
        int count = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] < a[i + 1]) {
                count = count + 1;
                if (count > max) {
                    end = i + 1;
                    max = count;
                    start = end - max + 1;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("Dãy có giá trị tăng dần dài nhất bắt đầu từ ví trí thứ " + start + " đến vị trí thứ " + end + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng dãy số: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Dãy số là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        findRange(a, n);
    }
}