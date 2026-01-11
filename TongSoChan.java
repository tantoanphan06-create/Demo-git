import java.util.Scanner;

public class TongSoChan {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        int n = kb.nextInt();
        
        int tong = 0;
        
        // Vòng lặp chạy từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Điều kiện số chẵn: i chia hết cho 2 (dư 0)
            if (i % 2 == 0) {
                tong = tong + i;
            }
        }
        
        System.out.println("Tong cac so chan tu 1 den " + n + " la: " + tong);
        
        kb.close();
    }
}