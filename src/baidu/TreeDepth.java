package baidu;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by YJSYF on 2016/9/27.
 * 非递归实现
 * 利用层次遍历的算法，设置变量level记录当前节点所在的层数，设置变量last指向当前层的最后一个节点，
 * 当处理完当前层的最后一个节点，让level指向+1操作。设置变量cur记录当前层已经访问的节点的个数，当cur等于last时，表示该层访问结束。
 * 层次遍历在求树的宽度、输出某一层节点，某一层节点个数，每一层节点个数都可以采取类似的算法。
 * 树的宽度：在树的深度算法基础上，加一个记录访问过的层节点个数最多的变量max,在访问每层前max与last比较，
 * 如果max比较大，max不变，如果max小于last，把last赋值给max;
 */
class BTNode {
    BTNode left;
    BTNode right;
}

public class TreeDepth {
    /*
     * 计算二叉树深度方法（递归 和 非递归）
     */
    public static void main(String[] args) {
        BTNode p = new BTNode();
        BTNode p1 = new BTNode();
        BTNode p2 = new BTNode();
        BTNode p3 = new BTNode();
        p.left = p1;
        p.right = p2;
        p1.left = p3;
//        System.out.println(recDepth(p));
        System.out.println(nonRecDepth(p));
//        System.out.println(prenonRecDepth(p));
        System.out.println(findDeep2(p));

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

    //非递归实现  
    public static int findDeep2(BTNode root) {
        if (root == null)
            return 0;

        BTNode current = null;
        LinkedList<BTNode> queue = new LinkedList<BTNode>();
        queue.offer(root);
        int cur, last;
        int level = 0;
        while (!queue.isEmpty()) {
            cur = 0;//记录本层已经遍历的节点个数  
            last = queue.size();//当遍历完当前层以后，队列里元素全是下一层的元素，队列的长度是这一层的节点的个数  
            while (cur < last)//当还没有遍历到本层最后一个节点时循环
            {
                current = queue.poll();//出队一个元素  
                cur++;
                //把当前节点的左右节点入队（如果存在的话）  
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            level++;//每遍历完一层level+1  
        }
        return level;
    }
}
