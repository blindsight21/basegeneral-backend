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
@Table(name = "DEPARTAMENTO_COORDENADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DepartamentoCoordenadas.findAll", query = "SELECT d FROM DepartamentoCoordenadas d"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByNidDepartamentoCoordenadas", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.nidDepartamentoCoordenadas = :nidDepartamentoCoordenadas"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByNumLatitud", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.numLatitud = :numLatitud"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByNumLongitud", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.numLongitud = :numLongitud"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByNidUsuario", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByTxtPc", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.txtPc = :txtPc"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByTxtIp", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.txtIp = :txtIp"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByFlgActivo", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.flgActivo = :flgActivo"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByNumOrden", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.numOrden = :numOrden"),
    @NamedQuery(name = "DepartamentoCoordenadas.findByFecEdicion", query = "SELECT d FROM DepartamentoCoordenadas d WHERE d.fecEdicion = :fecEdicion")})
public class DepartamentoCoordenadas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_DEPARTAMENTO_COORDENADAS")
    private BigDecimal nidDepartamentoCoordenadas;
    @Column(name = "NUM_LATITUD")
    private BigDecimal numLatitud;
    @Column(name = "NUM_LONGITUD")
    private BigDecimal numLongitud;
    @Column(name = "NID_USUARIO")
    private BigInteger nidUsuario;
//    @Size(max = 50)
    @Column(name = "TXT_PC")
    private String txtPc;
//    @Size(max = 20)
    @Column(name = "TXT_IP")
    private String txtIp;
    @Column(name = "FLG_ACTIVO")
    private BigInteger flgActivo;
    @Column(name = "NUM_ORDEN")
    private BigInteger numOrden;
    @Column(name = "FEC_EDICION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecEdicion;
    @JoinColumn(name = "NID_DEPARTAMENTO", referencedColumnName = "NID_DEPARTAMENTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamento departamento;

    public DepartamentoCoordenadas() {
    }

    public DepartamentoCoordenadas(BigDecimal nidDepartamentoCoordenadas) {
        this.nidDepartamentoCoordenadas = nidDepartamentoCoordenadas;
    }

    public BigDecimal getNidDepartamentoCoordenadas() {
        return nidDepartamentoCoordenadas;
    }

    public void setNidDepartamentoCoordenadas(BigDecimal nidDepartamentoCoordenadas) {
        this.nidDepartamentoCoordenadas = nidDepartamentoCoordenadas;
    }

    public BigDecimal getNumLatitud() {
        return numLatitud;
    }

    public void setNumLatitud(BigDecimal numLatitud) {
        this.numLatitud = numLatitud;
    }

    public BigDecimal getNumLongitud() {
        return numLongitud;
    }

    public void setNumLongitud(BigDecimal numLongitud) {
        this.numLongitud = numLongitud;
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

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public BigInteger getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(BigInteger numOrden) {
        this.numOrden = numOrden;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidDepartamentoCoordenadas != null ? nidDepartamentoCoordenadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DepartamentoCoordenadas)) {
            return false;
        }
        DepartamentoCoordenadas other = (DepartamentoCoordenadas) object;
        if ((this.nidDepartamentoCoordenadas == null && other.nidDepartamentoCoordenadas != null) || (this.nidDepartamentoCoordenadas != null && !this.nidDepartamentoCoordenadas.equals(other.nidDepartamentoCoordenadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.DepartamentoCoordenadas[ nidDepartamentoCoordenadas=" + nidDepartamentoCoordenadas + " ]";
    }
    
}
