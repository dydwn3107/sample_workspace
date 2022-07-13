package co.deu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 등록, 조회, 삭제, 목록

public class MemoManager {
	List<Memo> memoStorage = new ArrayList<>();
	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat");

	// 싱글톤
	private static MemoManager instance = new MemoManager();

	private MemoManager() {
		readFromFile();
		
	} // 외부에서는 막고

	public static MemoManager getInstance() { // getInstance로 불러올수 있게
		return instance;
	}

	// 등록
	public void inputData() {
		System.out.print("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("작성날짜> ");
		String date = scn.nextLine();
		System.out.print("내용> ");
		String content = scn.nextLine();

		memoStorage.add(new Memo(no, date, content)); // 생성자에서 정의해 놧음

	}

	// 날짜 입력하고 모든 메모 출력
	public void search() {
		System.out.print("날짜입력> ");
		String memoDate = scn.nextLine();
		boolean isExist = false;

		for (int i = 0; i < memoStorage.size(); i++) { // 메모스터리지에 있는 날짜 반복하면서 찾기
			if (memoDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i).toString()); // 있으면 toString에 있는 거 출력
				isExist = true;
			}
		}
		if (!isExist)
			System.out.println("해당날짜의 메모가 없습니다.");

	}

	// 번호 입력하고 삭제
	public void deleteData() {
		System.out.print("삭제번호 입력> ");
		int delNo = Integer.parseInt(scn.nextLine());
		Iterator<Memo> iter = memoStorage.iterator(); // 반복자를 가지고 반복
		while (iter.hasNext()) {
			Memo memo = iter.next();
			if (memo.getNo() == delNo) {
				iter.remove();
				System.out.println("삭제완료.");
				return;
			}
		}
		System.out.println("일치하는 번호가 없습니다.");
	}

	// 목록
	/*public void listData() {
		System.out.println("======목록========");
		for (int i = 0; i < memoStorage.size(); i++) {
			System.out.println(memoStorage.toString());
		}
	}*/

	// 파일 -> 컬렉션
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			memoStorage = (List<Memo>) ois.readObject();
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 종료
	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			// 객체처리해주는 보조스트림 ObjectOutputStream : ArrayList => 바이트배열 변경
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(memoStorage);
			oos.flush();
			oos.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
