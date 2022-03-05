package com.org.nac.controller;
import com.org.nac.model.FamilyModel;
import com.org.nac.service.FamilyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FamilyController {
    @Autowired
    FamilyService familyService;

    @PostMapping("/create")
    public void createFamily(@RequestBody FamilyModel familyModel) {

        familyService.createFamilyList(familyModel);
    }

    @PutMapping("/update")
    public void updateFamilyList(@RequestBody FamilyModel familyModel) {

        familyService.updateFamilyList(familyModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFamilyListById(@PathVariable Integer id) {

        familyService.deleteFamilyListById(id);
    }

    @GetMapping("/getAll")
    public List<FamilyModel> getAllFamilyList() {
        return familyService.getAllFamilyList();

    }
}

