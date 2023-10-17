package BaiTap;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 2, -1, 5, 4, 2, 3};
        Map<Integer, Integer> map = new HashMap();
        int max = 0;
        int max2=0;
        for (int i = 0; i < arr.length; i++) {
            int cout = 1;
            max = 0;
            max2 = 0;
            if (map.containsKey(arr[i])) {
                continue;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        cout++;
                    }
                }

                map.put(arr[i], cout);
            }
        }
        for (int value : map.values()){
            if(value>max){
                max=value;
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==max){
max2=entry.getKey();
            }
        }
        System.out.println(map.entrySet());
        System.out.println("Vậy số có số lần xuất hiện nhiều nhất là" +max2+"với" + max+"số lần xuất hiện");
    }
}
