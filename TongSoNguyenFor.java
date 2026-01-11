import java.util.Scanner;

public class TongSoNguyenFor {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        int n = kb.nextInt();
        
        int tong = 0;
        
        // Cấu trúc vòng lặp for: (khởi tạo; điều kiện; bước nhảy)
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        
        System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
        
        kb.close();
    }
}