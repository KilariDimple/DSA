class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int middle = left + (right - left) / 2;
            if (mountainArr.get(middle) < mountainArr.get(middle + 1))
                left = middle + 1;
            else
                right = middle;
        }

        int peak = left;

        int res = mountain(mountainArr, target, 0, peak, true);
        if (res != -1)
            return res;

        return mountain(mountainArr, target, peak + 1, n - 1, false);
    }

    static int mountain(MountainArray mountainArr, int target,
                        int left, int right, boolean ascending) {

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int val = mountainArr.get(middle);

            if (val == target)
                return middle;

            if (ascending) {
                if (val < target)
                    left = middle + 1;
                else
                    right = middle - 1;
            } else {
                if (val > target)
                    left = middle + 1;
                else
                    right = middle - 1;
            }
        }

        return -1;
    }
}