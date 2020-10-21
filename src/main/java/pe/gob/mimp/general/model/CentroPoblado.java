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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "CENTRO_POBLADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CentroPoblado.findAll", query = "SELECT c FROM CentroPoblado c"),
    @NamedQuery(name = "CentroPoblado.findByNidCentroPoblado", query = "SELECT c FROM CentroPoblado c WHERE c.nidCentroPoblado = :nidCentroPoblado"),
    @NamedQuery(name = "CentroPoblado.findByTxtCentroPoblado", query = "SELECT c FROM CentroPoblado c WHERE c.txtCentroPoblado = :txtCentroPoblado"),
    @NamedQuery(name = "CentroPoblado.findByCidCentroPoblado", query = "SELECT c FROM CentroPoblado c WHERE c.cidCentroPoblado = :cidCentroPoblado"),
    @NamedQuery(name = "CentroPoblado.findByFlgActivo", query = "SELECT c FROM CentroPoblado c WHERE c.flgActivo = :flgActivo"),
    @NamedQuery(name = "CentroPoblado.findByNidUsuario", query = "SELECT c FROM CentroPoblado c WHERE c.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "CentroPoblado.findByTxtPc", query = "SELECT c FROM CentroPoblado c WHERE c.txtPc = :txtPc"),
    @NamedQuery(name = "CentroPoblado.findByTxtIp", query = "SELECT c FROM CentroPoblado c WHERE c.txtIp = :txtIp"),
    @NamedQuery(name = "CentroPoblado.findByFecEdicion", query = "SELECT c FROM CentroPoblado c WHERE c.fecEdicion = :fecEdicion"),
    @NamedQuery(name = "CentroPoblado.findByNumLatitud", query = "SELECT c FROM CentroPoblado c WHERE c.numLatitud = :numLatitud"),
    @NamedQuery(name = "CentroPoblado.findByNumLongitud", query = "SELECT c FROM CentroPoblado c WHERE c.numLongitud = :numLongitud")})
public class CentroPoblado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_CENTRO_POBLADO")
    private BigDecimal nidCentroPoblado;
//    @Size(max = 128)
    @Column(name = "TXT_CENTRO_POBLADO")
    private String txtCentroPoblado;
    @Basic(optional = false)
    @NotNull
//    @Size(min = 1, max = 16)
    @Column(name = "CID_CENTRO_POBLADO")
    private String cidCentroPoblado;
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
    @Column(name = "NUM_LATITUD")
    private BigDecimal numLatitud;
    @Column(name = "NUM_LONGITUD")
    private BigDecimal numLongitud;
    @JoinColumn(name = "NID_AREA_CENTRO_POBLADO", referencedColumnName = "NID_AREA_CENTRO_POBLADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private AreaCentroPoblado areaCentroPoblado;
    @JoinColumn(name = "NID_DISTRITO", referencedColumnName = "NID_DISTRITO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Distrito distrito;

    public CentroPoblado() {
    }

    public CentroPoblado(BigDecimal nidCentroPoblado) {
        this.nidCentroPoblado = nidCentroPoblado;
    }

    public CentroPoblado(BigDecimal nidCentroPoblado, String cidCentroPoblado) {
        this.nidCentroPoblado = nidCentroPoblado;
        this.cidCentroPoblado = cidCentroPoblado;
    }

    public BigDecimal getNidCentroPoblado() {
        return nidCentroPoblado;
    }

    public void setNidCentroPoblado(BigDecimal nidCentroPoblado) {
        this.nidCentroPoblado = nidCentroPoblado;
    }

    public String getTxtCentroPoblado() {
        return txtCentroPoblado;
    }

    public void setTxtCentroPoblado(String txtCentroPoblado) {
        this.txtCentroPoblado = txtCentroPoblado;
    }

    public String getCidCentroPoblado() {
        return cidCentroPoblado;
    }

    public void setCidCentroPoblado(String cidCentroPoblado) {
        this.cidCentroPoblado = cidCentroPoblado;
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

    public BigDecimal getNumLatitud() {
        return numLatitud;
    }

    public void setNumLatitud(BigDecimal numLatitud) {
        this.numLatitud = numLatitud;
    }

    public BigDecimal getNumLongitud() {
        return numLongitud;
    }

    public void setNumLongitud(BigDecimal numLongitud) {
        this.numLongitud = numLongitud;
    }

    public AreaCentroPoblado getAreaCentroPoblado() {
        return areaCentroPoblado;
    }

    public void setAreaCentroPoblado(AreaCentroPoblado areaCentroPoblado) {
        this.areaCentroPoblado = areaCentroPoblado;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidCentroPoblado != null ? nidCentroPoblado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CentroPoblado)) {
            return false;
        }
        CentroPoblado other = (CentroPoblado) object;
        if ((this.nidCentroPoblado == null && other.nidCentroPoblado != null) || (this.nidCentroPoblado != null && !this.nidCentroPoblado.equals(other.nidCentroPoblado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.CentroPoblado[ nidCentroPoblado=" + nidCentroPoblado + " ]";
    }
    
}
