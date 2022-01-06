/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_090.pangan_090.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import project_akhir_090.pangan_090.entity.MakananMinuman;
import project_akhir_090.pangan_090.repository.PanganRepository;

/**
 *
 * @author MSI NOTEBOOK
 */
@Service
public class MakananServiceImpl implements MakananService {
    
    @Autowired
    private PanganRepository repository;
    @Override
    public MakananMinuman addMakanan(MakananMinuman makanan) {
        return repository.save(makanan);
    }

    @Override
    public MakananMinuman getMakananById(int makananId) {
         return repository.findById(makananId).get();
    }
    
    
    @Override
    public void updateMakanan(MakananMinuman makanan) {
        MakananMinuman panganDB = repository.findById(makanan.getId()).orElseThrow();
         repository.save(makanan);
    }

    @Override
    public void deleteMakananById(int makananId) {
        try {
      repository.deleteById(makananId);  
    }catch(DataAccessException ex){
      throw new RuntimeException(ex.getMessage());
    }
}

    @Override
    public List<MakananMinuman> getAllMakanan() {
        return repository.findAll();
    }
}
