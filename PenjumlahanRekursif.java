public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }    

    public static void main(String[] args) {
        System.out.println(penjumlahanRekursif(5));
    }

}
