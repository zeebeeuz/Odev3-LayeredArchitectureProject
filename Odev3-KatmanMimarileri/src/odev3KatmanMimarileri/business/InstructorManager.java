package odev3KatmanMimarileri.business;

import odev3KatmanMimarileri.dataAccsess.InstructorDao;
import odev3KatmanMimarileri.core.loging.Logger;
import odev3KatmanMimarileri.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorId() + " " + instructor.getInstructorName() + " "
					+ instructor.getInstructorLastName() + "\n");
		}
	}

}
