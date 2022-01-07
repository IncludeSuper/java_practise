package ArrayPractise;

/*
* 从键盘读入学生成绩,找出最高分,并输出学生成绩等级。
成绩>=最高分-1日等级为’A,
成绩>=最高分-2日等级为,B成绩>=最高分-3日等级为·C,其余
等级为‘D,
提示:先读入学生人数，根据人数创建int数组，存放学生成绩。
*/

import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int studentNumber,gradMax=0,i;
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入学生人数");
        studentNumber=scanner.nextInt();

        int [] studentGrad=new int[studentNumber];
        for(i=0;i<studentNumber;i++){
            studentGrad[i]=scanner.nextInt();
        }



        for(i=0;i<studentNumber;i++){
            if(studentGrad[i]>gradMax)
                gradMax=studentGrad[i];
        }

        System.out.println("最大值是"+gradMax);

        char level;
        for(i=0;i<studentNumber;i++){
            if(gradMax-studentGrad[i]<=10)
                level='A';
            else if(gradMax-studentGrad[i]<=20)
                level='B';
            else if(gradMax-studentGrad[i]<=30)
                level='C';
            else
                level='D';
            System.out.println("Stuhdent "+i+" Score is "+studentGrad[i]+" and the Level is "+level);
        }
    }
}
