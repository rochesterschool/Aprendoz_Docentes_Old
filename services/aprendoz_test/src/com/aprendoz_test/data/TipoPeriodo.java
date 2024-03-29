
package com.aprendoz_test.data;

import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_test.TipoPeriodo
 *  11/07/2014 13:24:51
 * 
 */
public class TipoPeriodo {

    private Integer idTipoPeriodo;
    private String tipoPeriodo;
    private Set<com.aprendoz_test.data.Periodo> periodos = new HashSet<com.aprendoz_test.data.Periodo>();

    public TipoPeriodo() {
    }

    public TipoPeriodo(Integer idTipoPeriodo, String tipoPeriodo) {
        this.idTipoPeriodo = idTipoPeriodo;
        this.tipoPeriodo = tipoPeriodo;
    }

    public TipoPeriodo(Integer idTipoPeriodo, String tipoPeriodo, Set<com.aprendoz_test.data.Periodo> periodos) {
        this.idTipoPeriodo = idTipoPeriodo;
        this.tipoPeriodo = tipoPeriodo;
        this.periodos = periodos;
    }

    public Integer getIdTipoPeriodo() {
        return idTipoPeriodo;
    }

    public void setIdTipoPeriodo(Integer idTipoPeriodo) {
        this.idTipoPeriodo = idTipoPeriodo;
    }

    public String getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setTipoPeriodo(String tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }

    public Set<com.aprendoz_test.data.Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(Set<com.aprendoz_test.data.Periodo> periodos) {
        this.periodos = periodos;
    }

}
