package sube.interviews.mareoenvios.repository;

import org.springframework.data.repository.CrudRepository;

import sube.interviews.mareoenvios.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer > {

}
