/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author George
 */
@Embeddable
public class RedsocialPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "nombre_redsocial")
    private String nombreRedsocial;
    @Basic(optional = false)
    @Column(name = "fechainicio")
    private String fechainicio;

    public RedsocialPK() {
    }

    public RedsocialPK(String nombreRedsocial, String fechainicio) {
        this.nombreRedsocial = nombreRedsocial;
        this.fechainicio = fechainicio;
    }

    public String getNombreRedsocial() {
        return nombreRedsocial;
    }

    public void setNombreRedsocial(String nombreRedsocial) {
        this.nombreRedsocial = nombreRedsocial;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombreRedsocial != null ? nombreRedsocial.hashCode() : 0);
        hash += (fechainicio != null ? fechainicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RedsocialPK)) {
            return false;
        }
        RedsocialPK other = (RedsocialPK) object;
        if ((this.nombreRedsocial == null && other.nombreRedsocial != null) || (this.nombreRedsocial != null && !this.nombreRedsocial.equals(other.nombreRedsocial))) {
            return false;
        }
        if ((this.fechainicio == null && other.fechainicio != null) || (this.fechainicio != null && !this.fechainicio.equals(other.fechainicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RedsocialPK[ nombreRedsocial=" + nombreRedsocial + ", fechainicio=" + fechainicio + " ]";
    }
    
}
