class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int cnt=0;
        for(int i=0;i<dominoes.length;i++){
            for(int j=i+1;j<dominoes.length;j++){
                int a=dominoes[i][0],b=dominoes[i][1];
                int c=dominoes[j][0],d=dominoes[j][1];
                if((a==c && b==d) || (a==d && b==c)){
                    cnt++;

                }
            }
        }
        return cnt;
    }
}
