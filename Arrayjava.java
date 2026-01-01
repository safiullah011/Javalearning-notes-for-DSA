//Trapping rainwater theoryy
//Auxuliary array
//( waterlevel - barlevel ) * width = trapped water
// public static int trappedrain(int height[]){
//     int n = height.length;

//     int leftmax[] = new int[n];
//     int rightmax[] = new int[n];

//     leftmax[0] = height[0];
//     for(int i=1; i<n; i++){
//         leftmax[i] = Math.max(height[i], leftmax[i-1]);
//     }

//     rightmax[n-1] = height[n-1];
//     for(int i=n-2; i>=0; i--){
//         rightmax[i] = Math.max(height[i], rightmax[i+1]);
//     }

//     int trappedwater = 0;

//     for(int i=0; i<n; i++){
//         int waterlevel = Math.min(leftmax[i], rightmax[i]);
//         trappedwater += waterlevel - height[i];
//     }

//     return trappedwater;
// }
public class Arrayjava {

    public static int buyandsell(int prices[] ) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }

        return maxprofit;
    }

    public static void main(String args[]) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyandsell(prices));
    }
}

