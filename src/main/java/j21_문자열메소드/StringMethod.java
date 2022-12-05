package j21_문자열메소드;

public class StringMethod {
	public static void main(String[] args) {
		
		String name = "김준일김수현";
		
		System.out.println(name.length());
		
		//문자의 위치 찾기
		System.out.println(name.indexOf("김"));
		System.out.println(name.indexOf("준"));
		
		//문자의 뒤에서부터 찾기
		System.out.println(name.lastIndexOf("김"));
		
		char name1 = name.charAt(0);
		System.out.println(name1);
		
		char name2 = name.charAt(name.indexOf("준"));
		System.out.println(name2);
		
		String nameJunil = "김준일";
		
		//마지막 인덱스 전까지
		String subName1 = name.substring(name.indexOf(nameJunil), name.indexOf(nameJunil) + nameJunil.length());
		String subName2 = name.substring(3, 6);
		System.out.println(subName1);
		System.out.println(subName2);
		
		String file = "C:/String.java";
		String fileName = file.substring("C:/".length(), file.lastIndexOf("."));
		String extension = file.substring(file.lastIndexOf("."));
		
		System.out.println(fileName);
		System.out.println(extension);
		
		
	}
}
