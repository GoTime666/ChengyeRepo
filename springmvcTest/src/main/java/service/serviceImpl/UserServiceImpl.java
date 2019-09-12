package service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.User;
import mapper.UserMapper;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub

		return userMapper.findUserByUsernameAndPassword(username, password);
	}

	@Override
	public Integer register(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.register(username, password);
	}

}
