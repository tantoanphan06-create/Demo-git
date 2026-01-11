import java.util.Scanner;

public class TongNguyenDuong {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = kb.nextInt();
        
        // Kiểm tra nếu n không phải số dương
        if (n <= 0) {
            System.out.println("Vui long nhap so lon hon 0!");
        } else {
            int tong = 0;
            // Vòng lặp chạy từ 1 đến n
            for (int i = 1; i <= n; i++) {
                tong += i; // tương đương với tong = tong + i;
            }
            System.out.println("Tong cac so tu 1 den " + n + " la: " + tong);
        }
        
        kb.close();
    }
}
