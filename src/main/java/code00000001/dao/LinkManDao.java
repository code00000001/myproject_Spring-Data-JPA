package code00000001.dao;

import code00000001.entity.LinkMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LinkManDao extends JpaRepository<LinkMan,Long>, JpaSpecificationExecutor<LinkMan> {
}
