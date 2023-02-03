package Solutions;

import java.util.Arrays;

public class ShortestDistanceToTargetStringInACircularArray_2515 {
    public int closetTarget(String[] words, String target, int startIndex) {
        for (int i = 0; i < words.length; i++) {
            if (words[(startIndex+i) % words.length].equals(target) ||
                words[(startIndex-i+ words.length) % words.length].equals(target)) return i;
        }
        return -1;
    }
}
