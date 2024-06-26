package com.hotelreservations.steps;

import com.hotelreservations.models.BookingResponse;
import com.hotelreservations.sevices.ReservationService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.awt.print.Book;

public class ReservationSteps {
    ReservationService reservationService;
    String authKey;
    BookingResponse bookingResponse;

    @Given("Kullanici yeni bir rezervasyon olusturuyor")
    public void startCall(){
        reservationService = new ReservationService();
    }

    @Given("Kullanici rezervasyon icin gereken bilgileri giriyor")
    public void vocreateAuth(){
        authKey=reservationService.generateToken();
    }

    @When("Kullanici otel rezervasyonu yaratiyor")
    public void createReservation(){
        bookingResponse=reservationService.createBooking();
    }

    @Then("Rezervasyon basarili bir sekilde olusturuldu")
    public  void reservationAssertions(){
        Assertions.assertEquals("Deniz",bookingResponse.getBooking().getFirstname());
        Assertions.assertEquals("Bayrak",bookingResponse.getBooking().getLastname());
        Assertions.assertEquals(500,bookingResponse.getBooking().getTotalprice());
        Assertions.assertFalse(bookingResponse.getBooking().isDepositpaid());
        Assertions.assertEquals("no smoking room",bookingResponse.getBooking().getAdditionalneeds());
    }

    @Then("Kullanici olusturulan rezervasyonu iptal ediyor")
    public void cancelReservation(){
        reservationService.deleteReservation(authKey, bookingResponse.getBookingid());
    }
}
