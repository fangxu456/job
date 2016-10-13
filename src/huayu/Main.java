package huayu;

import java.util.*;

//取出数组中出现两次的元素
public class Main {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,4};
        int[] result = getTow(input);
        for (int temp : result
             ) {
            System.out.println(temp);
        }
    }

    public static int[] getTow(int[] inputArray){
        Map hm = new HashMap();
        for(int i=0;i<inputArray.length;i++){
            //if(hm.get(inputArray[i])==null){
            if(!hm.containsKey(inputArray[i])){
                hm.put(inputArray[i],1);
            }else {
                int temp = (int)hm.get(inputArray[i]);
                hm.put(inputArray[i],++temp);
            }
        }
        List list = new ArrayList();

        /*Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            if(entry.getValue()==2){
                list.add(entry.getKey());
            }
        }*/

        Set set = hm.entrySet();
        for(Object obj : set){
            Map.Entry entry = (Map.Entry)obj;
            if(entry.getValue()==2){
                list.add(entry.getKey());
            }
        }

        int[] res = new int[list.size()];
        for(int i =0;i<res.length;i++){
            res[i]=(int)list.get(i);
        }
        return res;
    }
}
