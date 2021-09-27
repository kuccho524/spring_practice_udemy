package service;

import java.util.ArrayList;

import eintity.Member;

public class MemberServiceImpl implements MemberService {

	// MemberServiceImpl型のsingletonを宣言
	private static MemberServiceImpl singleton = new MemberServiceImpl();
	private MemberServiceImpl() {};
	
	// MemberServiceImplのgetInstanceメソッドを定義
	public static MemberServiceImpl getInstance() {
		return singleton;
	}
	
	@Override
	public String greet(int i) {
		// あいさつ文を配列型で定義
		String[] greetings = { "Good Morning", "Hello", "Good evening" };
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		
		// Memberをインスタンス化する
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "James", "jamas@examole.com");
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}

	@Override
	public int sumOf(int x, int y) {
		// sum=0を宣言
		int sum = 0;
		
		// y以下の場合に繰り返すfor文を作成
		for(int i  = x; i <= y; i++) {
			sum += i;
		}
		
		// sumを返す
		return sum;
	}

}
