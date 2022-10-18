package odev3KatmanMimarileri.dataAccsess.hibernate;

import odev3KatmanMimarileri.dataAccsess.CourseDao;
import odev3KatmanMimarileri.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

}
