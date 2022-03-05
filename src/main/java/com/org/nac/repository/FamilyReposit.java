package com.org.nac.repository;

import com.org.nac.model.FamilyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyReposit extends JpaRepository<FamilyModel,Integer> {
}
