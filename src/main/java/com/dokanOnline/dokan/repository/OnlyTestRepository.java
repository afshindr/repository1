package com.dokanOnline.dokan.repository;

import com.dokanOnline.dokan.entity.OnlyEntityTest;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlyTestRepository extends PagingAndSortingRepository<OnlyEntityTest, Integer> , JpaSpecificationExecutor<OnlyEntityTest> {
}
