package br.com.school.educanet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tb_course")
public class TbCourse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long  couserId;
	private String couserName;
	private Integer workload;
	private String descrpition;
	private String courseClass;
	
	
	
	public Long getCouserId() {
		return couserId;
	}
	public void setCouserId(Long couserId) {
		this.couserId = couserId;
	}
	public String getCouserName() {
		return couserName;
	}
	public void setCouserName(String couserName) {
		this.couserName = couserName;
	}
	public Integer getWorkload() {
		return workload;
	}
	public void setWorkload(Integer workload) {
		this.workload = workload;
	}
	public String getDescrpition() {
		return descrpition;
	}
	public void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}
	public String getCourseClass() {
		return courseClass;
	}
	public void setCourseClass(String courseClass) {
		this.courseClass = courseClass;
	}
	
	
	
}
