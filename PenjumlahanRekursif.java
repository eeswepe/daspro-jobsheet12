import java.util.Scanner;

public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        System.out.println(penjumlahanRekursif(bilangan));
        sc.close();
    }

}
