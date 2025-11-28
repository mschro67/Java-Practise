//by mschro67

package Chapter5;

import java.util.Arrays;

public class Ex2{
    public static void main(String[] args){
        int[] a={1,2};
        int[] b={1,2};
        System.out.println(Arrays.toString(plus(a, b)));
    }
    public static int[] plus(int[] a,int[] b){
        int[] c=new int[a.length];
        if (a.length==b.length){
            for (int x=0;x<a.length;x++){
                c[x]=a[x]+b[x];
            }
        }
        return c;
    }
}