import java.util.Scanner;

public class TongSoLe {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        int n = kb.nextInt();
        
        int tong = 0;
        
        // Chạy vòng lặp từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Kiểm tra nếu i là số lẻ (không chia hết cho 2)
            if (i % 2 != 0) {
                tong = tong + i;
            }
        }
        
        System.out.println("Tong cac so le tu 1 den " + n + " la: " + tong);
        
        kb.close();
    }
}
