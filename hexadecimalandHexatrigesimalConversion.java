class Solution {
    public String concatHex36(int n) {
        if(n==0){
            return "0";
        }
        int n1=n*n;
        int n2=n*n*n;
        String Hexadecimal=Integer.toHexString(n1).toUpperCase();
        String b36=Integer.toString(n2,36).toUpperCase();
        return Hexadecimal+b36;
        
    }
}
