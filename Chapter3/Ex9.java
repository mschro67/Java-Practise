//by mschro67

package Chapter3;

public class Ex9{
    public static void main(String[] args){
        SpringZuI:
        for (int i=0;i<=2;i++){
            SprungZuJ:
            for (int j=0;j<=2;j++){
                for (int k=0;k<=2;k++){
                    break SprungZuJ;
                }
            }
        }
    }
}