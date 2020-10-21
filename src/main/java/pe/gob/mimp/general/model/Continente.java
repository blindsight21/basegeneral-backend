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
@Table(name = "CONTINENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Continente.findAll", query = "SELECT c FROM Continente c"),
    @NamedQuery(name = "Continente.findByNidContinente", query = "SELECT c FROM Continente c WHERE c.nidContinente = :nidContinente"),
    @NamedQuery(name = "Continente.findByTxtContinente", query = "SELECT c FROM Continente c WHERE c.txtContinente = :txtContinente"),
    @NamedQuery(name = "Continente.findByTxtSigla", query = "SELECT c FROM Continente c WHERE c.txtSigla = :txtSigla"),
    @NamedQuery(name = "Continente.findByFlgActivo", query = "SELECT c FROM Continente c WHERE c.flgActivo = :flgActivo"),
    @NamedQuery(name = "Continente.findByNidUsuario", query = "SELECT c FROM Continente c WHERE c.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Continente.findByTxtPc", query = "SELECT c FROM Continente c WHERE c.txtPc = :txtPc"),
    @NamedQuery(name = "Continente.findByTxtIp", query = "SELECT c FROM Continente c WHERE c.txtIp = :txtIp"),
    @NamedQuery(name = "Continente.findByFecEdicion", query = "SELECT c FROM Continente c WHERE c.fecEdicion = :fecEdicion")})
public class Continente implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_CONTINENTE")
    private BigDecimal nidContinente;
//    @Size(max = 50)
    @Column(name = "TXT_CONTINENTE")
    private String txtContinente;
//    @Size(max = 10)
    @Column(name = "TXT_SIGLA")
    private String txtSigla;
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
    @OneToMany(mappedBy = "continente", fetch = FetchType.LAZY)
    private List<Pais> paisList;

    public Continente() {
    }

    public Continente(BigDecimal nidContinente) {
        this.nidContinente = nidContinente;
    }

    public BigDecimal getNidContinente() {
        return nidContinente;
    }

    public void setNidContinente(BigDecimal nidContinente) {
        this.nidContinente = nidContinente;
    }

    public String getTxtContinente() {
        return txtContinente;
    }

    public void setTxtContinente(String txtContinente) {
        this.txtContinente = txtContinente;
    }

    public String getTxtSigla() {
        return txtSigla;
    }

    public void setTxtSigla(String txtSigla) {
        this.txtSigla = txtSigla;
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
    public List<Pais> getPaisList() {
        return paisList;
    }

    public void setPaisList(List<Pais> paisList) {
        this.paisList = paisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidContinente != null ? nidContinente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Continente)) {
            return false;
        }
        Continente other = (Continente) object;
        if ((this.nidContinente == null && other.nidContinente != null) || (this.nidContinente != null && !this.nidContinente.equals(other.nidContinente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Continente[ nidContinente=" + nidContinente + " ]";
    }
    
}
