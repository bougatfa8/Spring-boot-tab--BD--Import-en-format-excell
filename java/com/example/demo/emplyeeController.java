package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class emplyeeController {
@Autowired
private employeeService employeeService; 
	
@GetMapping("/")
public String index() {
	return "index";
}
	   @PostMapping("/save")
	    public String save(
	            @ModelAttribute employee employee,
	            Model model
	            ) {
		   employeeService.save(employee);
	       
	        return "index";
	    }
	   @GetMapping("/table")
		public String allProduct(Model model) {
			model.addAttribute("employeelist", employeeService.findAllUser());
			return "table";
		}


}
