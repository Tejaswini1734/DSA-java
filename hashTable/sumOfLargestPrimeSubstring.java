class Solution {
   
        public static boolean isprime(long n){
            if(n<=1){
            return false;
            }
            if(n==2){
            return true;
             }
        if(n%2==0) return false;
            long sqrt=(long) Math.sqrt(n);
        for(int i=3;i<=sqrt;i+=2){
            if(n%i==0) return false;
        }
        return true;
        }
    
 public long sumOfLargestPrimes(String s) {
     Set<Long> primes=new HashSet<>();
     int n=s.length();
     for(int i=0;i<n;i++){
         StringBuilder sb=new StringBuilder();
         for(int j=i;j<n;j++){
             sb.append(s.charAt(j));
             long number=Integer.parseInt(sb.toString());
             if(isprime(number)){
                 primes.add(number);
             }
         }
     }
     List<Long> sortedprimes=new ArrayList<>(primes);
     Collections.sort(sortedprimes,Collections.reverseOrder());
     long sum=0;
     int cnt=Math.min(3,sortedprimes.size());
     for(int i=0;i<cnt;i++){
         sum+=sortedprimes.get(i);
     }
     return sum;
 }
}©leetcode
