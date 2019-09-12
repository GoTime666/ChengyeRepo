package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.UserService;

@Controller
public class RegisterController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("username") String username, @RequestParam("password") String password) {
		userService.register(username, password);
		return "login";
	}
}
