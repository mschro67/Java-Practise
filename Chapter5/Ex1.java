//by mschro67

package Chapter5;

import java.util.Arrays;

public class Ex1{
    public static void main(String[] args){
        String[] leute={"A","B","C","D","E"};
        leute=next(leute);
        System.out.println(Arrays.toString(leute));
    }
    public static String[] next(String[] leute){
        System.out.println(leute[0]);
        String[] result=new String[leute.length-1];
        for (int x=0;x<leute.length-1;x++){
            result[x]=String.valueOf(leute[x+1]);
        }
        return result;
    }
}