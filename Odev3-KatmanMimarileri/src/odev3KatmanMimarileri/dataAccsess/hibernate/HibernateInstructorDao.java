package odev3KatmanMimarileri.dataAccsess.hibernate;

import odev3KatmanMimarileri.dataAccsess.InstructorDao;
import odev3KatmanMimarileri.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

}
