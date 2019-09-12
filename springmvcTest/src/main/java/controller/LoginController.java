package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.BookService;
import service.UserService;

@Controller
public class LoginController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	@RequestMapping(value = "/{formName}", method = RequestMethod.GET)
	public String login1(@PathVariable String formName) {
		return formName;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login2(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (userService.findUserByUsernameAndPassword(username, password) != null) {
			model.addAttribute("user", userService.findUserByUsernameAndPassword(username, password));
			model.addAttribute("bookList", bookService.findAllBook());
			return "main";
		}else
			return "login";
	}
}
