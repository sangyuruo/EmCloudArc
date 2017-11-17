package com.emcloud.arc.repository;

import com.emcloud.arc.domain.MeterRule;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the MeterRule entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MeterRuleRepository extends JpaRepository<MeterRule, Long> {

}