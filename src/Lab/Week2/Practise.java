import java.util.HashMap;
import java.util.Map;


class Practise{

    public static void main(String[] args){
        int arr[] = {9,6,4,3,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : map.keySet()){
            System.out.println(num);
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}