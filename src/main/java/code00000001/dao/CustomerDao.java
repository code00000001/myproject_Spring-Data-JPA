package code00000001.dao;

import code00000001.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * JpaRepository<Customer, Long> :完成基本的CURD操作
 *JpaSpecificationExecutor<Customer> :用于复杂查询，分页等的查询
 */
public interface CustomerDao extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
    @Query("from Customer ")
    List<Customer> findAllCustomer();

    @Query("from Customer where name like ?1")
    Customer fidByName(String custName);

    @Query(value = "select * from cst_customer",nativeQuery = true)
    List<Customer> findSql();
}
