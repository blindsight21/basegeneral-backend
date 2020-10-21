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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "INSTITUCION")
public class Institucion implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name = "SEQ_INSTITUCION", sequenceName = "SEQ_INSTITUCION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_INSTITUCION")
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_INSTITUCION")
    private BigDecimal nidInstitucion;
    @Column(name = "TXT_RUC")
    private String txtRuc;
    @Column(name = "TXT_RAZON_SOCIAL")
    private String txtRazonSocial;
    @Column(name = "FEC_INGRESO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecIngreso;
    @Column(name = "TXT_DOMICILIO")
    private String txtDomicilio;
    @Column(name = "TXT_TELEFONO")
    private String txtTelefono;
    @Column(name = "TXT_EMAIL")
    private String txtEmail;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
    @Column(name = "NID_USUARIO_CRE")
    private BigInteger nidUsuarioCre;
    @Column(name = "FEC_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecCreacion;
    @Column(name = "TXT_PC_CRE")
    private String txtPcCre;
    @Column(name = "TXT_IP_CRE")
    private String txtIpCre;
    @Column(name = "NID_USUARIO_MOD")
    private BigInteger nidUsuarioMod;
    @Column(name = "FEC_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecModificacion;
    @Column(name = "TXT_PC_MOD")
    private String txtPcMod;
    @Column(name = "TXT_IP_MOD")
    private String txtIpMod;

    public Institucion() {
    }

    public Institucion(BigDecimal nidInstitucion) {
        this.nidInstitucion = nidInstitucion;
    }

    public BigDecimal getNidInstitucion() {
        return nidInstitucion;
    }

    public void setNidInstitucion(BigDecimal nidInstitucion) {
        this.nidInstitucion = nidInstitucion;
    }

    public String getTxtRuc() {
        return txtRuc;
    }

    public void setTxtRuc(String txtRuc) {
        this.txtRuc = txtRuc;
    }

    public String getTxtRazonSocial() {
        return txtRazonSocial;
    }

    public void setTxtRazonSocial(String txtRazonSocial) {
        this.txtRazonSocial = txtRazonSocial;
    }

    public Date getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(Date fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public String getTxtDomicilio() {
        return txtDomicilio;
    }

    public void setTxtDomicilio(String txtDomicilio) {
        this.txtDomicilio = txtDomicilio;
    }

    public String getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(String txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public BigInteger getNidUsuarioCre() {
        return nidUsuarioCre;
    }

    public void setNidUsuarioCre(BigInteger nidUsuarioCre) {
        this.nidUsuarioCre = nidUsuarioCre;
    }

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getTxtPcCre() {
        return txtPcCre;
    }

    public void setTxtPcCre(String txtPcCre) {
        this.txtPcCre = txtPcCre;
    }

    public String getTxtIpCre() {
        return txtIpCre;
    }

    public void setTxtIpCre(String txtIpCre) {
        this.txtIpCre = txtIpCre;
    }

    public BigInteger getNidUsuarioMod() {
        return nidUsuarioMod;
    }

    public void setNidUsuarioMod(BigInteger nidUsuarioMod) {
        this.nidUsuarioMod = nidUsuarioMod;
    }

    public Date getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
    }

    public String getTxtPcMod() {
        return txtPcMod;
    }

    public void setTxtPcMod(String txtPcMod) {
        this.txtPcMod = txtPcMod;
    }

    public String getTxtIpMod() {
        return txtIpMod;
    }

    public void setTxtIpMod(String txtIpMod) {
        this.txtIpMod = txtIpMod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidInstitucion != null ? nidInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.nidInstitucion == null && other.nidInstitucion != null) || (this.nidInstitucion != null && !this.nidInstitucion.equals(other.nidInstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.Institucion[ nidInstitucion=" + nidInstitucion + " ]";
    }
    
}
