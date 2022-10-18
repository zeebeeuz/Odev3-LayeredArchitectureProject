package odev3KatmanMimarileri.dataAccsess.jdbc;

import odev3KatmanMimarileri.dataAccsess.CategoryDao;
import odev3KatmanMimarileri.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veri tabanına eklendi");
		
	}

}
