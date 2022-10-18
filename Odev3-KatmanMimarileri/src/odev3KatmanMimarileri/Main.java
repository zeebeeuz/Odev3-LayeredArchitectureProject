package odev3KatmanMimarileri;

import java.util.ArrayList;
import java.util.List;

import odev3KatmanMimarileri.business.CategoryManager;
import odev3KatmanMimarileri.business.CourseManager;
import odev3KatmanMimarileri.business.InstructorManager;
import odev3KatmanMimarileri.core.loging.DatabaseLogger;
import odev3KatmanMimarileri.core.loging.FileLogger;
import odev3KatmanMimarileri.core.loging.Logger;
import odev3KatmanMimarileri.core.loging.MailLogger;
import odev3KatmanMimarileri.dataAccsess.hibernate.HibernateCategoryDao;
import odev3KatmanMimarileri.dataAccsess.hibernate.HibernateInstructorDao;
import odev3KatmanMimarileri.dataAccsess.jdbc.JdbcCourseDao;
import odev3KatmanMimarileri.entities.Category;
import odev3KatmanMimarileri.entities.Course;
import odev3KatmanMimarileri.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category(1, "Programming");

		List<Category> categoryDb = new ArrayList<>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryDb);
		categoryManager.add(category);

		System.out.println("/////////////////////////////////////////////////////////////////");

		Course course1 = new Course(1, "Java2022", 100);
		Course course2 = new Course(2, ".NET", 150);
		Course course3 = new Course(3, "JavaScript", 120);
		Course course4 = new Course(4, "Java+React", 200);
		Course course5 = new Course(5, "C#+ANGULAR", 250);

		List<Course> courseDb = new ArrayList<>();

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);

		System.out.println("/////////////////////////////////////////////////////////////////");

		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
