/*
I certify, that this computer program submitted by me is all of my own work.
Signed: Dylan Theis 5/17/2024

Author: Dylan Theis
Date: Summer 2024
Class: CSC322
Project: Browsing Online Store - MusicCD
Description: subclass MusicCD inherits from item

 */

// musicCD inherits from Item initializing its own variables artists, label, recordCompany, ...
// genres, releaseDate, ad totalLength
class MusicCD extends Item {
    private String artists;
    private String label;
    private String recordCompany;
    private String genres;
    private String releaseDate;
    private int totalLength;

    // constructor
    public MusicCD(String title, double price, String artists, String releaseDate, String label, String recordCompany, int totalLength, String genres) {
        super(title, price);
        this.artists = artists;
        this.releaseDate = releaseDate;
        this.label = label;
        this.recordCompany = recordCompany;
        this.totalLength = totalLength;
        this.genres = genres;
    }
    // setters and getter for artists, releaseDate, label, recordCompany, totalLength, and genres
    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRecordCompany() {
        return recordCompany;
    }

    public void setRecordCompany(String recordCompany) {
        this.recordCompany = recordCompany;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(int totalLength) {
        this.totalLength = totalLength;
    }

    // getType returns music
    @Override
    public String getType() {
        return "music";
    }

}
