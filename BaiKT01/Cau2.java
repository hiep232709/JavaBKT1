package BaiKiemTra01;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi bat ky: ");
        String str = sc.nextLine();
        char space = ' ';
        char tab = '\t';
        char brkLine = '\n';
        char oChar = 'o';
        int strSize = str.length();

// Đếm số từ trong chuỗi
        int count = 0;
        for (int i = 0; i < strSize; i = i + 1){
            if (str.charAt(i) == space || str.charAt(i) == tab || str.charAt(i) == brkLine || i == strSize - 1){
                count = count + 1;
                continue;
            }
        }
        System.out.println(" - Chuoi nay co " + count + " tu.");


// Đếm và in ra index của các ký tự 'o' trong chuỗi
        int countoChar = 0;
        System.out.print(" - Vi tri cac ky tu 'o' cua chuoi tai cac index sau: ");
        for (int i = 0; i < strSize; i = i + 1){
            if (str.charAt(i) == oChar){
                countoChar = countoChar + 1;
                System.out.print(i + "  ");
                continue;
            }
        }
        System.out.println("\n - So luong ky tu 'o' trong chuoi la: " + countoChar);
    }
}
