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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "DEPARTAMENTO")
public class Departamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CID_DEPARTAMENTO")
    private String cidDepartamento;
    @Column(name = "TXT_DESCRIPCION")
    private String txtDescripcion;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
    @Column(name = "NID_USUARIO")
    private BigInteger nidUsuario;
    @Column(name = "TXT_PC")
    private String txtPc;
    @Column(name = "TXT_IP")
    private String txtIp;
    @Column(name = "FEC_EDICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEdicion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_DEPARTAMENTO")
    private BigDecimal nidDepartamento;
    @Column(name = "INEI")
    private String inei;
    @Column(name = "RENIEC")
    private String reniec;

    public Departamento() {
    }

    public Departamento(BigDecimal nidDepartamento) {
        this.nidDepartamento = nidDepartamento;
    }

    public Departamento(BigDecimal nidDepartamento, String cidDepartamento) {
        this.nidDepartamento = nidDepartamento;
        this.cidDepartamento = cidDepartamento;
    }

    public String getCidDepartamento() {
        return cidDepartamento;
    }

    public void setCidDepartamento(String cidDepartamento) {
        this.cidDepartamento = cidDepartamento;
    }

    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
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

    public BigDecimal getNidDepartamento() {
        return nidDepartamento;
    }

    public void setNidDepartamento(BigDecimal nidDepartamento) {
        this.nidDepartamento = nidDepartamento;
    }

    public String getInei() {
        return inei;
    }

    public void setInei(String inei) {
        this.inei = inei;
    }

    public String getReniec() {
        return reniec;
    }

    public void setReniec(String reniec) {
        this.reniec = reniec;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidDepartamento != null ? nidDepartamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamento)) {
            return false;
        }
        Departamento other = (Departamento) object;
        if ((this.nidDepartamento == null && other.nidDepartamento != null) || (this.nidDepartamento != null && !this.nidDepartamento.equals(other.nidDepartamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Departamento[ nidDepartamento=" + nidDepartamento + " ]";
    }
    
}
