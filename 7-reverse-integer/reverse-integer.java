class Solution {
    public int reverse(int x) {
        long reverse =0;
        while(x!=0){
            int lastdigit = x%10;
            x=x/10;
            reverse =reverse*10+lastdigit;
        }
        if(reverse<Math.pow(2,31)&& reverse>=Math.pow(-2,31))
        return (int ) reverse;
        return 0;
    }
}