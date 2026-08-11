class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int me = 0;
        int a = 0;
        int b = piles.length-1;
        while(a<b){
            b--;
            me+=piles[b];
            b--;
            a++;
        }
        return me;
    }
}