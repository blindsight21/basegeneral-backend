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
@Table(name = "LUGAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l"),
    @NamedQuery(name = "Lugar.findByNidLugar", query = "SELECT l FROM Lugar l WHERE l.nidLugar = :nidLugar"),
    @NamedQuery(name = "Lugar.findByTxtLugar", query = "SELECT l FROM Lugar l WHERE l.txtLugar = :txtLugar"),
    @NamedQuery(name = "Lugar.findByFlgActivo", query = "SELECT l FROM Lugar l WHERE l.flgActivo = :flgActivo"),
    @NamedQuery(name = "Lugar.findByNidUsuario", query = "SELECT l FROM Lugar l WHERE l.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Lugar.findByTxtPc", query = "SELECT l FROM Lugar l WHERE l.txtPc = :txtPc"),
    @NamedQuery(name = "Lugar.findByTxtIp", query = "SELECT l FROM Lugar l WHERE l.txtIp = :txtIp"),
    @NamedQuery(name = "Lugar.findByFecEdicion", query = "SELECT l FROM Lugar l WHERE l.fecEdicion = :fecEdicion")})
public class Lugar implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_LUGAR")
    private BigDecimal nidLugar;
//    @Size(max = 50)
    @Column(name = "TXT_LUGAR")
    private String txtLugar;
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

    public Lugar() {
    }

    public Lugar(BigDecimal nidLugar) {
        this.nidLugar = nidLugar;
    }

    public BigDecimal getNidLugar() {
        return nidLugar;
    }

    public void setNidLugar(BigDecimal nidLugar) {
        this.nidLugar = nidLugar;
    }

    public String getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(String txtLugar) {
        this.txtLugar = txtLugar;
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
        hash += (nidLugar != null ? nidLugar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.nidLugar == null && other.nidLugar != null) || (this.nidLugar != null && !this.nidLugar.equals(other.nidLugar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Lugar[ nidLugar=" + nidLugar + " ]";
    }
    
}
