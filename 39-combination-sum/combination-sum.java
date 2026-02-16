import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, new ArrayList<>(), target, result, 0);
        return result;
    }

    void combination(int[] candidates, List<Integer> tempList,
                     int target, List<List<Integer>> result, int start) {

        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            int num = candidates[i];

            if (num <= target) {
                tempList.add(num);
                combination(candidates, tempList, target - num, result, i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}