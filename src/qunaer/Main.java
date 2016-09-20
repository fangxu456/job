package qunaer;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/18.
 */
public class Main {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = str.replace("{","");
        String str2  =str1.replace("}","");
        String str3 = str2.replace("'","");
        String str5 = str3.replace(",","");
        String[] str4 = str5.split(" ");
        int length = getLength(str4.length);
        //System.out.println(length);
        Character[][] characters = new Character[length+1][2*length+1];
        int m =length+2;int t=1;int k=0;
        for(int i=0;i<length+1;i++){
            for(int j=0;j<2*length+1;j++){
                     characters[i][j]=' ';
               // System.out.print(characters[i][j]);
            }
           // System.out.println();
        }
        for(int i =0 , p=length;i<length;i++,p--){
            characters[i][p]=str4[0].charAt(0);
        }




        for(int i=0;i<length+1;i++){
            for(int j=0;j<2*length+1;j++){
                //characters[i][j]=' ';
                 System.out.print(characters[i][j]);
            }
            System.out.println();
        }





       /* for(int i=0;i<length+1;i++){
            for(int j=0;j<2*length+1;j++){
                if(i+j==length){
                    characters[i][j]='/';
                }else if(i==(t++)&&j==(m++)){
                    characters[i][j]='\\';
                }
                else if(i==t-1&&j==m-1){
                    characters[i][j]=str4[k].charAt(0);
                            k++;
                }
                else{
                    characters[i][j]=' ';
                }
                System.out.print(characters[i][j]);
            }
            System.out.println();*/



    }
        public static int getLength(int length){
            int count =1;
            int t = 1;
            while (length>t){
                count++;
                length/=2;
            }
            int sum =0;
            double k=1;
            for(int i=0;i<count-1;i++){
                sum+=k;
                sum++;
                k*=2;
            }
            return sum;
        }
}
