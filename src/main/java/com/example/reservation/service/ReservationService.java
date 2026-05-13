package com.example.reservation.service;

import com.example.reservation.model.Reservation;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ReservationService {

    private final List<Reservation> reservations = new ArrayList<>();

    public ReservationService() {
        reservations.add(new Reservation(
                "Marie Dupont",
                "marie@example.com",
                LocalDate.now().plusDays(1),
                LocalTime.of(19, 30),
                2,
                "Table près de la fenêtre si possible."
        ));

        reservations.add(new Reservation(
                "Lucas Martin",
                "lucas@example.com",
                LocalDate.now().plusDays(3),
                LocalTime.of(20, 0),
                4,
                "Anniversaire."
        ));
    }

    public List<Reservation> findAll() {
        return reservations.stream()
                .sorted(Comparator
                        .comparing(Reservation::getReservationDate)
                        .thenComparing(Reservation::getReservationTime))
                .toList();
    }

    public void save(Reservation reservation) {
        reservations.add(reservation);
    }

    public void deleteById(String id) {
        reservations.removeIf(reservation -> reservation.getId().equals(id));
    }
}
