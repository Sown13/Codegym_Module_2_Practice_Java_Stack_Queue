package ex2;
import java.util.Arrays;
import java.util.Map;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String string = "Hello con bo ga con lon con meo con cho";
        String[] strArr = string.split(" ");
        System.out.println(Arrays.toString(strArr));
//        Map<String, Integer> list = new TreeMap<>();
        TreeMap<String, Integer> list = new TreeMap<>();
        for(String str : strArr){
            if (!list.containsKey(str)){
                list.put(str,1);
            } else {
                list.put(str, list.get(str)+1);
            }
        }
        System.out.println(list.get("con"));
        System.out.println(list);

        int number = 4;
        System.out.println(Integer.toBinaryString(35));
        System.out.printf("%x",17);
    }
}
