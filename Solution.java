
public class Solution {

    public int majorityElement(int[] nums) {

        int elementWithFrequencyGreaterThanHalf = 0;
        int balanceOfOccurence = 0;
        for (int n : nums) {
            if (balanceOfOccurence == 0) {
                elementWithFrequencyGreaterThanHalf = n;
            }
            balanceOfOccurence += (elementWithFrequencyGreaterThanHalf == n) ? 1 : -1;
        }

        /*
        The Boyer-Moore Majority Voting Algorithm requires a second iteration 
        for checking whether the frequency of the found element is
        actually greater than half. 
        
        However, for this particular case, it is not necessary because 
        the problem statement guarantees that there is such element.
         */
        return elementWithFrequencyGreaterThanHalf;
    }
}
