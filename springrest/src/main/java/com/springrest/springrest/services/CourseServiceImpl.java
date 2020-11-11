package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(145,"Java Core Course","This course contains basic codes for Java basics"));
		list.add(new Course(4343,"Spring boot Course","Creating Rest API using spring boot"));
			
	}
	
	

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course:list) 
		{
			if (course.getId()== courseId) 
			{
			c= course;
			break;
			}
		}
	return c;
	}



	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
}
