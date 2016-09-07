package huawei;

public class test5 {
	char[] cs = str.toCharArray();
    StringBuilder sb = new StringBuilder(String.valueOf(cs[0]));
    for (int i = 1; i < cs.length; i++) {
        sb.append("*").append(cs[i]);
    }
    cs = sb.toString().toCharArray();
    int middleIndex = 0; int stringRadix = 0;
    for(int i = 1; i < cs.length - 1; i++) {
        for(int j = 1; j < cs.length / 2 - 1; j++) {
            if(i > j-1 && i < cs.length-j+1 && cs[i-j] == cs[i+j]) {
                if(j > stringRadix) {
                    middleIndex = i;
                    stringRadix = j;
                }
            } else {
                break;
            }
        }
    }
}
