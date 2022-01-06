/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_akhir_090.pangan_090.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MSI NOTEBOOK
 */
@Entity
@Table(name = "makanan_minuman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MakananMinuman.findAll", query = "SELECT m FROM MakananMinuman m"),
    @NamedQuery(name = "MakananMinuman.findById", query = "SELECT m FROM MakananMinuman m WHERE m.id = :id"),
    @NamedQuery(name = "MakananMinuman.findByNamaMakanaminuman", query = "SELECT m FROM MakananMinuman m WHERE m.namaMakanaminuman = :namaMakanaminuman"),
    @NamedQuery(name = "MakananMinuman.findByJenisMakananminuman", query = "SELECT m FROM MakananMinuman m WHERE m.jenisMakananminuman = :jenisMakananminuman"),
    @NamedQuery(name = "MakananMinuman.findByHarga", query = "SELECT m FROM MakananMinuman m WHERE m.harga = :harga")})
public class MakananMinuman implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nama_makanaminuman")
    private String namaMakanaminuman;
    @Basic(optional = false)
    @Column(name = "jenis_makananminuman")
    private String jenisMakananminuman;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;

    public MakananMinuman() {
    }

    public MakananMinuman(Integer id) {
        this.id = id;
    }

    public MakananMinuman(Integer id, String namaMakanaminuman, String jenisMakananminuman, int harga) {
        this.id = id;
        this.namaMakanaminuman = namaMakanaminuman;
        this.jenisMakananminuman = jenisMakananminuman;
        this.harga = harga;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaMakanaminuman() {
        return namaMakanaminuman;
    }

    public void setNamaMakanaminuman(String namaMakanaminuman) {
        this.namaMakanaminuman = namaMakanaminuman;
    }

    public String getJenisMakananminuman() {
        return jenisMakananminuman;
    }

    public void setJenisMakananminuman(String jenisMakananminuman) {
        this.jenisMakananminuman = jenisMakananminuman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MakananMinuman)) {
            return false;
        }
        MakananMinuman other = (MakananMinuman) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project_akhir_090.pangan_090.entity.MakananMinuman[ id=" + id + " ]";
    }
    
}
