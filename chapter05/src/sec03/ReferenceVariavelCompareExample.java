package sec03;

public class ReferenceVariavelCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.print("arr1 == arr2 : ");
		System.out.println(arr1 == arr2);
		System.out.println();
		
		System.out.println("arr3 : " + arr3);
		System.out.print("arr2 == arr3 : ");
		System.out.println(arr2 == arr3);
	}

}

// 실행 결과
/* 
arr1 : [I@2d363fb3
arr2 : [I@7d6f77cc
arr1 == arr2 : false

arr3 : [I@7d6f77cc
arr2 == arr3 : true
 */
