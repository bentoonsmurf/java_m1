
public class RobotMobile extends RobotStatique{
	
	public void tourne() {} 
	public void avance() {
		System.out.println( "avance");
	}
	
	public RobotMobile() {
		super();
		
	}
	public RobotMobile(String pos,String dirr) {
		super(pos,dirr);
		
	}
	
}
