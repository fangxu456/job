package niuke;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;

/**
 * Created by YJSYF on 2016/10/6.
 */
public class Ctci {
    @Test
    public void test1() {
//        System.out.println(reverseString("abcdefg"));
//        System.out.println(checkSam("This is nowcoder","is This nowcoder"));
//        System.out.println(replaceSpace("Mr John Smith",13));
//        System.out.println(clearZero([[1,2,3],[0,1,2],[0,0,1]],3));
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = new ListNode(5);
//        System.out.println(FindKthToTail(ln,1).val);
        System.out.println(plusAB(ln, ln));
    }

    //1.2
    public String reverseString(String iniString) {
        String str = "";
        for (int i = 0; i < iniString.length(); i++) {
            str = iniString.charAt(i) + str;
        }
        return str;
    }

    //1.3
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        List<String> list = new ArrayList<>();
        for (int i = 0; i < stringA.length(); i++) {
            list.add(String.valueOf(stringA.charAt(i)));
        }
        for (int j = 0; j < stringB.length(); j++) {
            if (list.contains(String.valueOf(stringB.charAt(j))))
                //list.remove(stringB.charAt(j));
                //System.out.println(stringB.charAt(j));
                list.remove(String.valueOf(stringB.charAt(j)));

        }
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    //1.4
    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iniString.length(); i++) {
            if (iniString.charAt(i) == ' ') {
                sb.append("%20");
            } else
                sb.append(iniString.charAt(i));
        }
        return sb.toString();
    }

    //1.7
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    s1.add(i);
                    s2.add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s1.contains(i) || s2.contains(j)) {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }

    //2.2
    public ListNode FindKthToTail(ListNode head, int k) {
        try {
            int n = 1;
            ListNode temp = head;
            while (temp.next != null) {
                n++;
                temp = temp.next;
            }
            if (n - k < 0) {
                return null;
            }
            for (int i = 0; i < n - k; i++) {
                head = head.next;
            }
            return head;
        } catch (Exception e) {
            return null;
        }
    }

    //2.3
    public boolean removeNode(ListNode pNode) {
        // write code here
        if (pNode.next == null) {
            return false;
        } else {
            pNode.val = pNode.next.val;
            pNode.next = pNode.next.next;
            return true;
        }
    }

    //2.5
    public ListNode plusAB(ListNode a, ListNode b) {
        int aa = 0, bb = 0, ab = 0, radix = 1;
        while (a.next != null) {
            aa += a.val * radix;
            radix *= 10;
            a = a.next;
        }
        aa += a.val * radix;
        radix = 1;
        while (b.next != null) {
            bb += b.val * radix;
            radix *= 10;
            b = b.next;
        }
        bb += b.val * radix;
        ab = aa + bb;
        System.out.println(ab);
        String str = String.valueOf(ab);
        ListNode res = null;
        ListNode res1 = null;
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            res = new ListNode(Integer.parseInt(String.valueOf(cs[cs.length - 1 - i])));
            if (i == 0) {
                res1 = res;
            }
            res = res.next;
        }
        return res1;
    }

    //3.6
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>(numbers.length);

        //初始化原始栈
        Stack<Integer> stack = new Stack<>();
        int index = numbers.length - 1;
        for (int i = index; i >= 0; i--) {
            stack.push(numbers[i]);
        }

        Stack<Integer> resultStack = new Stack<>();//额外的栈
        while (!stack.empty()) {
            if (resultStack.empty()) {
                resultStack.push(stack.pop());
            } else {
                int a = stack.pop();
                int b = resultStack.pop();
                if (a < b) {
                    stack.push(b);
                    while (!resultStack.empty() && a < (b = resultStack.pop())) {
                        stack.push(b);
                    }
                }
                if (a >= b) {
                    resultStack.push(b);
                }
                resultStack.push(a);
            }
        }

        //返回ArrayList结果
        while (!resultStack.empty()) {
            result.add(resultStack.pop());
        }
        return result;
    }

    //4.1
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) {
            return true;
        } else {
            int left = getDeep(root.left);
            int right = getDeep(root.right);
            if (Math.abs(left - right) <= 1) {
                return isBalance(root.left) && isBalance(root.right);
            } else {
                return false;
            }
        }
    }

    public int getDeep(TreeNode root) {
        if (root != null) {
            int left = getDeep(root.left);
            int right = getDeep(root.right);
            return left > right ? left + 1 : right + 1;
        } else {
            return 0;
        }
    }

    //9.4
    public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
        Arrays.sort(A);
        ArrayList list = new ArrayList<ArrayList<Integer>>();
        int max = 1 << n;
        for (int k = max - 1; k >= 1; k--) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = k, index = 0; i > 0; i >>= 1, index++) {
                if ((i & 1) == 1) {
                    arr.add(0, A[index]);
                }
            }
            list.add(arr);
        }
        return list;
    }


}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
