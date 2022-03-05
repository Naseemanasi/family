package com.org.nac.service;
import com.org.nac.model.FamilyModel;
import java.util.List;

public interface FamilyService {
    public void createFamilyList(FamilyModel familyModel);

    public void updateFamilyList(FamilyModel familyModel);

    public void deleteFamilyListById(Integer id);

    public List<FamilyModel> getAllFamilyList();


}
