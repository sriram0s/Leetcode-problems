class Solution {
    public int commonFactors(int a, int b) {
        int j=0;
        if(a<b){
            int t=a;
            a=b;
            b=t;
        }
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                j++;
            }
        }
        return j;
    }
}