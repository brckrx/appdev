package sv.duaflores.appdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sv.duaflores.appdev.model.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
