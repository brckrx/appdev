package sv.duaflores.appdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.duaflores.appdev.model.Categories;
import sv.duaflores.appdev.repository.CategoriesRepository;
import sv.duaflores.appdev.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService {
	@Autowired
	private CategoriesRepository ctRepo;

	@Override
	public List<Categories> getAllCategories() {
		return ctRepo.findAll();
	}

}
