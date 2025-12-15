class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        boolean bulky = false;
        boolean heavy = false;
        if(l >= 10000 || w >= 10000 || h >= 10000 ||
            (long) l * w * h >= 1000000000L){
            bulky = true;
        }if(m>=100){
            heavy = true;
        }
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}