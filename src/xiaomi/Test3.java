package xiaomi;

import java.util.*;

/**
 * Created by FangXu on 2016/9/23.
 */
public class Test3 {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] numList = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        in.nextLine();
        for(int i=0;i<n;i++){
            list.clear();
            String str = in.nextLine();
            //System.out.println(str);
            HashMap<Character,Integer> hm = new HashMap<>();
            for(int j=0;j<str.length();j++){
                if(hm.get(str.charAt(j))==null){
                    hm.put(str.charAt(j),1);
                }else{
                    int count = hm.get(str.charAt(j))+1;
                    hm.put(str.charAt(j),count);
                }
            }
            while (!hm.isEmpty()) {
                for (String temp : numList) {
                    hm = minusTemp(numList,temp, hm);
                    System.out.println(temp);
                }
            }
            int[] bbb = new int[list.size()];
            for(int m =0;m<list.size();m++){
                System.out.println(list.get(m));
                bbb[m]=(list.get(m)+2)%10;
            }
            Arrays.sort(bbb);
            for(Integer it :bbb){
                System.out.print(it);
            }
            System.out.println();
        }
    }
    public static HashMap<Character ,Integer> minusTemp(String[] numList,String temp,HashMap<Character,Integer> hm){
        for(Character c:temp.toCharArray()){
            if(!hm.containsKey(c)){
                return  hm;
            }
        }
        for(Character c:temp.toCharArray()){
            int count = hm.get(c)-1;
            hm.put(c,count);
        }
        for(int k=0;k<10;k++){
            if(numList[k].equals(temp)){
                list.add(k);
            }
        }
        return hm;
    }

}
