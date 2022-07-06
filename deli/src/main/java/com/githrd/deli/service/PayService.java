package com.githrd.deli.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.githrd.deli.dao.PayDao;
import com.githrd.deli.vo.PayVO;

public class PayService {
	
	@Autowired
	PayDao paDao;
	@Autowired
	private SqlSession mapper;
	
	
	//	전체 메뉴 업로드 처리 서비스 함수
	@Transactional
	public int insertODM(List<PayVO> list) {
		int count = 0;
		Map<String, Object> map = new HashMap<>();
		map.put("list", list);
		
		// count += paDao.insertOdm("list", map);
			
		return count;
	}
	/*
	//	트랜잭션 적용 처리 작업 호출 함수
	public boolean applyTx(PayVO paVO) {
		boolean bool = false;
		try {
			bool = insertODM(Map<String, Object>);
		} catch(Exception e) {
			bool = false;
		}
		
		return bool;
	}
	*/
	// 
}
