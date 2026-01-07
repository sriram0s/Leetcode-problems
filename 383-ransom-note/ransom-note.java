class Solution {
    public boolean canConstruct(String r, String m) {
        int c=0;
        int[] arr=new int[m.length()];
        for(int i=0;i<r.length();i++){
            for(int j=0;j<m.length();j++){
                if(r.charAt(i)==m.charAt(j)&&arr[j]!=1){
                    c++;
                    arr[j]=1;
                    break;
                }
           } 
        }
        if(r.length()==c){
            return true;
        }
        else{
            return false;
        }
    }
}