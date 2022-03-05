package com.org.nac.service;
import com.org.nac.model.FamilyModel;
import com.org.nac.repository.FamilyReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class FamilyServiceImpl implements FamilyService {

    @Autowired
    FamilyReposit familyReposit;

    @Override
    public void createFamilyList(FamilyModel familyModel) {

    }

    @Override
    public void updateFamilyList(FamilyModel familyModel) {

    }

    @Override
    public void deleteFamilyListById(Integer id) {

    }

    @Override
    public List<FamilyModel> getAllFamilyList() {
        return null;
    }
}