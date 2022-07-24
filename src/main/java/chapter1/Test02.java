package src.main.java.chapter1;

/**
 * @author екохиЗ
 * @project AdvancedAlgoirthm
 * @package src.main.java.chapter1
 * @date 2022/7/24 20:55
 * @mail p_lord@163.com
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(getNum(100, 6, 8));
    }

    public static int getNum(int n, int x, int y){
        if (n < 0)
            return -1;

        int maxPar, minPar;

        maxPar = Math.max(x, y);
        minPar = Math.min(x, y);

        int maxBag = n / maxPar;

        while (maxBag != 0){
            int rest = n - maxPar * maxBag;
            int minBag = rest / minPar;

            if (minBag * minPar + maxBag * maxPar == n){

                return maxBag + minBag;
            }

            maxBag -= 1;
        }

        return -1;
    }
}
