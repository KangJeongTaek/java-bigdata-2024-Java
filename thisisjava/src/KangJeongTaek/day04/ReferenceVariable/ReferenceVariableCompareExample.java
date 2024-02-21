package KangJeongTaek.day04.ReferenceVariable;
public class ReferenceVariableCompareExample {
	
	public static void main(String[] args) {
		int[] arr1; //배열 변수 arr1 선언
		int[] arr2; //int arr2[]; 도 가능하다.
		int[] arr3;
		int i;
		arr1 = new int[] {1,2,3};//배열 {1,2,3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1,2,3};
		arr3 = arr2; //배열 변수 arr2의 값을 arr3에 대입
		
		System.out.println(arr1==arr2);
		System.out.println(arr2==arr3);
		for(i=1;i<=arr1.length;i++) {
			
		
		System.out.println(arr1[arr1.length-i]);
		}
	}
}
