// leetcode 121. Best Time to Buy and Sell Stock

// approach:

// 1. take min till now and track max profit till now 
// ex. [7,1,5,3,6,4]

// at day 1 : min=7 maxprofit=0 
// day2: min=1 maxprofit=0 
// day3: min=1 mazprofit=4
// .
// .
// .
// day4 min=1 maxprofit = 4
// day5 min =1 maxprofit= 5

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max_p=0;
        for (int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min > max_p){
                max_p = prices[i]-min;
            }
        }
        return max_p;
    }
}