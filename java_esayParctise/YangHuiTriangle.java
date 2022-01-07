package ArrayPractise;
/*
*
使用二维数组打印一个10行杨辉三角。
【提示】
1.第一行有1个元素，第n行有n个元
2.每一行的第一个元素和最后一个元素都是1
3.从第三行开始,对于非第一个元素和最后一个元素的元素。
* 即:yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j]
* */

public class YangHuiTriangle {
    public static void main(String[] args) {
//      1。初始化
        int[][] yanghui = new int[10][];//每一行元素还不确定不能确定个数
        int i, j;
        for (i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];//确定元素个数，int初始值为0
        }

//      2.赋值
        for (i = 0; i < 10; i++) {
            yanghui[i][0] = yanghui[i][i] = 1;//赋值于首末元素
            for (j = 1; j < yanghui[i].length - 1; j++) {//赋值于非首末元素
                yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
            }
        }

//      3.遍历全部的元素
        for (i = 0; i < yanghui.length; i++) {
            for (j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
