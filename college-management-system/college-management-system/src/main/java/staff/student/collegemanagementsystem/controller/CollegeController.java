package staff.student.collegemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import staff.student.collegemanagementsystem.service.CollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
public class CollegeController {

    @Autowired
	private CollegeService collegeService;

	public CollegeController(CollegeService collegeService) {
		super();
		this.collegeService = collegeService;
	} 
	
	//handler method to handle list college and return mode and view
	@GetMapping("/")
	public String listCollege(Model model) {
	model.addAttribute("college", collegeService.getAllCollege());
	return "index";
	}
}

