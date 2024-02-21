package KangJeongTaek.day10.nestedInterface;

public class ButtonExample {
	public static void main(String[] args) {
		// 버튼 객체 생성
		Button btn = new Button();

		// Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}

		}

		// Ok 버튼 객체에 ClickListener 구현 객체 주입
		btn.setClickListener(new OkListener());

		// Ok 버튼 클릭하기
		btn.click();

		// Cancel 버튼 객체 생성
		//Button btnCancel = new Button();

		// Cancel 버튼 클릭 ㅣㅇ벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}

		}

		// Cancel 버튼 객체에 ClickListener 구현 객체 주입
		btn.setClickListener(new CancelListener());
		// Cancel 버튼 클릭하기
		btn.click();

	}
}
