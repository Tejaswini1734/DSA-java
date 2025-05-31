    public static String balancedSums(List<Integer> arr) {

        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        int leftsum=0;
        for(int i=0;i<arr.size();i++){
            int curr=arr.get(i);
            int rightsum=sum-leftsum-curr;
            if(leftsum==rightsum){
                return "YES";
            }
            leftsum+=curr;
        }
        return "NO";
        

    }
