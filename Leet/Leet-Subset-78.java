import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recu(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void recu(int[] ar, int i, List<Integer> temp, List<List<Integer>> ans) {
        if (i == ar.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(ar[i]);
        recu(ar, i + 1, temp, ans);

        temp.remove(temp.size() - 1);
        recu(ar, i + 1, temp, ans);
    }
}