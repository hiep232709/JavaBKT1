package BaiKiemTra01;

public class Cau4 {

//    Viết chương trình thực hiện:
//    Liệt kê 10 số nguyên tố đầu tiên
//    Liệt kê các số nguyên tố nhỏ hơn 10

    public static void main(String[] args) {
        int count = 0;
        int numb = 2;
        System.out.print("Muoi so nguyen to dau tien la: ");
        while (count<10){
            if(isPrimeNumber(numb)){
                System.out.print(numb + "  ");
                count++;
            }
            numb++;
        }
        System.out.print("\nCac so nguyen to nho hon 10 la: ");
        int numb2 = 2;
        for(int i = 2; i < 10; i++){
            if(isPrimeNumber(numb2)){
                System.out.print(numb2 + "  ");
                count++;
            }
            numb2++;
        }
    }


    public static boolean isPrimeNumber(int numb) {
        if (numb < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(numb);
        for (int i = 2; i <= squareRoot; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
