class Solution {
    public int hammingWeight(int n) {
        int i=0;
        while(n!=0){
            int t=n%2;
            if(t==1) i++;
            n/=2;        
        }
        return i;
    }
}