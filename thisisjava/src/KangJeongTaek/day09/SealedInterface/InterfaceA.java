package KangJeongTaek.day09.SealedInterface;

public sealed interface InterfaceA permits InterfaceB{
	void methodA();
}
