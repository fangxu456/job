package dp;

/**
 * Created by YJSYF on 2016/9/13.
 */
public class LCSProblem
{
    public static void main(String[] args)
    {
        //�������ַ�����Ϊ��getLength()������������Ҳ���Բ�����
        //������getLength()��������������ĳ�ʼ��c[][]��һ���е�һ��
        String[] x = {"", "A", "B", "C", "B", "D", "A", "B"};
        String[] y = {"", "B", "D", "C", "A", "B", "A"};

        int[][] b = getLength(x, y);

        Display(b, x, x.length-1, y.length-1);
    }
    /**
     * @param x
     * @param y
     * @return ����һ����¼���������ķ��������
     */
    public static int[][] getLength(String[] x, String[] y)
    {
        int[][] b = new int[x.length][y.length];
        int[][] c = new int[x.length][y.length];

        for(int i=1; i<x.length; i++)
        {
            for(int j=1; j<y.length; j++)
            {
                // ��1�� ���am-1=bn-1����zk-1=am-1=bn-1���ҡ�z0��z1������zk-2���ǡ�a0��a1������am-2���͡�b0��b1������bn-2����һ������������У�
                // ��2�� ���am-1!=bn-1������zk-1!=am-1���̺���z0��z1������zk-1���ǡ�a0��a1������am-2���͡�b0��b1������bn-1����һ������������У�
                // ��3�� ���am-1!=bn-1������zk-1!=bn-1���̺���z0��z1������zk-1���ǡ�a0��a1������am-1���͡�b0��b1������bn-2����һ������������С�
                //��Ӧ��һ������
                if( x[i] == y[j])
                {
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 1;
                }
                //��Ӧ�ڶ����ߵ���������
                else if(c[i-1][j] >= c[i][j-1])
                {
                    c[i][j] = c[i-1][j];
                    b[i][j] = 0;
                }
                //��Ӧ�ڶ����ߵ���������
                else
                {
                    c[i][j] = c[i][j-1];
                    b[i][j] = -1;
                }
            }
        }

        return b;
    }
    //���ݵĻ���ʵ�֣���ȡ�ݹ�ķ�ʽ
    public static void Display(int[][] b, String[] x, int i, int j)
    {
        if(i == 0 || j == 0)
            return;

        if(b[i][j] == 1)
        {
            Display(b, x, i-1, j-1);
            System.out.print(x[i] + " ");
        }
        else if(b[i][j] == 0)
        {
            Display(b, x, i-1, j);
        }
        else if(b[i][j] == -1)
        {
            Display(b, x, i, j-1);
        }
    }
}
