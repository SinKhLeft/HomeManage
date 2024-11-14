package com.home.Left.web.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.Left.Entity.depoWithHisObj;
import com.home.Left.repository.depoWithHisRepository;
import com.home.Left.repository.expHisRepository;

@Controller
public class mainController {

	
	//입출금 정보
	@Autowired
	depoWithHisRepository depoWithHisRepository;
	
	
	//지출정보
	@Autowired
	expHisRepository expHisRepository;
	
	//index
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String index(Model model) {
		
		List<depoWithHisObj> list = new ArrayList<depoWithHisObj>();
		
		depoWithHisRepository.findAll().forEach(t -> {
			list.add(t);
		});
		
		model.addAttribute("meassage", list);
		
		return "/index.html";
	}
	
}
