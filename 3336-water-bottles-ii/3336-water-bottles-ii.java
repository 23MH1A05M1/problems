class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrink=numBottles;
        int empty=numBottles;
        
         while (empty >= numExchange) {
            // exchange once
            empty -= numExchange;  // spend empties
            numExchange++;         // requirement increases
            totalDrink++;          // drink the new full bottle
            empty++;               // after drinking, one more empty
        }
        return totalDrink;
    }
}