package com.aviabooking.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by vataga on 25.09.2015.
 */
@Entity
@Table(name = "Recurrence", schema = "public", catalog = "avia")
public class RecurrenceEntity {
    private int recId;
    private Date startPeriod;
    private Date endPeriod;
    private Time departureTime;
    private Time arrivalTime;
    private Boolean mon;
    private Boolean tue;
    private Boolean wed;
    private Boolean thu;
    private Boolean fri;
    private Boolean sat;
    private Boolean sun;

    @Id
    @Column(name = "rec_id")
    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    @Basic
    @Column(name = "Start_period")
    public Date getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
    }

    @Basic
    @Column(name = "End_period")
    public Date getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(Date endPeriod) {
        this.endPeriod = endPeriod;
    }

    @Basic
    @Column(name = "Departure_time")
    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    @Basic
    @Column(name = "Arrival_time")
    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Basic
    @Column(name = "Mon")
    public Boolean getMon() {
        return mon;
    }

    public void setMon(Boolean mon) {
        this.mon = mon;
    }

    @Basic
    @Column(name = "Tue")
    public Boolean getTue() {
        return tue;
    }

    public void setTue(Boolean tue) {
        this.tue = tue;
    }

    @Basic
    @Column(name = "Wed")
    public Boolean getWed() {
        return wed;
    }

    public void setWed(Boolean wed) {
        this.wed = wed;
    }

    @Basic
    @Column(name = "Thu")
    public Boolean getThu() {
        return thu;
    }

    public void setThu(Boolean thu) {
        this.thu = thu;
    }

    @Basic
    @Column(name = "Fri")
    public Boolean getFri() {
        return fri;
    }

    public void setFri(Boolean fri) {
        this.fri = fri;
    }

    @Basic
    @Column(name = "Sat")
    public Boolean getSat() {
        return sat;
    }

    public void setSat(Boolean sat) {
        this.sat = sat;
    }

    @Basic
    @Column(name = "Sun")
    public Boolean getSun() {
        return sun;
    }

    public void setSun(Boolean sun) {
        this.sun = sun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecurrenceEntity that = (RecurrenceEntity) o;

        if (recId != that.recId) return false;
        if (startPeriod != null ? !startPeriod.equals(that.startPeriod) : that.startPeriod != null) return false;
        if (endPeriod != null ? !endPeriod.equals(that.endPeriod) : that.endPeriod != null) return false;
        if (departureTime != null ? !departureTime.equals(that.departureTime) : that.departureTime != null)
            return false;
        if (arrivalTime != null ? !arrivalTime.equals(that.arrivalTime) : that.arrivalTime != null) return false;
        if (mon != null ? !mon.equals(that.mon) : that.mon != null) return false;
        if (tue != null ? !tue.equals(that.tue) : that.tue != null) return false;
        if (wed != null ? !wed.equals(that.wed) : that.wed != null) return false;
        if (thu != null ? !thu.equals(that.thu) : that.thu != null) return false;
        if (fri != null ? !fri.equals(that.fri) : that.fri != null) return false;
        if (sat != null ? !sat.equals(that.sat) : that.sat != null) return false;
        if (sun != null ? !sun.equals(that.sun) : that.sun != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recId;
        result = 31 * result + (startPeriod != null ? startPeriod.hashCode() : 0);
        result = 31 * result + (endPeriod != null ? endPeriod.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        result = 31 * result + (mon != null ? mon.hashCode() : 0);
        result = 31 * result + (tue != null ? tue.hashCode() : 0);
        result = 31 * result + (wed != null ? wed.hashCode() : 0);
        result = 31 * result + (thu != null ? thu.hashCode() : 0);
        result = 31 * result + (fri != null ? fri.hashCode() : 0);
        result = 31 * result + (sat != null ? sat.hashCode() : 0);
        result = 31 * result + (sun != null ? sun.hashCode() : 0);
        return result;
    }
}
