/*Question 3: You are given an array prices where prices[i] is the price of a given stock on
the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input:
prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation:
Example 2:
Input:
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because
you must buy before you sell.
Prices = [7, 6, 4, 3, 1]
Output: 0
Explanation:
In this case, no transactions are done and the max profit = 0.*/
public class ArraysAssignmentQ3 {
    public static int maxProfit (int prices[]){
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]){
                profit = Math.max(prices[i] - buy,profit );
            }else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main (String[]args){
        int prices[] = {7,1,5,3,6,4};
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + maxProfit(prices2)); // Output: 0
    }
}
