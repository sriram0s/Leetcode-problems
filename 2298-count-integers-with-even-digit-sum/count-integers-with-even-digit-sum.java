class Solution {
    public int countEven(int n) {
        int a=0;
        for(int i=1;i<=n;i++){
            int x=i;
            int s=0;
            while(x!=0){
                s+=x%10;
                x/=10;
            }
            if(s%2==0){
                a++;
            }
        }
        return a;
    }
}