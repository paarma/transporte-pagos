package com.sandbox.entitys;

import javax.persistence.*;

@Entity
@Table(name = "VIAJES")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long idViaje;

    @Column(name = "LATITUD_INICIO")
    private Double latitudInicio;

    @Column(name = "LONGITUD_INICIO")
    private Double longitudInicio;

    @Column(name = "LATITUD_FIN")
    private Double latitudFin;

    @Column(name = "LONGITUD_FIN")
    private Double longitudFin;

    @Column(name = "EMAIL_CLIENTE")
    private String emailCliente;

    @Column(name = "ID_CONDUCTOR")
    private Long idConductor;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "TOTAL_RECORRIDO")
    private Double totalRecorrido;

    @Column(name = "MONTO")
    private Double monto;

    @ManyToOne
    @JoinColumn(name = "ID_CONDUCTOR", insertable = false, updatable = false)
    private Conductor conductor;


    public Long getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(Long idViaje) {
        this.idViaje = idViaje;
    }

    public Double getLatitudInicio() {
        return latitudInicio;
    }

    public void setLatitudInicio(Double latitudInicio) {
        this.latitudInicio = latitudInicio;
    }

    public Double getLongitudInicio() {
        return longitudInicio;
    }

    public void setLongitudInicio(Double longitudInicio) {
        this.longitudInicio = longitudInicio;
    }

    public Double getLatitudFin() {
        return latitudFin;
    }

    public void setLatitudFin(Double latitudFin) {
        this.latitudFin = latitudFin;
    }

    public Double getLongitudFin() {
        return longitudFin;
    }

    public void setLongitudFin(Double longitudFin) {
        this.longitudFin = longitudFin;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Long getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getTotalRecorrido() {
        return totalRecorrido;
    }

    public void setTotalRecorrido(Double totalRecorrido) {
        this.totalRecorrido = totalRecorrido;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
