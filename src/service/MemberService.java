package service;

import java.util.ArrayList;
import eintity.Member;

public interface MemberService {
	
	String greet(int i);
	ArrayList<Member> getAll();
	
	// int型を持つフィールドsumOfを宣言
	int sumOf(int x, int y);
}
