package BaiTap;

import java.sql.Array;
import java.util.Map;
import java.util.TreeMap;

public class Bai2 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        int max1=0;
        int max2=0;
        int min=100;
        int [] arr= new int[10];
        for (int i = 0;i<arr.length;i++){
            arr[i]=  (int) Math.round(Math.random()*100);
            treeMap.put(arr[i],0);
        }
        for (int key:treeMap.keySet()){
            if(max1<key){
                max2=max1;
                max1=key;
            if(min>key){
                min=key;
            }
            }
        }
        System.out.println("mảng Key là" +treeMap.keySet());
        System.out.println("Key lớn thứ 2 là " + max2);
        System.out.println("Key Nhỏ nhất là " + min);
    }
}
