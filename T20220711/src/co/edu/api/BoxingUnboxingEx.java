package co.edu.api;

import java.util.HashSet;

public class BoxingUnboxingEx {
	public static void main(String[] args) {
		// 로또번호 생성 1~45
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) { // 현재값과 동일한 값이 있는지 체크
				if (lotto[i] == lotto[j]) {
					i = i - 1;
				}
			}
		}
		for (int num : lotto) {
			System.out.println(num);
		}
		/*HashSet<Integer> set = new HashSet<Integer>(); // 중복된 값을 담지않음.

		int cnt = set.size(); // 1,2,3,3 => 3
		while (cnt < 6) {
			int temp = (int) (Math.random() * 45) + 1;
			set.add(temp);
			cnt = set.size();
			System.out.println(temp + "," + set.size());

		}*/
	}
}
