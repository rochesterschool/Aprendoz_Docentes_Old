
package com.aprendoz_test.data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  aprendoz_test.Aprendizaje
 *  09/03/2014 16:11:01
 * 
 */
public class Aprendizaje {

    private Integer idAprendizaje;
    private Inteligencia inteligencia;
    private DimensionComprension dimensionComprension;
    private Subtopico subtopico;
    private NivelEsperado nivelEsperado;
    private DimensionCurricular dimensionCurricular;
    private Date fechaEsperada;
    private String aprendizaje;
    private String learning;
    private Integer peso;
    private Integer ejeIdEje;
    private Integer eje2IdEje;
    private Integer eje3IdEje;
    private Set<com.aprendoz_test.data.CalificacionFinal> calificacionFinals = new HashSet<com.aprendoz_test.data.CalificacionFinal>();
    private Set<com.aprendoz_test.data.InscAlumAprendizaje> inscAlumAprendizajes = new HashSet<com.aprendoz_test.data.InscAlumAprendizaje>();

    public Aprendizaje() {
    }

    public Aprendizaje(Integer idAprendizaje, Date fechaEsperada, String aprendizaje, String learning, Integer peso, Integer ejeIdEje, Integer eje2IdEje, Integer eje3IdEje) {
        this.idAprendizaje = idAprendizaje;
        this.fechaEsperada = fechaEsperada;
        this.aprendizaje = aprendizaje;
        this.learning = learning;
        this.peso = peso;
        this.ejeIdEje = ejeIdEje;
        this.eje2IdEje = eje2IdEje;
        this.eje3IdEje = eje3IdEje;
    }

    public Aprendizaje(Integer idAprendizaje, Inteligencia inteligencia, DimensionComprension dimensionComprension, Subtopico subtopico, NivelEsperado nivelEsperado, DimensionCurricular dimensionCurricular, Date fechaEsperada, String aprendizaje, String learning, Integer peso, Integer ejeIdEje, Integer eje2IdEje, Integer eje3IdEje, Set<com.aprendoz_test.data.CalificacionFinal> calificacionFinals, Set<com.aprendoz_test.data.InscAlumAprendizaje> inscAlumAprendizajes) {
        this.idAprendizaje = idAprendizaje;
        this.inteligencia = inteligencia;
        this.dimensionComprension = dimensionComprension;
        this.subtopico = subtopico;
        this.nivelEsperado = nivelEsperado;
        this.dimensionCurricular = dimensionCurricular;
        this.fechaEsperada = fechaEsperada;
        this.aprendizaje = aprendizaje;
        this.learning = learning;
        this.peso = peso;
        this.ejeIdEje = ejeIdEje;
        this.eje2IdEje = eje2IdEje;
        this.eje3IdEje = eje3IdEje;
        this.calificacionFinals = calificacionFinals;
        this.inscAlumAprendizajes = inscAlumAprendizajes;
    }

    public Integer getIdAprendizaje() {
        return idAprendizaje;
    }

    public void setIdAprendizaje(Integer idAprendizaje) {
        this.idAprendizaje = idAprendizaje;
    }

    public Inteligencia getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Inteligencia inteligencia) {
        this.inteligencia = inteligencia;
    }

    public DimensionComprension getDimensionComprension() {
        return dimensionComprension;
    }

    public void setDimensionComprension(DimensionComprension dimensionComprension) {
        this.dimensionComprension = dimensionComprension;
    }

    public Subtopico getSubtopico() {
        return subtopico;
    }

    public void setSubtopico(Subtopico subtopico) {
        this.subtopico = subtopico;
    }

    public NivelEsperado getNivelEsperado() {
        return nivelEsperado;
    }

    public void setNivelEsperado(NivelEsperado nivelEsperado) {
        this.nivelEsperado = nivelEsperado;
    }

    public DimensionCurricular getDimensionCurricular() {
        return dimensionCurricular;
    }

    public void setDimensionCurricular(DimensionCurricular dimensionCurricular) {
        this.dimensionCurricular = dimensionCurricular;
    }

    public Date getFechaEsperada() {
        return fechaEsperada;
    }

    public void setFechaEsperada(Date fechaEsperada) {
        this.fechaEsperada = fechaEsperada;
    }

    public String getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(String aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    public String getLearning() {
        return learning;
    }

    public void setLearning(String learning) {
        this.learning = learning;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEjeIdEje() {
        return ejeIdEje;
    }

    public void setEjeIdEje(Integer ejeIdEje) {
        this.ejeIdEje = ejeIdEje;
    }

    public Integer getEje2IdEje() {
        return eje2IdEje;
    }

    public void setEje2IdEje(Integer eje2IdEje) {
        this.eje2IdEje = eje2IdEje;
    }

    public Integer getEje3IdEje() {
        return eje3IdEje;
    }

    public void setEje3IdEje(Integer eje3IdEje) {
        this.eje3IdEje = eje3IdEje;
    }

    public Set<com.aprendoz_test.data.CalificacionFinal> getCalificacionFinals() {
        return calificacionFinals;
    }

    public void setCalificacionFinals(Set<com.aprendoz_test.data.CalificacionFinal> calificacionFinals) {
        this.calificacionFinals = calificacionFinals;
    }

    public Set<com.aprendoz_test.data.InscAlumAprendizaje> getInscAlumAprendizajes() {
        return inscAlumAprendizajes;
    }

    public void setInscAlumAprendizajes(Set<com.aprendoz_test.data.InscAlumAprendizaje> inscAlumAprendizajes) {
        this.inscAlumAprendizajes = inscAlumAprendizajes;
    }

}
