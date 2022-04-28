package ie.app.models;

import java.util.ArrayList;
import java.util.List;

public class Donation {

//    public String _id;
//    public String paymenttype;
    public int upvotes;
//    public List<Donation> donations = new ArrayList<Donation>();

    public int id;
    public int amount;
    public String method;

    public Donation(int amount, String method, int upvotes) {
        this.amount = amount;
        this.method = method;
        this.upvotes = upvotes;
    }

    public Donation() {
        this.amount = 0;
        this.method = "";
        this.upvotes = 0;
    }

    public String toString() {
        return id + ", " + amount + ", " + method + ", " + upvotes;
    }
}