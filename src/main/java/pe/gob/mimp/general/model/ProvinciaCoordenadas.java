/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollador
 */
@Entity
@Table(name = "PROVINCIA_COORDENADAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProvinciaCoordenadas.findAll", query = "SELECT p FROM ProvinciaCoordenadas p"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByNidProvinciaCoordenadas", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.nidProvinciaCoordenadas = :nidProvinciaCoordenadas"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByNumLatitud", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.numLatitud = :numLatitud"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByNumLongitud", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.numLongitud = :numLongitud"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByNidUsuario", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.nidUsuario = :nidUsuario"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByTxtPc", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.txtPc = :txtPc"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByTxtIp", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.txtIp = :txtIp"),
    @NamedQuery(name = "ProvinciaCoordenadas.findByFlgActivo", query = "SELECT p FROM ProvinciaCoordenadas p WHERE p.flgActivo = :flgActivo")})
public class ProvinciaCoordenadas implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NID_PROVINCIA_COORDENADAS")
    private BigDecimal nidProvinciaCoordenadas;
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
    @JoinColumn(name = "NID_PROVINCIA", referencedColumnName = "NID_PROVINCIA")
    @ManyToOne(fetch = FetchType.LAZY)
    private Provincia provincia;

    public ProvinciaCoordenadas() {
    }

    public ProvinciaCoordenadas(BigDecimal nidProvinciaCoordenadas) {
        this.nidProvinciaCoordenadas = nidProvinciaCoordenadas;
    }

    public BigDecimal getNidProvinciaCoordenadas() {
        return nidProvinciaCoordenadas;
    }

    public void setNidProvinciaCoordenadas(BigDecimal nidProvinciaCoordenadas) {
        this.nidProvinciaCoordenadas = nidProvinciaCoordenadas;
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nidProvinciaCoordenadas != null ? nidProvinciaCoordenadas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProvinciaCoordenadas)) {
            return false;
        }
        ProvinciaCoordenadas other = (ProvinciaCoordenadas) object;
        if ((this.nidProvinciaCoordenadas == null && other.nidProvinciaCoordenadas != null) || (this.nidProvinciaCoordenadas != null && !this.nidProvinciaCoordenadas.equals(other.nidProvinciaCoordenadas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.gob.mimp.general.modelo.ProvinciaCoordenadas[ nidProvinciaCoordenadas=" + nidProvinciaCoordenadas + " ]";
    }
    
}
