package BaiKiemTra01;

//    Câu 6 (Nâng cao)
//    Viết chương trình nhập vào từ bàn phím email và số điện thoại, kiểm tra email và số điện thoại đó có hợp lệ không.
//    - Email phải đúng định dạng
//    - Số điện thoại có chứa từ 9 đến 11 chữ số
//    Gợi ý: Sử dụng regex https://viettuts.vn/java/su-dung-regex-trong-java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào email của bạn: ");
        String email = sc.nextLine();
        while (!isValidEmail(email)){
            System.out.print("Nhập sai email vui lòng nhập lại: ");
            email = sc.nextLine();
        }
        System.out.print("Nhập vào SĐT của bạn: ");
        String phone = sc.nextLine();
        while (!isValidSDT(phone)){
            System.out.print("Số điện thoại phải từ 9 đến 11 ký tự vui lòng nhập lại: ");
            phone = sc.nextLine();
        }

        System.out.println("---Thông tin---");
        System.out.println("Email: "+email);
        System.out.println("SDT: "+phone);
    }
    public static boolean isValidEmail(String email){
        String regexEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return Pattern.matches(regexEmail, email);
    }
    public static boolean isValidSDT(String phone){

        String regexSDT = "[0-9]{9,11}$";
        return Pattern.matches(regexSDT, phone);
    }
}
