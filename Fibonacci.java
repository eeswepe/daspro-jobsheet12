import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if(n ==1 || n==2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bulan;

        System.out.print("Masukkan jumlah bulan: ");
        bulan = sc.nextInt();

        System.out.println("Total Pasangan pada bulan ke-" + bulan + " adalah " + fibo(bulan) + " pasangan.");
        sc.close();
    }

}
