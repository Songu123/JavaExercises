import java.util.Scanner;

public class Main {
    public static void maxRange(int a[], int n){
        int max = 0, tong = 0;
        int viTriThuNhat = 0;
        int viTriThuHai = 0;
        for (int i = 0; i < n -1; i++) {
            tong = a[i];
            for (int j = i + 1; j < n; j++) {
                tong = tong + a[j];
                if(max < tong){
                    max = tong;
                    viTriThuNhat = i;
                    viTriThuHai = j;
                }
            }
        }
        System.out.println("Tổng dãy lớn nhất là: " + max);
        System.out.println("Bắt đầu từ vị trí thứ " + viTriThuNhat + " đến " + viTriThuHai + " trong dãy số.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thứ " + i + ":");
            a[i] = sc.nextInt();
        }
        System.out.print("Dãy số là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        maxRange(a, n);
    }
}