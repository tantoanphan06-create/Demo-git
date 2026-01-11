import java.util.Scanner;

public class XepLoaiHocSinh {
    public static void main(String[] args) {
        // Khai báo biến để lưu điểm
        double diem;

        // Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner kb = new Scanner(System.in);

        System.out.print("Nhap diem cua hoc sinh: ");
        diem = kb.nextDouble();

        // Xử lý xếp loại học sinh dựa trên điểm số
        if (diem >= 9) {
            System.out.println("Xep loai Gioi");
        } else if (diem >= 7) {
            System.out.println("Xep loai Kha");
        } else if (diem >= 5) {
            System.out.println("Xep loai Trung binh");
        } else if (diem >= 0) {
            System.out.println("Xep loai Yeu");
        } else {
            System.out.println("Diem khong hop le");
        }
        
        // Đóng scanner sau khi dùng xong (tốt cho bộ nhớ)
        kb.close();
    }
}