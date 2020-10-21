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
@Table(name = "SEXO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexo.findAll", query = "SELECT s FROM Sexo s"),
    @NamedQuery(name = "Sexo.findByNidSexo", query = "SELECT s FROM Sexo s WHERE s.nidSexo = :nidSexo"),
    @NamedQuery(name = "Sexo.findByTxtSexo", query = "SELECT s FROM Sexo s WHERE s.txtSexo = :txtSexo"),
    @NamedQuery(name = "Sexo.findByFlgActivo", query = "SELECT s FROM Sexo s WHERE s.flgActivo = :flgActivo"),
    @NamedQuery(name = "Sexo.findByNidUsuario", query = "SELECT s FROM Sexo s WHERE s.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Sexo.findByTxtPc", query = "SELECT s FROM Sexo s WHERE s.txtPc = :txtPc"),
    @NamedQuery(name = "Sexo.findByTxtIp", query = "SELECT s FROM Sexo s WHERE s.txtIp = :txtIp"),
    @NamedQuery(name = "Sexo.findByFecEdicion", query = "SELECT s FROM Sexo s WHERE s.fecEdicion = :fecEdicion")})
public class Sexo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_SEXO")
    private BigDecimal nidSexo;
//    @Size(max = 32)
    @Column(name = "TXT_SEXO")
    private String txtSexo;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
    @Column(name = "NID_USUARIO")
    private BigInteger nidUsuario;
//    @Size(max = 20)
    @Column(name = "TXT_PC")
    private String txtPc;
//    @Size(max = 20)
    @Column(name = "TXT_IP")
    private String txtIp;
    @Column(name = "FEC_EDICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEdicion;

    public Sexo() {
    }

    public Sexo(BigDecimal nidSexo) {
        this.nidSexo = nidSexo;
    }

    public BigDecimal getNidSexo() {
        return nidSexo;
    }

    public void setNidSexo(BigDecimal nidSexo) {
        this.nidSexo = nidSexo;
    }

    public String getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(String txtSexo) {
        this.txtSexo = txtSexo;
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
        hash += (nidSexo != null ? nidSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexo)) {
            return false;
        }
        Sexo other = (Sexo) object;
        if ((this.nidSexo == null && other.nidSexo != null) || (this.nidSexo != null && !this.nidSexo.equals(other.nidSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Sexo[ nidSexo=" + nidSexo + " ]";
    }
    
}
