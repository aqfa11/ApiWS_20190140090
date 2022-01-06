/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_090.pangan_090.controller;

import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project_akhir_090.pangan_090.entity.MakananMinuman;
import project_akhir_090.pangan_090.service.MakananService;


/**
 *
 * @author MSI NOTEBOOK
 */
@CrossOrigin
@RestController
@RequestMapping("/makanan")
public class PanganController {
  @Autowired
  MakananService makananService;
  // Insert user record
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MakananMinuman addMakanan(@RequestBody MakananMinuman makanan){
     return makananService.addMakanan(makanan);
  }
  
   @GetMapping
        public List<MakananMinuman> getAllMakanan(){
        return makananService. getAllMakanan();
  }
        
   @GetMapping("/{id}")
   public MakananMinuman getMakananById(@PathVariable("id") int makananId){
    return makananService.getMakananById(makananId);
  }
   
   @PutMapping("/updatemakanan")
   public ResponseEntity<String> updateMakanan(@RequestBody MakananMinuman makanan){
       try {
           makananService.updateMakanan(makanan);
           return new ResponseEntity<String>(HttpStatus.OK);
       }catch (NoSuchElementException ex){
       System.out.println(ex.getMessage());
       return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
       }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteMakanan(@PathVariable int id){
        try {
            makananService.deleteMakananById(id);
            return new ResponseEntity<String>(HttpStatus.OK);
        }catch(RuntimeException ex){
         System.out.println(ex.getMessage());
         return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }
}

