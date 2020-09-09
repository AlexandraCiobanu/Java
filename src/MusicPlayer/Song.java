package com.jetbrains;

public class Song {
    private String name;
    private int length;
    private boolean wasListened;

    public Song ( String name, int length, boolean wasListened ) {
        this.name = name;
        this.length = length;
        this.wasListened = wasListened;
    }

    @Override
    public String toString () {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", wasListened=" + wasListened +
                '}';
    }

    public String getName () {
        return name;
    }

    public int getLength () {
        return length;
    }

    public boolean isWasListened () {
        return wasListened;
    }

    public void setWasListened ( boolean wasListened ) {
        this.wasListened = wasListened;
    }
}
