package com.aviabooking.entity;

import javax.persistence.*;

/**
 * Created by vataga on 25.09.2015.
 */
@Entity
@Table(name = "Flight", schema = "public", catalog = "avia")
public class FlightEntity {
    private String flight;
    private String departureCity;
    private String arrivalCity;
    private String plane;
    private Integer availableSeats;
    private String clazz;

    @Id
    @Column(name = "Flight")
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Basic
    @Column(name = "Departure_city")
    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    @Basic
    @Column(name = "Arrival_city")
    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    @Basic
    @Column(name = "Plane")
    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    @Basic
    @Column(name = "Available_seats")
    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Basic
    @Column(name = "Class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightEntity that = (FlightEntity) o;

        if (flight != null ? !flight.equals(that.flight) : that.flight != null) return false;
        if (departureCity != null ? !departureCity.equals(that.departureCity) : that.departureCity != null)
            return false;
        if (arrivalCity != null ? !arrivalCity.equals(that.arrivalCity) : that.arrivalCity != null) return false;
        if (plane != null ? !plane.equals(that.plane) : that.plane != null) return false;
        if (availableSeats != null ? !availableSeats.equals(that.availableSeats) : that.availableSeats != null)
            return false;
        if (clazz != null ? !clazz.equals(that.clazz) : that.clazz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = flight != null ? flight.hashCode() : 0;
        result = 31 * result + (departureCity != null ? departureCity.hashCode() : 0);
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        result = 31 * result + (plane != null ? plane.hashCode() : 0);
        result = 31 * result + (availableSeats != null ? availableSeats.hashCode() : 0);
        result = 31 * result + (clazz != null ? clazz.hashCode() : 0);
        return result;
    }
}
