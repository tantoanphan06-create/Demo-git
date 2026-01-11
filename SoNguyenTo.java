import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Nhap vao so n: ");
        int n = kb.nextInt();
        
        // Gọi hàm kiểm tra và in kết quả
        if (kiemTraSNT(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong phai la so nguyen to.");
        }
        
        kb.close();
    }

    // Hàm logic kiểm tra số nguyên tố
    public static boolean kiemTraSNT(int n) {
        if (n < 2) {
            return false; // Số nhỏ hơn 2 không phải SNT
        }
        // Kiểm tra từ 2 đến căn bậc hai của n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu chia hết cho số nào đó thì không phải SNT
            }
        }
        return true; // Nếu không chia hết cho số nào thì là SNT
    }
}
