package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampWidth;
    private double stampLength;
    private String rubberStamp;

    public Stamp(String stampName, double stampWidth, double stampLength, String rubberStamp) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampLength = stampLength;
        this.rubberStamp = rubberStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public double getStampLength() {
        return stampLength;
    }

    public String getRubberStamp() {
        return rubberStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 && Double.compare(stamp.stampLength, stampLength) == 0 && Objects.equals(stampName, stamp.stampName) && Objects.equals(rubberStamp, stamp.rubberStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampLength, rubberStamp);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampLength=" + stampLength +
                ", rubberStamp='" + rubberStamp + '\'' +
                '}';
    }
}
