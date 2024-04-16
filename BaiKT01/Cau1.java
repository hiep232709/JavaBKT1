package BaiKiemTra01;

public class Cau1 {
    public static void main(String[] args) {
        System.out.println("1. In ra hinh chu nhat");
        String [][] star = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
        };
        for(int i = 0; i < star.length; i++){
            for(int j = 0; j < star[i].length; j++){
                System.out.print(star[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n2. In ra hinh tam giac");
        String [][] star2 = {
                {"*", " ", " ", " "},
                {"*", "*", " ", " "},
                {"*", "*", "*", " "},
                {"*", "*", "*", "*"},
        };
        for(int a = 0; a < star2.length; a++){
            for(int b = 0; b < star2[a].length; b++){
                System.out.print(star2[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
