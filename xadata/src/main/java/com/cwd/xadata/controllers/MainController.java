package com.cwd.xadata.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cwd.xadata.service.ItemRevisionServiceImpl;
 

 

@Controller
@RequestMapping(path ="/items")
public class MainController {
	
  @Autowired
  ItemRevisionServiceImpl itemRevisionServiceImpl;
  
 
	@GetMapping(path="/itemList")
	public ModelAndView viewAll(ModelAndView modelAndView) {		
		modelAndView.setViewName("item");
		modelAndView.getModel().put("itemList", itemRevisionServiceImpl.getItems() );		
		 
		System.out.println("Returning " + itemRevisionServiceImpl.getItems().size() + " Items");
		

		return modelAndView;
	}

}
