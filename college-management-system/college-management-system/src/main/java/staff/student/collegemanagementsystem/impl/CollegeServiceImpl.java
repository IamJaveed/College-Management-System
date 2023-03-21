package staff.student.collegemanagementsystem.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import staff.student.collegemanagementsystem.entity.College;
import staff.student.collegemanagementsystem.repository.CollegeRepository;
import staff.student.collegemanagementsystem.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	private CollegeRepository collegeRepository;
	
	
	public CollegeServiceImpl(CollegeRepository collegeRepository) {
		super();
		this.collegeRepository = collegeRepository;
	}


	
	@Override
	public List<College> getAllCollege() {
		return collegeRepository.findAll();
	}

}
