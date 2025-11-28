//by mschro67

package Chapter3;

import java.awt.desktop.SystemEventListener;

public class Ex1{
    public static void main(String[] args){
        f1(2);
        f2(2);
        f3(2);
    }
    public static void f1(int x){
        System.out.println("f1("+x+")="+x);
    }
    public static void f2(int x){
        System.out.println("f2("+x+")="+(x*x/2+17*2));
    }
    public static void f3(int x){
        System.out.println("f3("+x+")="+(((x-1)*(x-1)*(x-1)-14)/2));
    }
}