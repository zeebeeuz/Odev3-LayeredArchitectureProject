package odev3KatmanMimarileri.dataAccsess.hibernate;

import odev3KatmanMimarileri.dataAccsess.CategoryDao;
import odev3KatmanMimarileri.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklendi");
		
	}

}
