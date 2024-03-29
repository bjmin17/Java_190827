package com.biz.string;

public class String_02 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		// 문자열의 개수를 intLength에 담기
		
		// strNation 변수에 어떤 문자열이 담기든 관계없이
		// 아래 코드를 실행할 때 
		// 코드의 변화 없이 실행을 보장하기 위해서
		// 코드를 사용하여 문자열의 개수를 센다.
		int intLength = strNation.length();
		
		// for문의 반복 횟수 intLength 만큼
		// 변수 i 의 변화는 0 ~ (intLength -1) 이 된다.
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			System.out.println(i + " 번째 : " + cA); //0 번째 : R ~ 16 번째 : a
		}
		// 위치 = index(는 무조건 시작 값이 0), IndexOutOfBounds는 ?번 위치가 범위를 넘어섰다.
		// 시작 값이 무조건 0이므로, 마지막 위치는 length -1 또는 size-1
		// 0번째 위치 ~ length -1 위치
		
		System.out.println("======================");
		for(int i = 0 ; i < intLength ; i++) {
			char cA = strNation.charAt( i );
			System.out.print(cA);
		}
	}

}
