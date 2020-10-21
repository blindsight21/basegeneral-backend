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
@Table(name = "PAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p"),
    @NamedQuery(name = "Pais.findByNidPais", query = "SELECT p FROM Pais p WHERE p.nidPais = :nidPais"),
    @NamedQuery(name = "Pais.findByTxtPais", query = "SELECT p FROM Pais p WHERE p.txtPais = :txtPais"),
    @NamedQuery(name = "Pais.findByTxtSiglas", query = "SELECT p FROM Pais p WHERE p.txtSiglas = :txtSiglas"),
    @NamedQuery(name = "Pais.findByTxtCodigo", query = "SELECT p FROM Pais p WHERE p.txtCodigo = :txtCodigo"),
    @NamedQuery(name = "Pais.findByFlgActivo", query = "SELECT p FROM Pais p WHERE p.flgActivo = :flgActivo"),
    @NamedQuery(name = "Pais.findByNidUsuario", query = "SELECT p FROM Pais p WHERE p.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "Pais.findByTxtPc", query = "SELECT p FROM Pais p WHERE p.txtPc = :txtPc"),
    @NamedQuery(name = "Pais.findByTxtIp", query = "SELECT p FROM Pais p WHERE p.txtIp = :txtIp"),
    @NamedQuery(name = "Pais.findByFecEdicion", query = "SELECT p FROM Pais p WHERE p.fecEdicion = :fecEdicion")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_PAIS")
    private BigDecimal nidPais;
//    @Size(max = 50)
    @Column(name = "TXT_PAIS")
    private String txtPais;
//    @Size(max = 10)
    @Column(name = "TXT_SIGLAS")
    private String txtSiglas;
//    @Size(max = 20)
    @Column(name = "TXT_CODIGO")
    private String txtCodigo;
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
    @JoinColumn(name = "NID_CONTINENTE", referencedColumnName = "NID_CONTINENTE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Continente continente;

    public Pais() {
    }

    public Pais(BigDecimal nidPais) {
        this.nidPais = nidPais;
    }

    public BigDecimal getNidPais() {
        return nidPais;
    }

    public void setNidPais(BigDecimal nidPais) {
        this.nidPais = nidPais;
    }

    public String getTxtPais() {
        return txtPais;
    }

    public void setTxtPais(String txtPais) {
        this.txtPais = txtPais;
    }

    public String getTxtSiglas() {
        return txtSiglas;
    }

    public void setTxtSiglas(String txtSiglas) {
        this.txtSiglas = txtSiglas;
    }

    public String getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(String txtCodigo) {
        this.txtCodigo = txtCodigo;
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

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidPais != null ? nidPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.nidPais == null && other.nidPais != null) || (this.nidPais != null && !this.nidPais.equals(other.nidPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Pais[ nidPais=" + nidPais + " ]";
    }
    
}
