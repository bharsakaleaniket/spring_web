package com.arbtech.service;

import org.springframework.stereotype.Repository;

import com.arbtech.model.User;
import com.arbtech.vo.UserVO;

@Repository
public interface IUserDaoService {

	UserVO getUser(int userId);

	UserVO getAllUsers();

	String deleteUser(int userId);

	User createUser(User user);

	void updateUser(int userId, User user);

}
