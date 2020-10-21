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
@Table(name = "AREA_CENTRO_POBLADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaCentroPoblado.findAll", query = "SELECT a FROM AreaCentroPoblado a"),
    @NamedQuery(name = "AreaCentroPoblado.findByNidAreaCentroPoblado", query = "SELECT a FROM AreaCentroPoblado a WHERE a.nidAreaCentroPoblado = :nidAreaCentroPoblado"),
    @NamedQuery(name = "AreaCentroPoblado.findByTxtAreaCentroPoblado", query = "SELECT a FROM AreaCentroPoblado a WHERE a.txtAreaCentroPoblado = :txtAreaCentroPoblado"),
    @NamedQuery(name = "AreaCentroPoblado.findByFlgActivo", query = "SELECT a FROM AreaCentroPoblado a WHERE a.flgActivo = :flgActivo"),
    @NamedQuery(name = "AreaCentroPoblado.findByNidUsuario", query = "SELECT a FROM AreaCentroPoblado a WHERE a.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "AreaCentroPoblado.findByTxtPc", query = "SELECT a FROM AreaCentroPoblado a WHERE a.txtPc = :txtPc"),
    @NamedQuery(name = "AreaCentroPoblado.findByTxtIp", query = "SELECT a FROM AreaCentroPoblado a WHERE a.txtIp = :txtIp"),
    @NamedQuery(name = "AreaCentroPoblado.findByFecEdicion", query = "SELECT a FROM AreaCentroPoblado a WHERE a.fecEdicion = :fecEdicion")})
public class AreaCentroPoblado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_AREA_CENTRO_POBLADO")
    private BigDecimal nidAreaCentroPoblado;
//    @Size(max = 64)
    @Column(name = "TXT_AREA_CENTRO_POBLADO")
    private String txtAreaCentroPoblado;
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
    @OneToMany(mappedBy = "areaCentroPoblado", fetch = FetchType.LAZY)
    private List<CentroPoblado> centroPobladoList;

    public AreaCentroPoblado() {
    }

    public AreaCentroPoblado(BigDecimal nidAreaCentroPoblado) {
        this.nidAreaCentroPoblado = nidAreaCentroPoblado;
    }

    public BigDecimal getNidAreaCentroPoblado() {
        return nidAreaCentroPoblado;
    }

    public void setNidAreaCentroPoblado(BigDecimal nidAreaCentroPoblado) {
        this.nidAreaCentroPoblado = nidAreaCentroPoblado;
    }

    public String getTxtAreaCentroPoblado() {
        return txtAreaCentroPoblado;
    }

    public void setTxtAreaCentroPoblado(String txtAreaCentroPoblado) {
        this.txtAreaCentroPoblado = txtAreaCentroPoblado;
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

    @XmlTransient
    public List<CentroPoblado> getCentroPobladoList() {
        return centroPobladoList;
    }

    public void setCentroPobladoList(List<CentroPoblado> centroPobladoList) {
        this.centroPobladoList = centroPobladoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidAreaCentroPoblado != null ? nidAreaCentroPoblado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AreaCentroPoblado)) {
            return false;
        }
        AreaCentroPoblado other = (AreaCentroPoblado) object;
        if ((this.nidAreaCentroPoblado == null && other.nidAreaCentroPoblado != null) || (this.nidAreaCentroPoblado != null && !this.nidAreaCentroPoblado.equals(other.nidAreaCentroPoblado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.AreaCentroPoblado[ nidAreaCentroPoblado=" + nidAreaCentroPoblado + " ]";
    }
    
}
