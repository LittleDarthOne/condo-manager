package br.com.condo.arch.service.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface SpringDataRepository<E extends Serializable, P extends Serializable> extends JpaSpecificationExecutor<E>, CrudRepository<E, P> {

}
