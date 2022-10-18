package odev3KatmanMimarileri.dataAccsess.jdbc;

import odev3KatmanMimarileri.dataAccsess.CourseDao;
import odev3KatmanMimarileri.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veri tabanına eklendi");
		
	}

}
