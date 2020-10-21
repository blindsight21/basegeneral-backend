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
@Table(name = "ESTADO_CIVIL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoCivil.findAll", query = "SELECT e FROM EstadoCivil e"),
    @NamedQuery(name = "EstadoCivil.findByNidEstadoCivil", query = "SELECT e FROM EstadoCivil e WHERE e.nidEstadoCivil = :nidEstadoCivil"),
    @NamedQuery(name = "EstadoCivil.findByTxtEstadoCivil", query = "SELECT e FROM EstadoCivil e WHERE e.txtEstadoCivil = :txtEstadoCivil"),
    @NamedQuery(name = "EstadoCivil.findByFlgActivo", query = "SELECT e FROM EstadoCivil e WHERE e.flgActivo = :flgActivo"),
    @NamedQuery(name = "EstadoCivil.findByNidUsuario", query = "SELECT e FROM EstadoCivil e WHERE e.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "EstadoCivil.findByTxtPc", query = "SELECT e FROM EstadoCivil e WHERE e.txtPc = :txtPc"),
    @NamedQuery(name = "EstadoCivil.findByTxtIp", query = "SELECT e FROM EstadoCivil e WHERE e.txtIp = :txtIp"),
    @NamedQuery(name = "EstadoCivil.findByFecEdicion", query = "SELECT e FROM EstadoCivil e WHERE e.fecEdicion = :fecEdicion")})
public class EstadoCivil implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_ESTADO_CIVIL")
    private BigDecimal nidEstadoCivil;
//    @Size(max = 50)
    @Column(name = "TXT_ESTADO_CIVIL")
    private String txtEstadoCivil;
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

    public EstadoCivil() {
    }

    public EstadoCivil(BigDecimal nidEstadoCivil) {
        this.nidEstadoCivil = nidEstadoCivil;
    }

    public BigDecimal getNidEstadoCivil() {
        return nidEstadoCivil;
    }

    public void setNidEstadoCivil(BigDecimal nidEstadoCivil) {
        this.nidEstadoCivil = nidEstadoCivil;
    }

    public String getTxtEstadoCivil() {
        return txtEstadoCivil;
    }

    public void setTxtEstadoCivil(String txtEstadoCivil) {
        this.txtEstadoCivil = txtEstadoCivil;
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
        hash += (nidEstadoCivil != null ? nidEstadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoCivil)) {
            return false;
        }
        EstadoCivil other = (EstadoCivil) object;
        if ((this.nidEstadoCivil == null && other.nidEstadoCivil != null) || (this.nidEstadoCivil != null && !this.nidEstadoCivil.equals(other.nidEstadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.EstadoCivil[ nidEstadoCivil=" + nidEstadoCivil + " ]";
    }
    
}
