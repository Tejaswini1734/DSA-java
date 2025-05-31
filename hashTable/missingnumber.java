public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
   
        HashMap<Integer,Integer> freqA=new HashMap<>();
        HashMap<Integer,Integer> freqB=new HashMap<>();
        
        for(int num:arr){
            freqA.put(num,freqA.getOrDefault(num,0)+1);
        }
        for(int num:brr){
            freqB.put(num,freqB.getOrDefault(num,0)+1);
        }
        HashSet cnt=new HashSet<>();
        for(int numbers:freqB.keySet()){
            int cntB=freqB.get(numbers);
            int cntA=freqA.getOrDefault(numbers,0);
            if(cntA<cntB){
                cnt.add(numbers);
            }
        }
        List res=new ArrayList<>(cnt);
        Collections.sort(res);
        return res;

    }
