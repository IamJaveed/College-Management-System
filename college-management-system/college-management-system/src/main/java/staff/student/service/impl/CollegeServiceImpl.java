package staff.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import staff.student.entity.College;
import staff.student.repository.CollegeRepository;
import staff.student.service.CollegeService;

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
