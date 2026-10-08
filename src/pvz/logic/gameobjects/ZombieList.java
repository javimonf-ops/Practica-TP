package pvz.logic.gameobjects;

public class ZombieList {
	private Zombie[] zombielist;
	 private int cont;
	
	  public ZombieList(){
		  
	  } 
	  
	  public int dameCont() {
		  return this.cont;
	  }
	  
	  public void addElem(Zombie z) {
		  int i=this.dameCont();
		  this.zombielist[i]=z;
	  }
	  
	  public Zombie getElem(int i) {
		  return this.zombielist[i];
	  }
}
