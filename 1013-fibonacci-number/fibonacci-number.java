class Solution {
    public int fib(int n) {
        int a=0,b=1,c=0;
        int i=1;
        while(i<=n){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return (a);
    }
}