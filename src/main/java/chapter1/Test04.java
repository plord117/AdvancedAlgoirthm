package src.main.java.chapter1;

/**
 * @author екохиЗ
 * @project AdvancedAlgoirthm
 * @package src.main.java.chapter1
 * @date 2022/7/24 23:23
 * @mail p_lord@163.com
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(minPaint("RGRGR"));
    }

    public static int minPaint(String s){
        if (s == null || s.length() < 2){
            return 0;
        }

        char[] chars = s.toCharArray();
        int minPaint = Integer.MAX_VALUE;

        for (int i = -1; i < chars.length; i++) {
            int tempPaint = 0;
            for (int j=i+1; j<chars.length; j++){
                if ('R' == chars[j]){
                    tempPaint += 1;
                }
            }

            for (int j=0; j<=i; j++){
                if ('G' == chars[j]){
                    tempPaint += 1;
                }
            }

            minPaint = Math.min(minPaint, tempPaint);
        }

        return minPaint;
    }
}
