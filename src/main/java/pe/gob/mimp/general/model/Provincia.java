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
import javax.persistence.CascadeType;
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
@Table(name = "PROVINCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provincia.findAll", query = "SELECT p FROM Provincia p"),
    @NamedQuery(name = "Provincia.findByCidProvincia", query = "SELECT p FROM Provincia p WHERE p.cidProvincia = :cidProvincia"),
    @NamedQuery(name = "Provincia.findByTxtDescripcion", query = "SELECT p FROM Provincia p WHERE p.txtDescripcion = :txtDescripcion"),
    @NamedQuery(name = "Provincia.findByFlgActivo", query = "SELECT p FROM Provincia p WHERE p.flgActivo = :flgActivo"),
    @NamedQuery(name = "Provincia.findByNidUsuario", query = "SELECT p FROM Provincia p WHERE p.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Provincia.findByTxtPc", query = "SELECT p FROM Provincia p WHERE p.txtPc = :txtPc"),
    @NamedQuery(name = "Provincia.findByTxtIp", query = "SELECT p FROM Provincia p WHERE p.txtIp = :txtIp"),
    @NamedQuery(name = "Provincia.findByFecEdicion", query = "SELECT p FROM Provincia p WHERE p.fecEdicion = :fecEdicion"),
    @NamedQuery(name = "Provincia.findByNidProvincia", query = "SELECT p FROM Provincia p WHERE p.nidProvincia = :nidProvincia")})
public class Provincia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
//    @Size(min = 1, max = 6)
    @Column(name = "CID_PROVINCIA")
    private String cidProvincia;
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
    @Column(name = "NID_PROVINCIA")
    private BigDecimal nidProvincia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provincia", fetch = FetchType.LAZY)
    private List<Distrito> distritoList;
    @OneToMany(mappedBy = "provincia", fetch = FetchType.LAZY)
    private List<ProvinciaCoordenadas> provinciaCoordenadasList;
    @JoinColumn(name = "NID_DEPARTAMENTO", referencedColumnName = "NID_DEPARTAMENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamento departamento;

    public Provincia() {
    }

    public Provincia(BigDecimal nidProvincia) {
        this.nidProvincia = nidProvincia;
    }

    public Provincia(BigDecimal nidProvincia, String cidProvincia) {
        this.nidProvincia = nidProvincia;
        this.cidProvincia = cidProvincia;
    }

    public String getCidProvincia() {
        return cidProvincia;
    }

    public void setCidProvincia(String cidProvincia) {
        this.cidProvincia = cidProvincia;
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

    public BigDecimal getNidProvincia() {
        return nidProvincia;
    }

    public void setNidProvincia(BigDecimal nidProvincia) {
        this.nidProvincia = nidProvincia;
    }

    @XmlTransient
    public List<Distrito> getDistritoList() {
        return distritoList;
    }

    public void setDistritoList(List<Distrito> distritoList) {
        this.distritoList = distritoList;
    }

    @XmlTransient
    public List<ProvinciaCoordenadas> getProvinciaCoordenadasList() {
        return provinciaCoordenadasList;
    }

    public void setProvinciaCoordenadasList(List<ProvinciaCoordenadas> provinciaCoordenadasList) {
        this.provinciaCoordenadasList = provinciaCoordenadasList;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidProvincia != null ? nidProvincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Provincia)) {
            return false;
        }
        Provincia other = (Provincia) object;
        if ((this.nidProvincia == null && other.nidProvincia != null) || (this.nidProvincia != null && !this.nidProvincia.equals(other.nidProvincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Provincia[ nidProvincia=" + nidProvincia + " ]";
    }
    
}
