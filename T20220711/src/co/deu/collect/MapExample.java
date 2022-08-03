package co.deu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*
 * 이름, 점수 => map 저장
 * 김민수 80 , 황현익 75, 이현승 88
 * Scanner 클래스 입력 > 학생이름 입력 -> 점수 반환
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		//출력결과:
		//평균점수: 81
		//최고점수: 88 , 최고점수 학생의 이름: 이현승
		double avg = 0;
		int sum = 0;
		int max = 0;
		String maxStudent = null;
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> ent : entrySet) {
			String key = ent.getKey(); 
			Integer val = ent.getValue();	
			sum += val;
			if(val > max) {
				max = val;
				maxStudent = ent.getKey();
			}
		}
		System.out.println("최고점수: " + max + " 최고점수 학생의 이름: " + maxStudent);
		avg = (double) sum / map.size();
		System.out.println("평균점수: " + avg);
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("학생이름을 입력하세요> ");
		String insert = scn.nextLine();

		boolean yes = false;

		Set<String> keySet = map.keySet();
		for (String key : keySet)
			if (insert.equals(key)) {
				yes = true;
				System.out.println("학생의 점수: " + map.get(key));
				break;
			}
		if (!yes) {
			System.out.println("찾는 학생이 없습니다.");
		}

	}

}
