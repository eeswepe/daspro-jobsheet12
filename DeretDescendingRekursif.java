import java.util.Scanner;

public class DeretDescendingRekursif {
    static void rekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            rekursif(n - 1);
        }
    }

    static void iteratif(int n){
        for(int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Deret Descending Rekursif");
        Scanner sc = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        rekursif(bilangan);
        System.out.println();
        iteratif(bilangan);
        sc.close();
    }
}
