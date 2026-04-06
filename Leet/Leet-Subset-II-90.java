class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        recu(0,nums,new ArrayList<>(),ans);
        return ans;   
    }

    public void recu(int a, int [] arr, List<Integer> temp,List<List<Integer>> ans){

            ans.add(new ArrayList<>(temp));
        for(int i=a;i<arr.length;i++){
            if(i>a && arr[i] == arr[i-1]) continue;
            temp.add(arr[i]);
            recu(i+1,arr,temp,ans);
            temp.remove(temp.size()-1);
        }
        
    }
}