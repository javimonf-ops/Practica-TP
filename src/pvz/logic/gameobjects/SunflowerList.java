package pvz.logic.gameobjects;

public class SunflowerList {
  private Sunflower[] sunflowerlist;
  private int cont;
  SunflowerList(){
	  this.cont=0;
  }
  
  public int dameCont() {
	  return this.cont;
  }
  
  public void addElem(Sunflower s) {
	  int i=this.dameCont();
	  this.sunflowerlist[i]=s;
  }
  
  
  public Sunflower getElem(int i) {
	  return this.sunflowerlist[i];
  }
}
