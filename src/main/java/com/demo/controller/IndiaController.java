package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.India;
import com.demo.service.IndiaService;

@Controller
public class IndiaController {

	@Autowired
	IndiaService service;

	@RequestMapping("/saveIndia")
	public ModelAndView saveIndia(@RequestParam("stateName")String stateName,@RequestParam("district")String district) {

		String msg;

		India i1 = new India();
		i1.setStateName(stateName);
		i1.setDistrict(district);

		if (service.saveIndia(i1))
			msg = "Data Saved successfully!!!";
		else
			msg = "Data Not saved to DB due to some error!!";

		Map<String, String> map = new HashMap<>();
		map.put("msg", msg);

		return new ModelAndView("success", map);

	}

	@RequestMapping("/showAllindiadata")
	public ModelAndView showAllindiadata() {

		List<India> datalist = service.viewIndiaData();

		Map<String, List<India>> map = new HashMap<>();
		map.put("datalist", datalist);

		return new ModelAndView("showDataList",map);

	}

}
