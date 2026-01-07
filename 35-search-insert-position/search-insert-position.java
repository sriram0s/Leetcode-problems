class Solution {
    public int searchInsert(int[] n, int t) {
        int c=-1;
        if(n[0]>t) c=0;
        else if(n[n.length-1]<t) c=n.length;
        if(c==-1){
            for(int i=0;i<n.length;i++){
            if(n[i]==t) c=i;
        }
        }
        if(c==-1){
            for(int i=1;i<n.length;i++){
                if(t>n[i-1]&&t<n[i]) c=i;
            }
        }
        return c;
    }
}