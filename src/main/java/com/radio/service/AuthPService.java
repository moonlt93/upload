package com.radio.service;

import java.util.List;

import com.radio.domain.AuthPboardVO;
import com.radio.domain.Criteria;



public interface AuthPService {
	
	public void register(AuthPboardVO board);
	
	// public List<BoardVO> getList();
	
	public List<AuthPboardVO> getList(Criteria cri);
	
	public AuthPboardVO get(Long bno);
	
	public boolean remove(Long bno);
	
	public boolean modify(AuthPboardVO board);
	
	public int getTotal(Criteria cri);
}




