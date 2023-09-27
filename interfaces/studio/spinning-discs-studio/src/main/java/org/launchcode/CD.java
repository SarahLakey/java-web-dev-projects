package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    //field
    private String musician;

    //generate constructor
    public CD(String musician, String producer) {
        this.producer = producer;
        //initializing producer; can't use super because its from an abstract class
        this.musician = musician;
    }

    @Override
    public void spin() {

    }

    @Override
    public boolean store() {
        return false;
    }

    @Override
    public double write() {
        return 0;
    }

    @Override
    public boolean read() {
        return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
