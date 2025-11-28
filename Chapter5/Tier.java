//by mschro67

package Chapter5;

import java.util.Random;

public class Tier{
    Random r=new Random(0);

    int alter=0;
    int ohneEssen=0;
    int[] position={0,0};

    boolean lebendig=true;
    boolean platzhalter=false;

    public void sterbe(){
	this.lebendig=false;
    }
    public void altere(){
	this.alter++;
	this.ohneEssen++;
    }
    public void change(){
	if (this.platzhalter==false){
	    this.platzhalter=true;
	}else{
	    this.platzhalter=false;
	}
    }
    public void move(int x,int y){
	this.position[0]=x;
	this.position[1]=y;
    }
}
