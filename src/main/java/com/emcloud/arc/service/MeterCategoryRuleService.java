package com.emcloud.arc.service;

import com.emcloud.arc.domain.MeterCategoryRule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing MeterCategoryRule.
 */
public interface MeterCategoryRuleService {

    /**
     * Save a meterCategoryRule.
     *
     * @param meterCategoryRule the entity to save
     * @return the persisted entity
     */
    MeterCategoryRule save(MeterCategoryRule meterCategoryRule);

    /**
     *  Get all the meterCategoryRules.
     *
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<MeterCategoryRule> findAll(Pageable pageable);

    /**
     *  Get the "id" meterCategoryRule.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    MeterCategoryRule findOne(Long id);

    /**
     *  Delete the "id" meterCategoryRule.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
