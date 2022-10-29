package com.sandbox.entidades;

public class Travel {

    private Long travelID;
    private Double startLatitude;
    private Double startLength;
    private Double endLatitude;
    private Double endLenth;
    private String emailCustomer;
    private Long idDriver;
    private String state;
    private Double totalRoute;
    private Double mount;
    private Driver driver;

    public Travel() {
    }

    public Long getTravelID() {
        return travelID;
    }

    public void setTravelID(Long travelID) {
        this.travelID = travelID;
    }

    public Double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(Double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public Double getStartLength() {
        return startLength;
    }

    public void setStartLength(Double startLength) {
        this.startLength = startLength;
    }

    public Double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public Double getEndLenth() {
        return endLenth;
    }

    public void setEndLenth(Double endLenth) {
        this.endLenth = endLenth;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public Long getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Long idDriver) {
        this.idDriver = idDriver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getTotalRoute() {
        return totalRoute;
    }

    public void setTotalRoute(Double totalRoute) {
        this.totalRoute = totalRoute;
    }

    public Double getMount() {
        return mount;
    }

    public void setMount(Double mount) {
        this.mount = mount;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
