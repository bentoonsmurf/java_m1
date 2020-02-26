package ex2;

public class employe extends salarie{
	
	public employe(int age){
		super(age);	
	}
	
	public int getSalaire() {	
	return 1500+20* getAnciennete();	
	}
	
	
}
