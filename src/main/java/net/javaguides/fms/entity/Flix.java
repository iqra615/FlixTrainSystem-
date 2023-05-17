package net.javaguides.fms.entity;


import jakarta.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter


@Entity
@Table(name= "flix")



public class Flix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "passenger_Name", nullable = false)
    private String passengerName;

    @Column(name="passenger_Email")
    private String passengerEmail;

    @Column(name = "booking_Number")
    private String bookingNumber;

    @Column(name = "ticket_Price")
    private String ticketPrice;

    public Flix(){

    }



}
