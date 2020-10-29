package com.bs.ch19.member.dao;

import java.util.Map;

import com.bs.ch19.member.Member;


public interface IMemberDao {
	Map<String, Member> memberInsert(Member member);
	Member memberSelect(Member member);
	Member memberUpdate(Member member);
	Map<String, Member> memberDelete(Member member);
}
