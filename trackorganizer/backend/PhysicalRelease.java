package backend;

import java.util.ArrayList;

/**
 * Represents physical releases like CD's and vinyl LP's.
 *
 * @author Kristian Honningsvag
 * @version 0.1
 */
public class PhysicalRelease extends Media {

    // Instance variables
    private String artistName;
    private int releaseYear;
    private String recordLabel;
    private int totalDuration;
    private ArrayList<Track> tracks;
    private int archiveNR;

    /**
     * Constructor.
     *
     * @param name Name of the physical release.
     */
    public PhysicalRelease(String name) {
        super(name);
        tracks = new ArrayList<Track>();
    }

    //Getters
    /**
     * Returns the artist name of the release.
     *
     * @return artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Returns the release year of the release.
     *
     * @return releaseYear
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * Returns the record label of the release.
     *
     * @return recordLabel
     */
    public String getRecordLabel() {
        return recordLabel;
    }

    /**
     * Returns the total duration of the release.
     *
     * @return totalDuration
     */
    public int getTotalDuration() {
        return totalDuration;
    }

    /**
     * Returns the tracks contained in the release.
     *
     * @return tracks
     */
    public ArrayList<Track> getTracks() {
        return tracks;
    }

    /**
     * Returns the archive number the release is stored under.
     *
     * @return archiveNR
     */
    public int getArchiveNR() {
        return archiveNR;
    }

    //Setters
    /**
     * Sets the name of the artist who made the release.
     *
     * @param artistName
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * Sets the release year of the release.
     *
     * @param releaseYear
     */
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * Sets the record label of the release.
     *
     * @param recordLabel
     */
    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    /**
     * Sets the total duration of the release.
     *
     * @param totalDuration
     */
    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    /**
     * Sets the tracks of the release.
     *
     * @param tracks
     */
    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * Sets the archive number the release is stored under.
     *
     * @param archiveNR
     */
    public void setArchiveNR(int archiveNR) {
        this.archiveNR = archiveNR;
    }

}
