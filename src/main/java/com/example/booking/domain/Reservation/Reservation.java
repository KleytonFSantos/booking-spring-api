package com.example.booking.domain.Reservation;

import com.example.booking.domain.Room.Room;
import com.example.booking.domain.User.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservation")
@Entity(name = "reservation")
@EqualsAndHashCode(of = "id")
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "status")
    private String status;
}
