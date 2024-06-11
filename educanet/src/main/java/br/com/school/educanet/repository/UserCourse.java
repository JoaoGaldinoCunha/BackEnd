package br.com.school.educanet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.school.educanet.model.TbUserCourse;
import br.com.school.educanet.model.TbVideoCourse;

public interface UserCourse extends JpaRepository<TbUserCourse, Integer> {

	@Query("select u.email, c.courseClass,c.courseName,c.workload,c.description from TbUserCourse tuc JOIN tuc.tbCourse c JOIN tuc.tbUser u ")
	TbVideoCourse findByIdUserIdCourse();
}
