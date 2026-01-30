class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(x<0) return false;
        int rev = 0;
        int lastid;
        while(x!=0){
            lastid=x%10;
            x/=10;
            rev= rev*10+lastid;
        }
        return temp==rev;
    }
}