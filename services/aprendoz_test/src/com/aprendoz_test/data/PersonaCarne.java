
package com.aprendoz_test.data;

import java.util.Date;


/**
 *  aprendoz_test.PersonaCarne
 *  11/07/2014 13:24:50
 * 
 */
public class PersonaCarne {

    private Integer idPersonaCarne;
    private Persona persona;
    private Date fecha;
    private Integer numerocopias;

    public PersonaCarne() {
    }

    public PersonaCarne(Integer idPersonaCarne, Date fecha, Integer numerocopias) {
        this.idPersonaCarne = idPersonaCarne;
        this.fecha = fecha;
        this.numerocopias = numerocopias;
    }

    public PersonaCarne(Integer idPersonaCarne, Persona persona, Date fecha, Integer numerocopias) {
        this.idPersonaCarne = idPersonaCarne;
        this.persona = persona;
        this.fecha = fecha;
        this.numerocopias = numerocopias;
    }

    public Integer getIdPersonaCarne() {
        return idPersonaCarne;
    }

    public void setIdPersonaCarne(Integer idPersonaCarne) {
        this.idPersonaCarne = idPersonaCarne;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getNumerocopias() {
        return numerocopias;
    }

    public void setNumerocopias(Integer numerocopias) {
        this.numerocopias = numerocopias;
    }

}
