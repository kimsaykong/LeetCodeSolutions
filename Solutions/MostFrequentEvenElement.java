package Solutions;
import java.util.*;

// Easy problem
//Given an integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.
// Example 1:
// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.
public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums) {
            if (i%2==0){
                if (map.containsKey(i)){
                    map.replace(i,map.get(i).intValue(),map.get(i).intValue()+1);
                }
                else map.put(i,1);
            }
        }
        int max=-1,num=-1,result=-1;
        for (Map.Entry<Integer,Integer> k: map.entrySet()) {
            if (num==-1 && map.size() > 1) num = k.getValue();
            if (k.getValue()>max){
                result = k.getKey();
                max = k.getValue();
            }
        }
        return num==max?-1:result;
    }
}
