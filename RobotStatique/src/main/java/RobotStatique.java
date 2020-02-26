
public class RobotStatique {
	private String position;
	private String dirrection;
	
	public RobotStatique() {
		position="";
		dirrection ="";
	}
	public RobotStatique(String pos , String dirr) {
		position=pos;
		dirrection =dirr;
	}
	
	public String getPositon() {
		return position;
	}
	public void setPositon(String positon) {
		this.position = positon;
	}
	public String getDirrection() {
		return dirrection;
	}
	public void setDirrection(String dirrection) {
		this.dirrection = dirrection;
	}
	
	
}
