package staff.student.collegemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import staff.student.collegemanagementsystem.entity.College;
@Repository

public interface CollegeRepository extends JpaRepository<College, Long>{
	

}
