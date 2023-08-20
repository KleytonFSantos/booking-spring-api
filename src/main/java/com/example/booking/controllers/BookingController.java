package com.example.booking.controllers;

import com.example.booking.domain.Reservation.Reservation;
import com.example.booking.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {


    @Autowired
    private ReservationService service;

    @GetMapping
    public ResponseEntity<List<Reservation>> listBookings() {
        var reservation = service.allReservations();

        return new ResponseEntity<>(reservation, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String>createBookings() {
        return new ResponseEntity<>("", HttpStatus.CREATED);
    }
}
