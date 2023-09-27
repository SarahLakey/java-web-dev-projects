package org.launchcode;

public interface OpticalDisc {


    void spin();
    boolean store(); //boolean returns true if successful
    double write(); //amount of data
    boolean read(); //boolean returns true if readable



}
