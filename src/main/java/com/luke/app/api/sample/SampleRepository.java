package com.luke.app.api.sample;

import com.luke.app.api.common.model.ActiveType;
import com.luke.app.api.sample.model.Sample;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CrudRepository<Sample, Long> {
    Page<Sample> findAllByActive(Pageable pageable, ActiveType activeType);

    Sample findByIdAndActive(Long id, ActiveType active);

}