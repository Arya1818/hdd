package com.hdd.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.hdd.test.vo.UserVO;

@Repository
public class UserDAO {
	
	@Resource
	private SqlSessionFactory ssf;
	
	public List<UserVO> getUserList(UserVO user){
		SqlSession ss = ssf.openSession();
		
		try {
			return ss.selectList("com.sp.practice.dao.UserInfoMapper.selectUserInfoList");
		}catch(Exception e){
			
		}finally {
			ss.close();
		}
		return null;
	}
}
