package Array最值反转地址;
//任何数据类型都可以都能作为方法的参数类型，或返回值类型
public class Array02 {
    public static void main(String[] args) {
        int[] array={3,2,1,4,6,5};
        //获取数组最大值
        int max1=array[0];
        for(int i=1;i<array.length;i++){
             if (array[i]>max1){
                max1=array[i];
            }
        }

        //倒置数组
        int len=array.length;
        for(int max=len-1, min=0;max>min;max--,min++){
            int temp=array[max];
            array[max]=array[min];
            array[min]=temp;
        }
        System.out.println(max1);
        //再进行遍历输出
        for(int j=0;j<len;j++){
            System.out.println(array[j]);
        }



    }
}
