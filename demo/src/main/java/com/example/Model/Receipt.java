package com.example.Model;
import java.sql.Timestamp;

public class Receipt {
    private String id;
    private int amount;
    private Timestamp timeCreated;
    private Status status;

    public Receipt(String id, int amount) {
        this.id = id;
        this.amount = amount;
        this.status = Status.PENDING;
    }

    public String getId() {
        return this.id;
    }

    public int getAmount() {
        return this.amount;
    }

    public Timestamp getTimeCreated() {
        return this.timeCreated;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus;
    }
}
