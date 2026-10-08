package pvz.logic.gameobjects;

public class PeashooterList {
	private Peashooter[] peashooterlist;
	private int cont;
	  PeashooterList(){
		  this.cont=0;
		  }
	  
	  public int dameCont() {
		  return this.cont;
	  }
	  public void addElem(Peashooter p) {
		  int i=this.dameCont();
		  this.peashooterlist[i]=p;
	  }
	  
	  public Peashooter getElem(int i) {
		  return this.peashooterlist[i];
	  }
}
