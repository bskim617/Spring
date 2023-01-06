package kr.co.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.BookService;
import kr.co.bookstore.vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	// 도서목록
	@GetMapping("/book/list")
	public String list(Model model) {
		
		List<BookVO> books = service.selectBooks();
		model.addAttribute("books", books); 
		
		return "/book/list";
	}
	
	// 도성등록 - 출력
	@GetMapping("/book/register")
	public String register() {
		return "/book/register";
	}
	
	// 도서등록하기
	@PostMapping("/book/register")
	public String register(BookVO vo) {
		service.insertBook(vo);
		return "redirect:/book/list";
	}
	
	// 도서수정 - 출력
	@GetMapping("/book/modify")
	public String modify(Model model, String bookId) {
		BookVO book = service.selectBook(bookId);
		model.addAttribute("book", book);
		
		return "/book/modify";
	}
	
	// 도서수정하기
	@PostMapping("/book/modify")
	public String modify(BookVO vo) {
		service.updateBook(vo);
		return "redirect:/book/list";
	}
	
	// 삭제
	@GetMapping("/book/delete")
	public String delete(String bookId) {
		service.deleteBook(bookId);
		return "redirect:/book/list";
	}
}
