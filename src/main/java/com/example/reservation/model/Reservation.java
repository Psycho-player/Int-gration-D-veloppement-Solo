package com.example.reservation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Reservation {

    private String id = UUID.randomUUID().toString();

    @NotBlank(message = "Le nom est obligatoire")
    @Size(max = 80, message = "Le nom ne peut pas dépasser 80 caractères")
    private String fullName;

    @NotBlank(message = "L'adresse e-mail est obligatoire")
    @Email(message = "L'adresse e-mail n'est pas valide")
    private String email;

    @NotNull(message = "La date est obligatoire")
    @FutureOrPresent(message = "La date ne peut pas être dans le passé")
    private LocalDate reservationDate;

    @NotNull(message = "L'heure est obligatoire")
    private LocalTime reservationTime;

    @NotNull(message = "Le nombre de personnes est obligatoire")
    @Min(value = 1, message = "Il faut au moins 1 personne")
    @Max(value = 12, message = "Maximum 12 personnes par réservation")
    private Integer guests;

    @Size(max = 250, message = "Le message ne peut pas dépasser 250 caractères")
    private String message;

    public Reservation() {
    }

    public Reservation(String fullName, String email, LocalDate reservationDate, LocalTime reservationTime, Integer guests, String message) {
        this.fullName = fullName;
        this.email = email;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
        this.guests = guests;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Integer getGuests() {
        return guests;
    }

    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
