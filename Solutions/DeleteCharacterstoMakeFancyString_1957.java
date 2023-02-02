package Solutions;
// Easy Problem

// A fancy string is a string where no three consecutive characters are equal.
// Given a string s, delete the minimum possible number of characters from s to make it fancy.
// Return the final string after the deletion. It can be shown that the answer will always be unique.

//Example 1:
// Input: s = "leeetcode"
// Output: "leetcode"
// Explanation:
// Remove an 'e' from the first group of 'e's to create "leetcode".
// No three consecutive characters are equal, so return "leetcode".

public class DeleteCharacterstoMakeFancyString_1957 {
    public String makeFancyString(String s) {
        char[] result = new char[s.length()];
        int step = 0;
        char c1 =' ',c2 =' ';
        for (char i:s.toCharArray()) {
            if (c1==c2 && c2 !=i){
                c1=c2;
                c2=i;
                result[step] = i;
                step++;
            }
            else if (c1!=c2){
                c1=c2;
                c2=i;
                result[step] = i;
                step++;
            }
        }
        return String.valueOf(result).trim();
    }
}
