import java.util.ArrayList;
import java.util.List;

public class MethodsInJava {

    public static Integer[] getOddValue(int[] arr1){
        List<Integer> result=new ArrayList<>();
        for (int k=0;k<arr1.length;k++){
            if (arr1[k]%2!=0){
                //displayOddValue(arr1[k]);
                result.add(arr1[k]);


            }
        }

        Integer[] arr = new Integer[result.size()];
        arr = result.toArray(arr);
        return arr;
    }

    public static void displayOddValue(Integer[] value){
        for (Integer i:value){
            System.out.println(i);
        }

    }

}
