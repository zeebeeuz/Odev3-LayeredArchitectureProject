package odev3KatmanMimarileri.business;

import java.util.List;

import odev3KatmanMimarileri.core.loging.Logger;
import odev3KatmanMimarileri.dataAccsess.CourseDao;
import odev3KatmanMimarileri.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List <Course> courses;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");

		}
		for(Course cours : courses) {
			if(cours.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs adı diğerleriyle aynı olamaz");
			}
		}

		courseDao.add(course);
		courses.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getCourseName());
			
		}
	}
}
