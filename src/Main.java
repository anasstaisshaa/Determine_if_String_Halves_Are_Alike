import java.util.Arrays;
class Solution {
    public boolean halvesAreAlike(String s) {
        int countInA = 0;
        int countInB = 0;
        char[] strArray = s.toCharArray();
        for(int i = 0; i < strArray.length/2; i ++){
            if(strArray[i] == 'a'|| strArray[i] ==  'e' || strArray[i] ==  'i' || strArray[i] ==  'o' ||
                    strArray[i] ==  'u'|| strArray[i] == 'A'|| strArray[i] == 'E' || strArray[i] ==  'I' ||
                    strArray[i] == 'O' || strArray[i] == 'U'){
                countInA ++;
            }
        }
        for(int j = strArray.length/2; j < strArray.length; j ++){
            if(strArray[j] == 'a'|| strArray[j] ==  'e' || strArray[j] ==  'i' || strArray[j] ==  'o' ||
                    strArray[j] ==  'u'|| strArray[j] == 'A'|| strArray[j] == 'E' || strArray[j] ==  'I' ||
                    strArray[j] == 'O' || strArray[j] == 'U'){
                countInB++;
            }
        }
        return countInA == countInB;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "book";
        System.out.println(solution.halvesAreAlike(s));
    }
}