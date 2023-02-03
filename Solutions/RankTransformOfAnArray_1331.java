package Solutions;
//Easy problem

//Given an array of integers arr, replace each element with its rank.
// The rank represents how large the element is. The rank has the following rules:
//      - Rank is an integer starting from 1.
//      - The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
//      - Rank should be as small as possible.

/* My thought
* clone original array to a temporary array
* sort the temporary array using Arrays sorted function
* store value of temporary as key in hashmap
* */

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray_1331 {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = arr.clone();
        int duplicate = 0;
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            if (!map.containsKey(temp[i])) map.put(temp[i],i+1-duplicate);
            else duplicate++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]).intValue();
        }
        return arr;
    }
}
