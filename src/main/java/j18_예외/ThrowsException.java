package j18_예외;

public class ThrowsException {
	
	public static void printArray(int[] numbers) throws Exception {
		
		for(int i = 0; i <6; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5};
		//throws => 호출하는 시점으로 미룬다 메인에서까지 미루면 JVM까지 미뤄진다.
		try {
			printArray(nums);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}

}
