package com.example.booking.domain.Room;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "room")
@Table(name = "room")
public class Room {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "price")
    private Integer price;

    @Column(name = "vacancy")
    private Boolean vacancy;

    @Column(name = "room_number")
    private Integer roomNumber;
}
