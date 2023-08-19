package com.example.booking.services;

import com.example.booking.domain.Reservation.Reservation;
import com.example.booking.domain.Reservation.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public List<Reservation> allReservations() {
        return repository.findAll();
    }
}
