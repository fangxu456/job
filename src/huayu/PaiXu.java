package huayu;

/**
 * Created by YJSYF on 2016/10/13.
 * ≈≈–Ú
 */
public class PaiXu {
    public static void main(String[] args){
        //int[] a = new int[10];
        int[] a = {5,4,3,5,7,8,2,9};
        for(int i =0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i : a){
            System.out.println(i);
        }
    }
}
