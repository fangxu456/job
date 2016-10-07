package baidu;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by YJSYF on 2016/9/27.
 * �ǵݹ�ʵ��
 * ���ò�α������㷨�����ñ���level��¼��ǰ�ڵ����ڵĲ��������ñ���lastָ��ǰ������һ���ڵ㣬
 * �������굱ǰ������һ���ڵ㣬��levelָ��+1���������ñ���cur��¼��ǰ���Ѿ����ʵĽڵ�ĸ�������cur����lastʱ����ʾ�ò���ʽ�����
 * ��α����������Ŀ�ȡ����ĳһ��ڵ㣬ĳһ��ڵ������ÿһ��ڵ���������Բ�ȡ���Ƶ��㷨��
 * ���Ŀ�ȣ�����������㷨�����ϣ���һ����¼���ʹ��Ĳ�ڵ�������ı���max,�ڷ���ÿ��ǰmax��last�Ƚϣ�
 * ���max�Ƚϴ�max���䣬���maxС��last����last��ֵ��max;
 */
class BTNode {
    BTNode left;
    BTNode right;
}

public class TreeDepth {
    /*
     * �����������ȷ������ݹ� �� �ǵݹ飩
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
    //����ǵݹ�
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

    //ǰ��ǵݹ�
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

    //�ǵݹ�ʵ��  
    public static int findDeep2(BTNode root) {
        if (root == null)
            return 0;

        BTNode current = null;
        LinkedList<BTNode> queue = new LinkedList<BTNode>();
        queue.offer(root);
        int cur, last;
        int level = 0;
        while (!queue.isEmpty()) {
            cur = 0;//��¼�����Ѿ������Ľڵ����  
            last = queue.size();//�������굱ǰ���Ժ󣬶�����Ԫ��ȫ����һ���Ԫ�أ����еĳ�������һ��Ľڵ�ĸ���  
            while (cur < last)//����û�б������������һ���ڵ�ʱѭ��
            {
                current = queue.poll();//����һ��Ԫ��  
                cur++;
                //�ѵ�ǰ�ڵ�����ҽڵ���ӣ�������ڵĻ���  
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            level++;//ÿ������һ��level+1  
        }
        return level;
    }
}
