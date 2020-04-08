import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi nhap vao so can check:");
        int number = scanner.nextInt();
        if (checkSoNguyenTo(number)==true){
            System.out.println(number+" la so nguyen to!");
        }else {
            System.out.println(number+" khong phai so nguyen to!");
        }
    }

    static boolean checkSoNguyenTo(int n){
        int dem =0;
        if (n<2){
            return false;
        }else {
            for (int i=2; i<=n/2;i++){
                if (n%i==0){
                    dem++;
                }
            }
            if (dem<1)
                return true;
            return false;
        }
    }
}
