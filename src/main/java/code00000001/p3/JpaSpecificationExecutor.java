package code00000001.p3;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
* JpaSpecificationExecutor中定义的方法
**/
public interface JpaSpecificationExecutor<T> {
//根据条件查询一个对象
T findOne(Specification<T> spec);
//根据条件查询集合
List<T> findAll(Specification<T> spec);
//根据条件分页查询
Page<T> findAll(Specification<T> spec, Pageable pageable);
//排序查询查询
List<T> findAll(Specification<T> spec, Sort sort);
//统计查询
long count(Specification<T> spec);
}