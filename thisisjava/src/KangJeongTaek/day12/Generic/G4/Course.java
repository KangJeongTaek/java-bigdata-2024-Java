package KangJeongTaek.day12.Generic.G4;




public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.getClass().getSimpleName()
				+"이(가) course1를 등록함.");
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이(가) course2를 등록함.");
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
		+"이(가) course3를 등록함.");
	}
}
