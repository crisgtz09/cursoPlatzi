package com.cristopher.cursoPlatzi.Persistence.crud;

import com.cristopher.cursoPlatzi.Persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface ProductCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoria(int idCategoria);
}
