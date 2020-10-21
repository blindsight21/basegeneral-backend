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
 * @author Hydra
 */
@Entity
@Table(name = "PARAMETRO_GENERAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametroGeneral.findAll", query = "SELECT p FROM ParametroGeneral p"),
    @NamedQuery(name = "ParametroGeneral.findByNidParametro", query = "SELECT p FROM ParametroGeneral p WHERE p.nidParametro = :nidParametro"),
    @NamedQuery(name = "ParametroGeneral.findByCidParametro", query = "SELECT p FROM ParametroGeneral p WHERE p.cidParametro = :cidParametro"),
    @NamedQuery(name = "ParametroGeneral.findByNidParametroPadre", query = "SELECT p FROM ParametroGeneral p WHERE p.nidParametroPadre = :nidParametroPadre"),
    @NamedQuery(name = "ParametroGeneral.findByTxtValor", query = "SELECT p FROM ParametroGeneral p WHERE p.txtValor = :txtValor"),
    @NamedQuery(name = "ParametroGeneral.findByNumValor1", query = "SELECT p FROM ParametroGeneral p WHERE p.numValor1 = :numValor1"),
    @NamedQuery(name = "ParametroGeneral.findByNumValor2", query = "SELECT p FROM ParametroGeneral p WHERE p.numValor2 = :numValor2"),
    @NamedQuery(name = "ParametroGeneral.findByFlgActivo", query = "SELECT p FROM ParametroGeneral p WHERE p.flgActivo = :flgActivo"),
    @NamedQuery(name = "ParametroGeneral.findByNidUsuario", query = "SELECT p FROM ParametroGeneral p WHERE p.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "ParametroGeneral.findByTxtPc", query = "SELECT p FROM ParametroGeneral p WHERE p.txtPc = :txtPc"),
    @NamedQuery(name = "ParametroGeneral.findByTxtIp", query = "SELECT p FROM ParametroGeneral p WHERE p.txtIp = :txtIp"),
    @NamedQuery(name = "ParametroGeneral.findByFecEdicion", query = "SELECT p FROM ParametroGeneral p WHERE p.fecEdicion = :fecEdicion"),
    @NamedQuery(name = "ParametroGeneral.findByTxtComentario", query = "SELECT p FROM ParametroGeneral p WHERE p.txtComentario = :txtComentario")})
public class ParametroGeneral implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_PARAMETRO")
    private BigDecimal nidParametro;
//    @Size(max = 50)
    @Column(name = "CID_PARAMETRO")
    private String cidParametro;
    @Column(name = "NID_PARAMETRO_PADRE")
    private BigInteger nidParametroPadre;
//    @Size(max = 4000)
    @Column(name = "TXT_VALOR")
    private String txtValor;
    @Column(name = "NUM_VALOR1")
    private BigInteger numValor1;
    @Column(name = "NUM_VALOR2")
    private BigInteger numValor2;
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
//    @Size(max = 4000)
    @Column(name = "TXT_COMENTARIO")
    private String txtComentario;

    public ParametroGeneral() {
    }

    public ParametroGeneral(BigDecimal nidParametro) {
        this.nidParametro = nidParametro;
    }

    public BigDecimal getNidParametro() {
        return nidParametro;
    }

    public void setNidParametro(BigDecimal nidParametro) {
        this.nidParametro = nidParametro;
    }

    public String getCidParametro() {
        return cidParametro;
    }

    public void setCidParametro(String cidParametro) {
        this.cidParametro = cidParametro;
    }

    public BigInteger getNidParametroPadre() {
        return nidParametroPadre;
    }

    public void setNidParametroPadre(BigInteger nidParametroPadre) {
        this.nidParametroPadre = nidParametroPadre;
    }

    public String getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(String txtValor) {
        this.txtValor = txtValor;
    }

    public BigInteger getNumValor1() {
        return numValor1;
    }

    public void setNumValor1(BigInteger numValor1) {
        this.numValor1 = numValor1;
    }

    public BigInteger getNumValor2() {
        return numValor2;
    }

    public void setNumValor2(BigInteger numValor2) {
        this.numValor2 = numValor2;
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

    public String getTxtComentario() {
        return txtComentario;
    }

    public void setTxtComentario(String txtComentario) {
        this.txtComentario = txtComentario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidParametro != null ? nidParametro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametroGeneral)) {
            return false;
        }
        ParametroGeneral other = (ParametroGeneral) object;
        if ((this.nidParametro == null && other.nidParametro != null) || (this.nidParametro != null && !this.nidParametro.equals(other.nidParametro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.ParametroGeneral[ nidParametro=" + nidParametro + " ]";
    }
    
}
