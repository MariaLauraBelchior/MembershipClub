package com.membershipClub.MembershipClub.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "payments")
@Table(name = "tb_payments")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double price;
    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "paid_id")
    private User paid;

    @ManyToOne
    @JoinColumn(name = "delay_id")
    private User delay;

    public Payment() {
    }

    public Payment(Long id, Double price, LocalDateTime date, User paid ,User delay) {
        this.id = id;
        this.price = price;
        this.date = date;
        this.paid = paid;
        this.delay = delay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getPaid() {
        return paid;
    }

    public void setPaid(User paid) {
        this.paid = paid;
    }

    public User getDelay() {
        return delay;
    }

    public void setDelay(User delay) {
        this.delay = delay;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Payment other = (Payment) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }



    
}
