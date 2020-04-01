/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author George
 */
@Entity
@Table(name = "redsocial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Redsocial.findAll", query = "SELECT r FROM Redsocial r")
    , @NamedQuery(name = "Redsocial.findByNombreRedsocial", query = "SELECT r FROM Redsocial r WHERE r.redsocialPK.nombreRedsocial = :nombreRedsocial")
    , @NamedQuery(name = "Redsocial.findBySitioweb", query = "SELECT r FROM Redsocial r WHERE r.sitioweb = :sitioweb")
    , @NamedQuery(name = "Redsocial.findByFechainicio", query = "SELECT r FROM Redsocial r WHERE r.redsocialPK.fechainicio = :fechainicio")})
public class Redsocial implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RedsocialPK redsocialPK;
    @Column(name = "sitioweb")
    private String sitioweb;
    @JoinTable(name = "redsocial_usuario", joinColumns = {
        @JoinColumn(name = "nombre_redsocial", referencedColumnName = "nombre_redsocial")
        , @JoinColumn(name = "fecha_registro", referencedColumnName = "fechainicio")}, inverseJoinColumns = {
        @JoinColumn(name = "nombre_usuario", referencedColumnName = "nombre_usuario")})
    @ManyToMany
    private Collection<Usuario> usuarioCollection;

    public Redsocial() {
    }

    public Redsocial(RedsocialPK redsocialPK) {
        this.redsocialPK = redsocialPK;
    }

    public Redsocial(String nombreRedsocial, String fechainicio) {
        this.redsocialPK = new RedsocialPK(nombreRedsocial, fechainicio);
    }

    public RedsocialPK getRedsocialPK() {
        return redsocialPK;
    }

    public void setRedsocialPK(RedsocialPK redsocialPK) {
        this.redsocialPK = redsocialPK;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (redsocialPK != null ? redsocialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Redsocial)) {
            return false;
        }
        Redsocial other = (Redsocial) object;
        if ((this.redsocialPK == null && other.redsocialPK != null) || (this.redsocialPK != null && !this.redsocialPK.equals(other.redsocialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Redsocial[ redsocialPK=" + redsocialPK + " ]";
    }

   private Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    
    public void setUsuario(Usuario usuario) {
     this.usuario = usuario;
    }
    
}
