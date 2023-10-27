package sv.duaflores.appdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.duaflores.appdev.model.Authors;
import sv.duaflores.appdev.repository.AuthorsRepository;
import sv.duaflores.appdev.service.AuthorsService;

@Service
public class AuthorsServiceImpl implements AuthorsService {
	@Autowired
	private AuthorsRepository authRepo;

	@Override
	public List<Authors> getAllAuthors() {
		return authRepo.findAll();
	}

}
