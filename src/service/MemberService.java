package service;

import java.util.ArrayList;
import eintity.Member;

public interface MemberService {
	
	String greet(int i);
	ArrayList<Member> getAll();
	
	// int�^�����t�B�[���hsumOf��錾
	int sumOf(int x, int y);
}
