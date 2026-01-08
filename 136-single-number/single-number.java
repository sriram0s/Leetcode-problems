class Solution {
    public int singleNumber(int[] n) {
        int a=n.length;
        int x=0;
        for(int i=0;i<a;i++){
            x=0;
            for(int j=0;j<a;j++){
                if(n[i]==n[j]){
                    x++;
                }
            }
            if(x==1){
                return n[i];
            }
        }
        return x;
    }
}