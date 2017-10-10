package com.study.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.common.util.CommonUtil;

@Controller
public class StudyController {

	// 패턴설정 매소드 단위로 설정
	@RequestMapping("/study/showMessage.html")
	public String showMessage(Model model, HttpServletRequest req, HttpServletResponse res) {
		
//		String sComboScript = "<select id='searchdate'>"
//		+ "<option value='all' seleted=''>-select-</option>"
//		+ "<option value='1d'>1일</option>"
//		+ "<option value='1w'>1주</option>"
//		+ "<option value='1m'>1개월</option>"
//		+ "<option value='6'>6개월</option>"
//		+ "</select>";
		
		model.addAttribute("message", "Hello! Spring Web Programming");
		model.addAttribute("combo",CommonUtil.getSelect());
		
		return "showMessage"; //뷰의 이름 
	}
	
	@RequestMapping("/study/getMessage.html")
	public ModelAndView getMessage() {
		Map map = new HashMap();
		map.put("result", "비동기 통신 결과");
		map.put("item", "비동기 통신 아이템");
		return new ModelAndView("jsonView", map);
	}
}