package controller;

import java.net.URL;

import javax.servlet.Filter;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BookService;

@Controller
public class ControllerTest {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("message", "helloworld");
		model.addAttribute("bookList", bookService.findAllBook());
		return "test";
	}
	
	 @Test
	    public void get(){ 
	        URL url = Filter.class.getProtectionDomain().getCodeSource().getLocation(); 
	        System.out.println("path:"+url.getPath()+"  name:"+url.getFile()); 
	    }
	
}
