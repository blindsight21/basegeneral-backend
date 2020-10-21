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
import javax.persistence.Id;
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
@Table(name = "VIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Via.findAll", query = "SELECT v FROM Via v"),
    @NamedQuery(name = "Via.findByNidVia", query = "SELECT v FROM Via v WHERE v.nidVia = :nidVia"),
    @NamedQuery(name = "Via.findByTxtVia", query = "SELECT v FROM Via v WHERE v.txtVia = :txtVia"),
    @NamedQuery(name = "Via.findByFlgActivo", query = "SELECT v FROM Via v WHERE v.flgActivo = :flgActivo"),
    @NamedQuery(name = "Via.findByNidUsuario", query = "SELECT v FROM Via v WHERE v.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Via.findByTxtPc", query = "SELECT v FROM Via v WHERE v.txtPc = :txtPc"),
    @NamedQuery(name = "Via.findByTxtIp", query = "SELECT v FROM Via v WHERE v.txtIp = :txtIp"),
    @NamedQuery(name = "Via.findByFecEdicion", query = "SELECT v FROM Via v WHERE v.fecEdicion = :fecEdicion")})
public class Via implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_VIA")
    private BigDecimal nidVia;
//    @Size(max = 128)
    @Column(name = "TXT_VIA")
    private String txtVia;
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

    public Via() {
    }

    public Via(BigDecimal nidVia) {
        this.nidVia = nidVia;
    }

    public BigDecimal getNidVia() {
        return nidVia;
    }

    public void setNidVia(BigDecimal nidVia) {
        this.nidVia = nidVia;
    }

    public String getTxtVia() {
        return txtVia;
    }

    public void setTxtVia(String txtVia) {
        this.txtVia = txtVia;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidVia != null ? nidVia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Via)) {
            return false;
        }
        Via other = (Via) object;
        if ((this.nidVia == null && other.nidVia != null) || (this.nidVia != null && !this.nidVia.equals(other.nidVia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Via[ nidVia=" + nidVia + " ]";
    }
    
}
