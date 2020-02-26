package ex2;

public class vendeur extends salarie{
	private int comm;
	public vendeur(int age,int commission){
		super(age);	
		comm=commission;
	}
	
	public int getSalaire() {	
	return 1500+comm +20* getAnciennete();	
	}
	
}
