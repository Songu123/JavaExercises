import java.util.Scanner;

public class Main {
    public static double distance(double x1, double y1, double x2, double y2){
        double p = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y1, 2));
        return p;
    }

    public static void min(int x[], int y[], int n){
        double min = distance(x[1], y[1], x[2], y[2]);
        int a = 0, b = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double d = distance(x[i], y[i], x[j], y[j]);
                if(min > d){
                    a = i;
                    b = j;
                    min = d;
                }
            }
        }
        System.out.println("Khoảng cách ngắn nhất 2 điểm là d(" + a + ", "+ b +") = " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng điểm: ");
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm thứ " + i + 1 + ": ");
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("d(" + i + ", " + j + ") = " + distance(x[i], y[i], x[j], y[j]));
            }
        }
        min(x, y, n);
    }
}