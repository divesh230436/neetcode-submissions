class Solution {
    public int maxProfit(int[] prices) {
        int i=prices[0];
        int prof=0;
        for(int price:prices){
            prof=Math.max(prof,price-i);
            if(price<i)i=price;
        }
        return prof;

        
    }
}
