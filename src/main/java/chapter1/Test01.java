package src.main.java.chapter1;

import java.util.ArrayList;

/**
 * @author екохиЗ
 * @project AdvancedAlgoirthm
 * @package src.main.java.chapter1
 * @date 2022/7/24 20:42
 * @mail p_lord@163.com
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 8, 9, 12};
        System.out.println(getMaxLength(arr, 5));
    }

    public static int getMaxLength(int[] arr, int len){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int start;
        int counter;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            start = arr[i];
            counter = 1;

            for (int j=i+1; j<arr.length; j++){
                if(arr[j] - start <= len){
                    counter += 1;
                }
                else{
                    list.add(counter);
                    break;
                }
            }
        }

        list.sort((a, b) -> b-a);

        return list.get(0);
    }
}
