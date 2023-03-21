package staff.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import staff.student.service.CollegeService;

@Controller
public class CollegeController {
	public @interface GetMapping {

		String value();

	}

	private CollegeService collegeService;

	public CollegeController(CollegeService collegeService) {
		super();
		this.collegeService = collegeService;
	} 
	
	//handler method to handle list college and return mode and view
	@GetMapping("/college")
	public String listCollege(Model model) {
	model.addAttribute("colleges", collegeService.getAllCollege());
	return "college";
	}
}
