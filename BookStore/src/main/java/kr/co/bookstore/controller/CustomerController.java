package kr.co.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.CustomerService;
import kr.co.bookstore.vo.CustomerVO;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	// 고객목록
	@GetMapping("/customer/list")
	public String list(Model model) {
		List<CustomerVO> customers = service.selectCustomers();
		model.addAttribute("customers", customers);
		
		return "/customer/list";
	}
	
	// 고객등록 - 출력
	@GetMapping("/customer/register")
	public String register() {
		return "/customer/register";
	}
	
	// 고객등록하기
	@PostMapping("/customer/register")
	public String register(CustomerVO vo) {
		service.insertCustomer(vo);
		return "redirect:/customer/list";
	}
	
	// 고객수정 - 출력
	@GetMapping("/customer/modify")
	public String modify(Model model, String custId) {
		CustomerVO customer = service.selectCustomer(custId);
		model.addAttribute("customer", customer);
		
		return "/customer/modify";
	}
	
	// 고객수정하기
	@PostMapping("/customer/modify")
	public String modify(CustomerVO vo) {
		service.updateCustomer(vo);
		return "redirect:/customer/list";
	}
	
	// 삭제
	@GetMapping("/customer/delete")
	public String delete(String custId) {
		service.deleteCustomer(custId);
		return "redirect:/customer/list";
	}
	
}
