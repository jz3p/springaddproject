package spring.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.feign.inteface.AddServiceIn;

@RestController
public class FeignCusumerController {
	
	@Autowired
	AddServiceIn addservice;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public Integer add() {
		return addservice.add(10, 20);
		
	}
}