
public class Premio {
	int mult;
	
	public int getMult(){
		return this.mult;
	}
	
	public void setMult(int i){
		this.mult=i;
	}
	
	public int devolvepremio(int aposta){
		return this.getMult()*aposta;
	}
}
