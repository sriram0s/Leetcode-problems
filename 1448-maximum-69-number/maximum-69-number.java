class Solution {
    public int maximum69Number (int n) {
        int m=n;
        int t=0;
        int i=0;
        while(m!=0){
            t=(t*10)+(m%10);
            m/=10;
        }
        int a=0;
        while(t!=0){
            m=t%10;
            if(m==6&&i==0){
                m=9;
                i=1;
            }
            a=a*10+m;
            t/=10;
        }
        return a;
    }
}