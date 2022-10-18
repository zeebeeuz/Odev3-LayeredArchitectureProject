package odev3KatmanMimarileri.dataAccsess.jdbc;

import odev3KatmanMimarileri.dataAccsess.InstructorDao;
import odev3KatmanMimarileri.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanına eklendi");

	}

}
