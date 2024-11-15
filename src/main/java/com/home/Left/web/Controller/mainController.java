package com.home.Left.web.Controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.Left.Entity.depoWithHisObj;
import com.home.Left.repository.depoWithHisRepository;
import com.home.Left.repository.expHisRepository;

import jakarta.servlet.http.HttpServletRequest;

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
		
		depoWithHisRepository.findByReportInfo("202411"+"31").forEach(t -> {
			list.add(t);
		});
		
		model.addAttribute("meassage", list);
		
		return "/index.html";
	}
	
	//report
	@RequestMapping(method = RequestMethod.GET,value = "/report")
	public String report(Model model,HttpServletRequest request) {
		
		List<depoWithHisObj> list = new ArrayList<depoWithHisObj>();
		
		String param = request.getParameter("date");
		
		if(!StringUtils.hasLength(param)) {
			param = LocalDate.now(ZoneId.of("Asia/Tokyo")).format(DateTimeFormatter.ofPattern("yyyyMM"));
		}
		
		
		depoWithHisRepository.findByReportInfo(param+"31").forEach(t -> {
			list.add(t);
		});
		
		model.addAttribute("list", list);
		
		return "/report.html";
	}
}
