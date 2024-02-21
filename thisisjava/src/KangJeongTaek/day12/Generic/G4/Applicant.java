package KangJeongTaek.day12.Generic.G4;

public class Applicant<T> {
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}
}
