package ArrayPractise;

public class ArrayReserve {
    public static void main(String[] args) {
        String[] str=new String[]{"A","B","C","D","E"};

        int i,j;
        String temp;

//        for(i=0;i<str.length/2;i++){
//            temp=str[i];
//            str[i]=str[str.length-i-1];
////            为什么需要-i，因为后面交换的元素在不断的向前移动，所以需要i来改变位置
//            str[str.length-i-1]=temp;
//        }

        for (i=0,j= str.length-1;i<j;i++,j--){
            temp=str[i];
            str[i]=str[str.length-i-1];
            str[str.length-i-1]=temp;
        }

        for (i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
