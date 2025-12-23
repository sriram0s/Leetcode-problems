class Solution {
    public int bitwiseComplement(int n) {
        int x=0;
        int p=1;
        if(n==0) return 1;
        while(n!=0){
            int t=n%2;
            if(t==0) t=1;
            else t=0;
            x=x+t*p;
            p=p*2;
            n/=2;
        }
        return x;
    }
}