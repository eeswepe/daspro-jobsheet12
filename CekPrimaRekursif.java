import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrima(int n, int i) {
        if(n<=2){
            if(n==2){
                return true;
            }else{
                return false;
            }
        }else if(n%i==0){
            return false;
        }else if(i*i > n){
            return true;
        }else{
            return cekPrima(n, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pembantuHitung = 2;
        int bilangan;
        System.out.print("Masukkan bilangan: ");    
        bilangan = sc.nextInt();
        if(cekPrima(bilangan, pembantuHitung)){
            System.out.println(bilangan + " adalah bilangan prima");
        }else{
            System.out.println(bilangan + " bukan bilangan prima");
        }
        sc.close();
    }
}