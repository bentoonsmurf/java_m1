package ex2;

public class manager extends salarie{
	public manager(int age){
		super(age);	
	}
	
	public int getSalaire() {	
	return 1600+20* getAnciennete();	
	}
}
