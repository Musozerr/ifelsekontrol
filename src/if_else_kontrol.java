import java.util.Scanner;

public class if_else_kontrol {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz : ");
        int a = sc.nextInt();

        if (a > -100 && a < 100) {
            if (a < 5)
                System.out.println("Kayak Yapabilirsin ... ");
            else if (a <= 15) {
                System.out.println("Sinemaya Gidebilirsin ... ");
            }
            else if (a <= 25) {
                System.out.println("Piknik Yapabilirsin ... ");
            }
            else
                System.out.println("Yüzmeye Gidebilirsin ... ");
        }
        System.out.println("Lütfen Geçerli Bir Sıcaklık Giriniz!!!");
    }
    
}
