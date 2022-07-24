package src.main.java.chapter1;

/**
 * @author 潘先生
 * @project AdvancedAlgoirthm
 * @package src.main.java.chapter1
 * @date 2022/7/24 21:45
 * @mail p_lord@163.com
 */
public class Test03_eat {
    public static void main(String[] args) {
        System.out.println(winner(9));
    }

    public static String winner(int n){
        final String first = "先手";
        final String second = "后手";

        if (n < 5)
            return  (n ==0 || n== 2)? second : first;

        int base = 1;
        while (base <= n){
            if (winner(n-base).equals(second))
                return "先手";
            if (base > n/4)
                break;
            base *= 4;
        }

        return second;
    }
}
