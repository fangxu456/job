package microsoft;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }
        getLength(list);
        System.out.println(list.size());

    }

    public static void getLength(LinkedList list) {
        int flag =0;
        for (int j = 0; j < list.size() - 1; j++) {
            if (((int) list.get(j) + (int) list.get(j + 1)) % 2 == 1) {
                list.remove(j);
                list.remove(j);
                flag = 1;
                break;
            }
        }
        if(flag==0){
            return;
        }
        getLength(list);
    }
}
