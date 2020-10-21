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
@Table(name = "DISTRITO_COORDENADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistritoCoordenadas.findAll", query = "SELECT d FROM DistritoCoordenadas d"),
    @NamedQuery(name = "DistritoCoordenadas.findByNidDistritoCoordenadas", query = "SELECT d FROM DistritoCoordenadas d WHERE d.nidDistritoCoordenadas = :nidDistritoCoordenadas"),
    @NamedQuery(name = "DistritoCoordenadas.findByUbigeo", query = "SELECT d FROM DistritoCoordenadas d WHERE d.ubigeo = :ubigeo"),
    @NamedQuery(name = "DistritoCoordenadas.findByNumLatitud", query = "SELECT d FROM DistritoCoordenadas d WHERE d.numLatitud = :numLatitud"),
    @NamedQuery(name = "DistritoCoordenadas.findByNumLongitud", query = "SELECT d FROM DistritoCoordenadas d WHERE d.numLongitud = :numLongitud"),
    @NamedQuery(name = "DistritoCoordenadas.findByFlgActivo", query = "SELECT d FROM DistritoCoordenadas d WHERE d.flgActivo = :flgActivo"),
    @NamedQuery(name = "DistritoCoordenadas.findByNidUsuario", query = "SELECT d FROM DistritoCoordenadas d WHERE d.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "DistritoCoordenadas.findByTxtPc", query = "SELECT d FROM DistritoCoordenadas d WHERE d.txtPc = :txtPc"),
    @NamedQuery(name = "DistritoCoordenadas.findByTxtIp", query = "SELECT d FROM DistritoCoordenadas d WHERE d.txtIp = :txtIp"),
    @NamedQuery(name = "DistritoCoordenadas.findByFecEdicion", query = "SELECT d FROM DistritoCoordenadas d WHERE d.fecEdicion = :fecEdicion")})
public class DistritoCoordenadas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_DISTRITO_COORDENADAS")
    private BigDecimal nidDistritoCoordenadas;
//    @Size(max = 6)
    @Column(name = "UBIGEO")
    private String ubigeo;
    @Column(name = "NUM_LATITUD")
    private BigDecimal numLatitud;
    @Column(name = "NUM_LONGITUD")
    private BigDecimal numLongitud;
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
    @JoinColumn(name = "NID_DISTRITO", referencedColumnName = "NID_DISTRITO")
    @ManyToOne(fetch = FetchType.LAZY)
    private Distrito distrito;

    public DistritoCoordenadas() {
    }

    public DistritoCoordenadas(BigDecimal nidDistritoCoordenadas) {
        this.nidDistritoCoordenadas = nidDistritoCoordenadas;
    }

    public BigDecimal getNidDistritoCoordenadas() {
        return nidDistritoCoordenadas;
    }

    public void setNidDistritoCoordenadas(BigDecimal nidDistritoCoordenadas) {
        this.nidDistritoCoordenadas = nidDistritoCoordenadas;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
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

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidDistritoCoordenadas != null ? nidDistritoCoordenadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistritoCoordenadas)) {
            return false;
        }
        DistritoCoordenadas other = (DistritoCoordenadas) object;
        if ((this.nidDistritoCoordenadas == null && other.nidDistritoCoordenadas != null) || (this.nidDistritoCoordenadas != null && !this.nidDistritoCoordenadas.equals(other.nidDistritoCoordenadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.DistritoCoordenadas[ nidDistritoCoordenadas=" + nidDistritoCoordenadas + " ]";
    }
    
}
