class Solution {
    public int missingNumber(int[] n) {
        int x= 0;
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(i!=n[i]){
                return i;
            }
            x++;
        }
        
        return x;
    }
}