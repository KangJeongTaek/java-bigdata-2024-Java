package KangJeongTaek.day14.P700;

public class Button {
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	public ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
