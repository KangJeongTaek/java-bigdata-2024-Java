package KangJeongTaek.day07.Earth;

public class Earth {
	static final double EARTH_RADIUS = 6400; //static 이자 final 멤버 변수 선언
	
	static final double EARTH_SURFACE_AREA; //정적 필드가 선언만하고 초기화가 안 됐으면 static 블록에서 초기화한다.
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; 
	}
}	
