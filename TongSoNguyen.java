import java.util.Scanner;

public class TongSoNguyen {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        int n = kb.nextInt();
        
        int tong = 0;
        int i = 1; // Biến đếm bắt đầu từ 1
        
        // Sử dụng vòng lặp while để cộng dồn
        while (i <= n) {
            tong = tong + i;
            i++; // Tăng biến đếm để không bị lặp vô hạn
        }
        
        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
        
        kb.close();
    }
}
