package com.kh.petopia.user.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kh.petopia.user.model.service.UserService;
import com.kh.petopia.user.model.vo.User;

@Controller
public class UserController {
	
	// 인터페이스를 필드로 등록
	@Autowired
	private UserService userService;
	
	// 비번 암호화 위한 bean요청
	
	// 메일 보내기 위한 bean요청
	

	// 로그인
	@RequestMapping("login.us")
	public ModelAndView loginUser(User u, HttpSession session, ModelAndView mv) {
		
		User loginUser = userService.loginUser(u);
		
		
		if(loginUser != null) {
			
			session.setAttribute("loginUser", loginUser);
			mv.setViewName("redirect:/"); // 곧바로 ViewResolver로 감
			
		} else {
			
			mv.addObject("errorMsg", "로그인 실패").setViewName("common/errorPage");// 메서드 체이닝
			
		}
		
		return mv;
		
	}
	
}
