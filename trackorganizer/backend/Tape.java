package backend;

import backend.PhysicalRelease;
import java.time.Year;

/**
 * Represents a cassette tape.
 */
public class Tape extends PhysicalRelease {

    private static int nextArchiveNumber = 30001;

    // Instance variables
    private String tapeType;

    /**
     * Constructor.
     *
     * @param title The name of the tape
     * @param artistName artist name of the release.
     * @param releaseYear release year of the release.
     * @param recordLabel record label behind the release.
     * @param archiveNR archive number where archive is stored.
     * @param tapeType The type of the tape, digital or analog.
     */
    public Tape(String title, String artistName, Year releaseYear, String recordLabel, int archiveNR, String tapeType) {
        super(title, artistName, releaseYear, recordLabel, archiveNR);
        this.tapeType = tapeType;
    }

    /**
     * Constructor.
     *
     * @param title The name of the tape
     * @param artistName artist name of the release.
     * @param releaseYear release year of the release.
     * @param recordLabel record label behind the release.
     * @param tapeType The type of the tape, digital or analog.
     */
    public Tape(String title, String artistName, Year releaseYear, String recordLabel, String tapeType) {
        this(title, artistName, releaseYear, recordLabel, Tape.nextArchiveNumber++, tapeType);
    }

    /**
     * Returns tape type.
     *
     * @return Tape type.
     */
    public String getTapeType() {
        return tapeType;
    }

    /**
     * Sets the tape type.
     *
     * @param tapeType The tape type.
     */
    public void setTapeType(String tapeType) {
        this.tapeType = tapeType;
    }
}
