class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 1; // start with 1 to handle left boundary

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {
                count++;

                if (count == 3) {
                    n--;
                    count = 1; // reset to 1 (important fix)
                }
            } 
            else {
                count = 0;
            }
        }

        // handle right boundary
        if (count == 2) n--;

        return n <= 0;
    }
}