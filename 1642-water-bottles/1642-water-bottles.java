class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrink=numBottles;
        int empty = numBottles;
        while( empty>=numExchange)
        {
            totalDrink+=empty/numExchange;
            empty= empty/numExchange + empty%numExchange;
        }
        return totalDrink;
    }
}