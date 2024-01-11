package com.hp.lead.repository;

import com.hp.lead.entity.LeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeadRepository extends JpaRepository<LeadEntity,Integer> {

    List<LeadEntity> findByMobileNumber(String mobileNumber);
}
