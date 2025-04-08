class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a1= new ArrayList<Integer>();
        ArrayList<Integer> a2= new ArrayList<Integer>();
        ArrayList<Integer> main= new ArrayList<Integer>();
        for(int i:nums1){
            a1.add(i);
        }
        for(int i:nums2){
            a2.add(i);
        }
        for(int i:a1){
            if(a2.contains(i)){
                main.add(i);
                a2.remove(Integer.valueOf(i));//remove first element with value i
            }
        }
        int[] a=new int[main.size()];
        int k=0;
        for(int i:main){
            a[k]=i;
            k++;
        }
        return a;
    }
}
