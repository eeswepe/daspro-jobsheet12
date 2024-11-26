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
        rekursif(5);
        System.out.println();
        iteratif(5);
    }
}
