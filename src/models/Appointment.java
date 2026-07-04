package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private String id;
    private LocalDate date;
    private LocalTime time;
    private String patientName;
    private LocalDate birthDate;
    private String patientType;
    private String anamnesis;
    private String phone;

    public Appointment(String id, LocalDate date, LocalTime time, String patientName, LocalDate birthDate, String patientType, String anamnesis, String phone) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.patientName = patientName;
        this.birthDate = birthDate;
        this.patientType = patientType;
        this.anamnesis = anamnesis;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}