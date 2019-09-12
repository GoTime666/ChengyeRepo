package service;

import bean.User;

public interface UserService {

	User findUserByUsernameAndPassword(String username, String password);

	Integer register(String username, String password);
}
