package com.rancho_smart.ms_cruces.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CRUCE")
public class Cruce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCruce;

    @Column(name = "ID_MADRE")
    private Long idMadre;

    @Column(name = "ID_PADRE")
    private Long idPadre;

    @Column(name = "PADRE")
    private String padre;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "EXITO")
    private boolean exito;

    @Column(name = "EJECUTADO", nullable = false)
    private boolean ejecutado;

    @Column(name = "CALIFICACION")
    private int calificacion;

    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    @Column(name = "ID_FINCA")
    private Long idFinca;

    public Cruce() {
    }

    public Cruce(Long idMadre, Long idPadre, String padre, LocalDateTime fecha, boolean exito, boolean ejecutado,
            int calificacion, Long idUsuario, Long idFinca) {
        this.idMadre = idMadre;
        this.idPadre = idPadre;
        this.padre = padre;
        this.fecha = fecha;
        this.exito = exito;
        this.ejecutado = ejecutado;
        this.calificacion = calificacion;
        this.idUsuario = idUsuario;
        this.idFinca = idFinca;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(Long idFinca) {
        this.idFinca = idFinca;
    }

    public Long getIdCruce() {
        return idCruce;
    }

    public void setIdCruce(Long idCruce) {
        this.idCruce = idCruce;
    }

    public Long getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(Long idMadre) {
        this.idMadre = idMadre;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public boolean isEjecutado() {
        return ejecutado;
    }

    public void setEjecutado(boolean ejecutado) {
        this.ejecutado = ejecutado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
