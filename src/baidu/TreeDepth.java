package baidu;

import java.util.Stack;

/**
 * Created by YJSYF on 2016/9/27.
 */
class BTNode{
    BTNode left;
    BTNode right;
}

public class TreeDepth {
    /*
     * 计算二叉树深度方法（递归 和 非递归）
     */
    public static void main(String[] args){
        BTNode p = new BTNode();
        BTNode p1 = new BTNode();
        BTNode p2 = new BTNode();
        BTNode p3 = new BTNode();
        p.left = p1;
        p.right = p2;
        p1.left = p3;
        System.out.println(recDepth(p));
        System.out.println(nonRecDepth(p));
        System.out.println(prenonRecDepth(p));

    }


    //recursive depth()
    public static int recDepth(BTNode p) {
        int ldepth, rdepth;

        if (p == null)
            return 0;
        else {
            ldepth = recDepth(p.left);
            rdepth = recDepth(p.right);
            return Math.max(ldepth, rdepth) + 1;
        }
    }

    //non-recursive depth();
    //中序非递归
    public static int nonRecDepth(BTNode p) {
        Stack<BTNode> stack1 = new Stack<BTNode>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int curdep, maxdep = 0;

        curdep = 1;
        while (p != null || stack1.empty() == false) {
            while (p != null) {
                stack1.push(p);
                stack2.push(curdep);
                p = p.left;
                curdep++;
            }
            p = stack1.pop();
            curdep = stack2.pop();
            if (p.left == null && p.right == null)
                maxdep = Math.max(curdep, maxdep);
            p = p.right;
            curdep++;
        }
        return maxdep;
    }

    //前序非递归
    public static int prenonRecDepth(BTNode p) {
        Stack<BTNode> stack1 = new Stack<BTNode>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int curdep, maxdep = 0;

        curdep = 1;
        while (p != null || stack1.empty() == false) {
            while (p != null) {
                if (p.left == null && p.right == null)
                    maxdep = Math.max(curdep, maxdep);
                stack1.push(p);
                stack2.push(curdep);
                p = p.left;
                curdep++;
            }
            p = stack1.pop();
            curdep = stack2.pop();

            p = p.right;
            curdep++;
        }
        return maxdep;
    }
}
