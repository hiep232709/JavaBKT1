package BaiKiemTra01;

public class Cau3 {

    public static void main(String[] args) {
        double numberRoot = Math.random();
        numberRoot = numberRoot * 1000;
        int number = (int) numberRoot;
        System.out.println("Ta co so ngau nhien la: " + number);
        primeNumber(number);
    }


    public static int primeNumber(int number){
        int count = 0;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("Day la so nguyen to");
        } else {
            System.out.println("Day khong phai la so nguyen to");
        }
        return number;
    }
}

