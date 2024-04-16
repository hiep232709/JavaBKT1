package BaiKiemTra01;

import java.util.Scanner;

public class Cau5 {
//    Câu 5
//    Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
//    Thực hiện:
//    Nhập các phần tử mảng
//    In thông tin mảng ra màn hình
//    Liệt kê các phần tử nằm trên đường chéo chính
//    Tạo thêm 1 mảng hai chiều có cùng số dòng và số cột thực hiện cộng hai mảng với nhau
    public static void main(String[] args) {
// TẠO MẢNG 2 CHIỀU THỨ NHẤT
        System.out.println("========TAO MANG 2 CHIEU THU NHAT========\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong cua mang: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int column = sc.nextInt();

        int[][] arr;
        arr = new int[row][column];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" - Phan tu o vi tri arr[" + i + "][" + j + "] la: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sau khi nhap cac phan tu, ta co mang nhu sau: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Cac phan tu nam tren duong cheo chinh lan luot la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    continue;
                }
            }
        }

// TẠO MẢNG 2 CHIỀU THỨ HAI
        System.out.println("\n\n========TAO MANG 2 CHIEU THU HAI========\n");
        System.out.println("Mang 2 chieu thu 2 co cung so dong va so cot voi mang 2 chieu thu nhat");

        int[][] arr2;
        arr2 = new int[row][column];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" - Phan tu o vi tri arr2[" + i + "][" + j + "] la: ");
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sau khi nhap cac phan tu, ta co mang nhu sau: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("\n");
        }

        System.out.println("========THUC HIEN CONG HAI MANG========\n");
        System.out.println("Sau khi cong hai mang o tren, ta co mang moi nhu sau: ");
        int[][] arr3;
        arr3 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
