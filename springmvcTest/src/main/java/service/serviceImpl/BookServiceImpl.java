package service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.Book;
import mapper.BookMapper;
import service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return bookMapper.findAllBook();
	}

}
