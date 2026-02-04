public class Recursion {
    public static void printdec (int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1) ;
    }
    public static void printinc(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printinc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 12;
        printinc(n);
    }
}
