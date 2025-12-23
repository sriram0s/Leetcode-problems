class Solution {
    public boolean isThree(int n) {
        int x=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                x++;
            }
        }
        if(x==3){
            return true;
        }
        else{
            return false;
        }
    }
}