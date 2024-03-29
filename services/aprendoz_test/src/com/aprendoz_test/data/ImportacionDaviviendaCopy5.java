
package com.aprendoz_test.data;

import java.util.Date;


/**
 *  aprendoz_test.ImportacionDaviviendaCopy5
 *  02/17/2014 14:11:56
 * 
 */
public class ImportacionDaviviendaCopy5 {

    private Integer idImportacionDavivienda;
    private String tarjeta;
    private String nombresocio;
    private String numeroidentificacion;
    private String estado;
    private Date fechaCreacion;
    private Date fechaModificacion;

    public ImportacionDaviviendaCopy5() {
    }

    public ImportacionDaviviendaCopy5(Integer idImportacionDavivienda, String tarjeta, String nombresocio, String numeroidentificacion, String estado, Date fechaCreacion, Date fechaModificacion) {
        this.idImportacionDavivienda = idImportacionDavivienda;
        this.tarjeta = tarjeta;
        this.nombresocio = nombresocio;
        this.numeroidentificacion = numeroidentificacion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdImportacionDavivienda() {
        return idImportacionDavivienda;
    }

    public void setIdImportacionDavivienda(Integer idImportacionDavivienda) {
        this.idImportacionDavivienda = idImportacionDavivienda;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombresocio() {
        return nombresocio;
    }

    public void setNombresocio(String nombresocio) {
        this.nombresocio = nombresocio;
    }

    public String getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(String numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
