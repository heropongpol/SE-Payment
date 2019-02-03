package com.example.demo.Entity;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;

@Table(name ="Payment")
@Entity  //บอกว่าเป็น class entity class ที่เก็บขอมูล

public class Payment {
    @SequenceGenerator(name="Payment_seq",sequenceName="Payment_seq")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Payment_seq")
    @Column(name="Payment_ID")
    @Id private @NonNull Long Payment_id;
    private  int Payment_total;
    private  String card_id;
    private   Integer Card_cvv;
    private   String Card_name;





    public Long getPayment_id() {
        return Payment_id;
    }

    public void setPayment_id(Long Payment_id) {
        this.Payment_id = Payment_id;
    }


    public int getPayment_total() {
        return Payment_total;
    }
    public void setPayment_total(int Payment_total) {
        this.Payment_total = Payment_total;
    }
    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }



    public Integer getCard_cvv() {
        return Card_cvv;
    }

    public void setCard_cvv(Integer Card_cvv) {
        this.Card_cvv = Card_cvv;
    }


    public String getCard_name() {
        return Card_name;
    }

    public void setCard_name(String Card_name) {
        this.Card_name = Card_name;
    }


    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Reservationequipment.class)
    @JoinColumn(name = "Reservationequipment_ID", insertable = true)
    private  Reservationequipment reservationequipment;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Member.class)
    @JoinColumn(name = "Member_ID", insertable = true)
    private Member member;



    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Cardtype.class)
    @JoinColumn(name = "Cardtype", insertable = true)
    private  Cardtype cardtype;



    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Cardbank.class)
    @JoinColumn(name = "Cardbank", insertable = true)
    private  Cardbank cardbank;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Photocollection.class)
    @JoinColumn(name = "Photocollection", insertable = true)
    private  Photocollection photocollection;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ReservationModel.class)
    @JoinColumn(name = "ReservationModel", insertable = true)
    private  ReservationModel reservationModel;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ReservationPhotographer.class)
    @JoinColumn(name = "ReservationPhotographer", insertable = true)
    private  ReservationPhotographer reservationPhotographer;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = ReservationStudio.class)
    @JoinColumn(name = "ReservationStudio", insertable = true)
    private  ReservationStudio reservationStudio;

    public Cardbank getCardbank() {
        return cardbank;
    }

    public void setCardbank(Cardbank cardbank) {
        this.cardbank = cardbank;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Reservationequipment getReservationequipment() {
        return reservationequipment;
    }

    public void setReservationequipment(Reservationequipment reservationequipment) {
        this.reservationequipment = reservationequipment;
    }

    public Cardtype getCardtype() {
        return cardtype;
    }

    public void setCardtype(Cardtype cardtype) {
        this.cardtype = cardtype;
    }

    public ReservationModel getReservationModel() {
        return reservationModel;
    }

    public void setReservationModel(ReservationModel reservationModel) {
        this.reservationModel = reservationModel;
    }

    public ReservationStudio getReservationStudio() {
        return reservationStudio;
    }

    public void setReservationStudio(ReservationStudio reservationStudio) {
        this.reservationStudio = reservationStudio;
    }
    public ReservationPhotographer getReservationPhotographer() {
        return reservationPhotographer;
    }

    public void setReservationPhotographer(ReservationPhotographer reservationPhotographer) {
        this.reservationPhotographer = reservationPhotographer;
    }

    public Photocollection getPhotocollection() {
        return photocollection;
    }

    public void setPhotocollection(Photocollection photocollection) {
        this.photocollection = photocollection;
    }
    public Payment() {
    }
    public Payment(int Payment_total, Member member,String card_id, int Card_cvv, String Card_name,
                   Reservationequipment reservationequipment, Cardtype cardtype, Cardbank cardbank,Photocollection photocollection,
                   ReservationPhotographer reservationPhotographer, ReservationStudio reservationStudio, ReservationModel reservationModel)
    {  //constructor

        this.Payment_total = Payment_total;
        this.member = member;
        this.reservationequipment = reservationequipment;
        this.reservationModel = reservationModel;
        this.reservationPhotographer = reservationPhotographer;
        this.reservationStudio = reservationStudio;
        this.photocollection = photocollection;
        this.cardtype = cardtype;
        this.cardbank = cardbank;
        this.card_id = card_id;
        this.Card_cvv = Card_cvv;
        this.Card_name = Card_name;
    }
}
