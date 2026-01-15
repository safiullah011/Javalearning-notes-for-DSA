
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
    //clear ith bit 
    public static int updateithbit(int n,int i,int newbit) {
        if(newbit == 0) {
            return clearbit(n,i);
        } else {
            return setbit(n,i);
        }
    }
    //clear last ith bit
    public static int clearithbit(int n , int i) {
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    //clear bit in range 
    public static int clearIbits(int n,int i , int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    //Finding the any number is power of 2 or not
    public static boolean ispoweroftwo(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(8));
    }
}


