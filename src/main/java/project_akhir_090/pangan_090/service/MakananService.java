/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project_akhir_090.pangan_090.service;

import java.util.List;
import project_akhir_090.pangan_090.entity.MakananMinuman;

/**
 *
 * @author MSI NOTEBOOK
 */
public interface MakananService {

    MakananMinuman addMakanan(MakananMinuman makanan);

    MakananMinuman getMakananById(int makananId);

    void updateMakanan(MakananMinuman makanan);

    void deleteMakananById(int makananId);

    List<MakananMinuman> getAllMakanan();
}
