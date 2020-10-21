/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "DISTRITO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Distrito.findAll", query = "SELECT d FROM Distrito d"),
    @NamedQuery(name = "Distrito.findByCidDistrito", query = "SELECT d FROM Distrito d WHERE d.cidDistrito = :cidDistrito"),
    @NamedQuery(name = "Distrito.findByTxtDescripcion", query = "SELECT d FROM Distrito d WHERE d.txtDescripcion = :txtDescripcion"),
    @NamedQuery(name = "Distrito.findByFlgActivo", query = "SELECT d FROM Distrito d WHERE d.flgActivo = :flgActivo"),
    @NamedQuery(name = "Distrito.findByNidUsuario", query = "SELECT d FROM Distrito d WHERE d.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Distrito.findByTxtPc", query = "SELECT d FROM Distrito d WHERE d.txtPc = :txtPc"),
    @NamedQuery(name = "Distrito.findByTxtIp", query = "SELECT d FROM Distrito d WHERE d.txtIp = :txtIp"),
    @NamedQuery(name = "Distrito.findByFecEdicion", query = "SELECT d FROM Distrito d WHERE d.fecEdicion = :fecEdicion"),
    @NamedQuery(name = "Distrito.findByNidDistrito", query = "SELECT d FROM Distrito d WHERE d.nidDistrito = :nidDistrito")})
public class Distrito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
//    @Size(min = 1, max = 6)
    @Column(name = "CID_DISTRITO")
    private String cidDistrito;
//    @Size(max = 100)
    @Column(name = "TXT_DESCRIPCION")
    private String txtDescripcion;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
    @Column(name = "NID_USUARIO")
    private BigInteger nidUsuario;
//    @Size(max = 50)
    @Column(name = "TXT_PC")
    private String txtPc;
//    @Size(max = 20)
    @Column(name = "TXT_IP")
    private String txtIp;
    @Column(name = "FEC_EDICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEdicion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_DISTRITO")
    private BigDecimal nidDistrito;
    @JoinColumn(name = "NID_PROVINCIA", referencedColumnName = "NID_PROVINCIA")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Provincia provincia;
    @OneToMany(mappedBy = "distrito", fetch = FetchType.LAZY)
    private List<CentroPoblado> centroPobladoList;
    @OneToMany(mappedBy = "distrito", fetch = FetchType.LAZY)
    private List<DistritoCoordenadas> distritoCoordenadasList;

    public Distrito() {
    }

    public Distrito(BigDecimal nidDistrito) {
        this.nidDistrito = nidDistrito;
    }

    public Distrito(BigDecimal nidDistrito, String cidDistrito) {
        this.nidDistrito = nidDistrito;
        this.cidDistrito = cidDistrito;
    }

    public String getCidDistrito() {
        return cidDistrito;
    }

    public void setCidDistrito(String cidDistrito) {
        this.cidDistrito = cidDistrito;
    }

    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public BigInteger getNidUsuario() {
        return nidUsuario;
    }

    public void setNidUsuario(BigInteger nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public String getTxtPc() {
        return txtPc;
    }

    public void setTxtPc(String txtPc) {
        this.txtPc = txtPc;
    }

    public String getTxtIp() {
        return txtIp;
    }

    public void setTxtIp(String txtIp) {
        this.txtIp = txtIp;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    public BigDecimal getNidDistrito() {
        return nidDistrito;
    }

    public void setNidDistrito(BigDecimal nidDistrito) {
        this.nidDistrito = nidDistrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @XmlTransient
    public List<CentroPoblado> getCentroPobladoList() {
        return centroPobladoList;
    }

    public void setCentroPobladoList(List<CentroPoblado> centroPobladoList) {
        this.centroPobladoList = centroPobladoList;
    }

    @XmlTransient
    public List<DistritoCoordenadas> getDistritoCoordenadasList() {
        return distritoCoordenadasList;
    }

    public void setDistritoCoordenadasList(List<DistritoCoordenadas> distritoCoordenadasList) {
        this.distritoCoordenadasList = distritoCoordenadasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidDistrito != null ? nidDistrito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Distrito)) {
            return false;
        }
        Distrito other = (Distrito) object;
        if ((this.nidDistrito == null && other.nidDistrito != null) || (this.nidDistrito != null && !this.nidDistrito.equals(other.nidDistrito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Distrito[ nidDistrito=" + nidDistrito + " ]";
    }
    
}
