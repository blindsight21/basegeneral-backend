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
@Table(name = "DIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dia.findAll", query = "SELECT d FROM Dia d"),
    @NamedQuery(name = "Dia.findByNidDia", query = "SELECT d FROM Dia d WHERE d.nidDia = :nidDia"),
    @NamedQuery(name = "Dia.findByTxtDia", query = "SELECT d FROM Dia d WHERE d.txtDia = :txtDia"),
    @NamedQuery(name = "Dia.findByFlgActivo", query = "SELECT d FROM Dia d WHERE d.flgActivo = :flgActivo"),
    @NamedQuery(name = "Dia.findByNidUsuario", query = "SELECT d FROM Dia d WHERE d.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Dia.findByTxtPc", query = "SELECT d FROM Dia d WHERE d.txtPc = :txtPc"),
    @NamedQuery(name = "Dia.findByTxtIp", query = "SELECT d FROM Dia d WHERE d.txtIp = :txtIp"),
    @NamedQuery(name = "Dia.findByFecEdicion", query = "SELECT d FROM Dia d WHERE d.fecEdicion = :fecEdicion")})
public class Dia implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_DIA")
    private BigDecimal nidDia;
//    @Size(max = 32)
    @Column(name = "TXT_DIA")
    private String txtDia;
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

    public Dia() {
    }

    public Dia(BigDecimal nidDia) {
        this.nidDia = nidDia;
    }

    public BigDecimal getNidDia() {
        return nidDia;
    }

    public void setNidDia(BigDecimal nidDia) {
        this.nidDia = nidDia;
    }

    public String getTxtDia() {
        return txtDia;
    }

    public void setTxtDia(String txtDia) {
        this.txtDia = txtDia;
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
        hash += (nidDia != null ? nidDia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dia)) {
            return false;
        }
        Dia other = (Dia) object;
        if ((this.nidDia == null && other.nidDia != null) || (this.nidDia != null && !this.nidDia.equals(other.nidDia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Dia[ nidDia=" + nidDia + " ]";
    }
    
}
