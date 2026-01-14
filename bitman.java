
public class bitman {
    public static int getbit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    //Set ith bit
    public static int setbit(int n , int i) {
        int bitMask = 1<<i;
        return n|bitMask ;
    }
    //clear ith bit 
    public static int clearbit(int n , int i) {
        int bitMask = ~(1<<i);
        return n&bitMask ;
    }
    public static void main(String[] args) {
        System.out.println(clearbit(10,2));
    }
}
