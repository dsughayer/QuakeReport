package com.example.android.quakereport;

/**
 * Created by dsugh on 6/27/2017.
 */

public class Earthquake {

    /**
     * Magnitude of the earthquake
     */
    private double mMagnitude;
    /**
     * Location of the earthquake
     */
    private String mLocation;
    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Constructs a new (@link Earthquake) object
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the earthquake happened
     * @param url                is the website url to find more info about the earthquake
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /* Returns magnitude */
    public double getMagnitude() {
        return mMagnitude;
    }

    /* Returns location */
    public String getLocation() {
        return mLocation;
    }

    /* Returns Time in milliseconds */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /* Returns Url */
    public String getUrl() {
        return mUrl;
    }
}