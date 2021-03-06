package backend;

/**
 * Represents an audio file.
 */
public class File {

    // Instance variables
    private Track track;
    private String filePath;
    private int fileSize;

    /**
     * Constructor.
     *
     * @param track The audio track.
     * @param filePath The file path.
     */
    public File(Track track, String filePath, int fileSize) {
        this.track = track;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

    /**
     * Returns track.
     *
     * @return Track
     */
    public Track getTrack() {
        return track;
    }

    /**
     * Sets the track.
     *
     * @param track The track..
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * Returns file path.
     *
     * @return File path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets the file path.
     *
     * @param filePath The file path.
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Returns the file size of the file.
     *
     * @return
     */
    public int getFilesize() {
        return fileSize;
    }

    /**
     * Sets the file size of the file.
     *
     * @param filesize
     */
    public void setFilesize(int filesize) {
        this.fileSize = filesize;
    }
}
