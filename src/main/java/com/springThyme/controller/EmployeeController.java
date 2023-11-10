package com.springThyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.RestController;

//import com.springThyme.model.Employee;
import com.springThyme.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService  empService;
	
    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", empService.getAllEmployees());
        return "index";
    }
	//-------------------------------------------------------
	/*@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		// save employee to database
		empService.saveEmployee(employee);
		return "redirect:/";
	}*/
}
