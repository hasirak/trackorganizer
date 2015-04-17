package backend;

import java.time.Year;
import java.util.ArrayList;

/**
 * Represents a track organizer.
 */
public class TrackOrganizer {

    // Instance variables
    private String name;
    private ArrayList<Media> medias;

    /**
     * Constructor.
     *
     * @param name Name of track organizer.
     */
    public TrackOrganizer(String name) {
        this.name = name;
        medias = new ArrayList<Media>();
    }
    
    
    
    /**
     * Find media based on the predicate
     * @param pred The predicate for the search
     * @return An array with the matching media.
     */
    public ArrayList<Media> findMedia(Predicate pred) {
        
        ArrayList<Media> results = new ArrayList<>();
        for (Media media : medias) {        
            if (pred.isMatch(media)){
                results.add(media);
            }
        } 
        return results;
    }
    
    /**
     * Find tracks based on the predicate
     * @param pred The predicate for the search
     * @return An array with the matching tracks.
     */
    public ArrayList<Track> findTracks(Predicate pred) {
        
        ArrayList<Track> results = new ArrayList<>();
        for (Media media : medias) {
            for(Track track: media.getTracks()){            
                if (pred.isMatch(track)){
                    results.add(track);
                }
            }
        } 
        return results;
    }


    /**
     * Searches through entire collection. Returns the first Media with the
     * matching name.
     *
     * @param searchName Searchword.
     * @return The media with the corresponding name.
     */
    public Media findFirstName(String searchName) {
        String name = null;
        Media searchHit = null;
        for (Media media : medias) {
            name = media.getName();
            if (name.equals(searchName)) {
                searchHit = media;
            }
        }
        return searchHit;
    }

    /**
     * Searches through entire collection. Returns an array with the matching
     * media.
     *
     * @param searchName Searchword.
     * @return Array with the matching results.
     */
    public ArrayList<Media> findAll(String searchName) {
        String name = null;
        ArrayList<Media> searchHits = null;
        Media searchHit = null;
        for (Media media : medias) {
            name = media.getName();
            if (name.equals(searchName)) {
                searchHits.add(media);
            }
        }
        return searchHits;
    }
    
    
     /**
     * Searches through entire collection by the archive number.
     *
     * @param archiveNr The archive number
     * @return The matching track or null if no track is found.
     */
    public PhysicalRelease findMediaByArchiveNumber(int archiveNr) {

        for (Media media : medias) {
            
            if(media instanceof PhysicalRelease){
                PhysicalRelease rel = (PhysicalRelease)media;
                if(rel.getArchiveNR() == archiveNr)   
                    return rel;
            }
        }
        return null;
    }
    

    /**
     * Adds a CD to the media collection.
     *
     * @param name Album title
     */
    public void addCD(String name, String artist, Year year, String label) {
        addMedia(new CD(name, artist, year, label));
    }

    /**
     * Adds a LP to the media collection.
     *
     * @param name Album title
     * @param format Format of the LP
     */
    public void addLP(String name, String format) {
        //addMedia(new LP(name, format));
    }

    /**
     * Adds a tape cassette to the media collection.
     *
     * @param name Name of the cassette.
     * @param format Digital or analog.
     */
    public void addTape(String name, String format) {
        //addMedia(new Tape(name, format));
    }

    /**
     * Adds a hard drive to the media collection.
     *
     * @param name Name of the hard drive.
     * @param format Digital or analog.
     */
    public void addTape(String name) {
        addMedia(new HD(name));
    }
    
     /**
     * Adds a media to the media collection.
     *
     * @param media The media to add
     */
    public void addMedia(Media media)
    {
        medias.add(media);
    }
    
}
