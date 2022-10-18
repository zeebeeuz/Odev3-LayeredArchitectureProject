package odev3KatmanMimarileri.business;

import java.util.List;

import odev3KatmanMimarileri.core.loging.Logger;
import odev3KatmanMimarileri.dataAccsess.CategoryDao;
import odev3KatmanMimarileri.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger [] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	 public void add(Category category) throws Exception {


	        for (Category categry : categories) {
	            if (categry.getCategoryName().equals(category.getCategoryName())) {
	                throw new Exception("Kategori adý diðerleriyle ayný olamaz !");

	            }

	        }
	        categoryDao.add(category);
	        categories.add(category);
	        for (Logger logger : loggers) {
	            logger.log(category.getCategoryName());
	        }
	    }
}
