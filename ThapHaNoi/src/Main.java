import java.util.Scanner;

public class Main {
     static String[] arr = {"A","B","C"};
     static int dem = 0;
    public static void sapDia(int n, int i, int j, int k){
        if(n == 1){
            System.out.println("Chuyen dia " + n + " tu cot " +  arr[i] + " sang " + arr[j]);
            dem = dem + 1;
        }else{
            sapDia(n - 1,i, k,j);
            System.out.println("Chuyen dia " + n + " tu cot " +  arr[i] + " sang " + arr[j]);
            dem = dem + 1;
            sapDia(n - 1,k, j, i);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng đĩa: ");
        n = sc.nextInt();
        sapDia(n, 0,2,1);
        System.out.println("Số bước: " + dem);
    }
}