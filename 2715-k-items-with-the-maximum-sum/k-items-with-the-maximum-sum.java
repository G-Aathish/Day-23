class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes) {
            return k;
        }
        
        k -= numOnes;
        int sum = numOnes;
        
        if (k <= numZeros) {
            return sum;
        }
        
        k -= numZeros;
        
        return sum - k;
    }
}
