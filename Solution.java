

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);//9
        System.out.println(array[10]);//10
    }

    public static void sort(int[] array) {
       int a;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                    if(array[i]>array[j]){ // 0 1
                        a = array[i]; //0
                        array[i] = array[j];// 1
                        array[j] = a;
                    }
            }


        }//напишите тут ваш код
    }
}
