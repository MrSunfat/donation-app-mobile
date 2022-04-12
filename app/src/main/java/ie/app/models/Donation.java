package ie.app.models;

import java.util.ArrayList;
import java.util.List;

public class Donation {
    public String _id;
    public int amount;
    public String paymenttype;
    public int upvotes;
    public List<Donation> donations = new ArrayList<Donation>();

    public Donation(int amount, String method, int upvotes) {
        this.amount = amount;
        this.paymenttype = method;
        this.upvotes = upvotes;
    }

    public Donation() {
        this.amount = 0;
        this.paymenttype = "";
        this.upvotes = 0;
    }

    public String toString() {
        return _id + ", " + amount + ", " + paymenttype + ", " + upvotes;
    }
}