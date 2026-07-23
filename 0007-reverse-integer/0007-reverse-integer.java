class Solution {
    public int reverse(int x) {
        int nums=Math.abs(x);
        int rev=0;
        while(nums!=0){
            int ld=nums%10;
            if(rev>(Integer.MAX_VALUE-ld)/10){
                return 0;
            }
            ld=nums%10;
            rev=rev*10+ld;
            nums=nums/10;
        }
         return (x<0)?-rev:rev;
        
    }
}

