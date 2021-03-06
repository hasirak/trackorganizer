/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tui;

import backend.Media;
import backend.SampleData;
import backend.SearchMedia;
import backend.Track;
import backend.TrackOrganizer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tor-martin
 */
public class CommandWords {

    private ArrayList<String> tasks;
    private ArrayList<String> mediaTypes;
    private ArrayList<String> trackTypes;

    private TrackOrganizer to;
    private SampleData sd;
    private ArrayList<Media> tracks;
    private Track track;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords() {
        tasks = new ArrayList<String>();
        addTasks();
        mediaTypes = new ArrayList<String>();
        addMediaTypes();
        trackTypes = new ArrayList<String>();
        addTrackTypes();

        to = new TrackOrganizer("Test");

        sd = new SampleData();
        sd.fillMedia(to);

        tracks = new ArrayList<Media>();
        tracks = to.getMediaList();

    }

    public int mediaStage1(String action) {
        System.out.println("Select the type of media to " + action);
        return printInfo(mediaTypes);
    }

    public int mediaStage2(String action) {
        System.out.println("Select the type of track to " + action);
        return printInfo(trackTypes);
    }

    public void removeMedia() {

    }

    public void changeMedia() {

    }

    public void searchMedia(String search) {
       ArrayList<Media> searchResult = to.findMedia(new SearchMedia.ByArtist(search));
        listMedia(searchResult);
    }

    public void listContent() {
        listMedia(to.getMediaList());
    }
    
    private void listMedia(ArrayList<Media> mediaList){
        
        for(Media media: mediaList){
            int counter = 1;
            System.out.println(media.getDescriptionString());
            for(Track aTrack: media.getTracks()){
                System.out.println("   " + counter + ". " + aTrack.getDescriptionString());
                counter++;
            }
        }
    }

    public void help() {
        System.out.println("Type number to execute corresponding task");
        printInfo(tasks);
    }

    public boolean quit() {
        System.out.println("--- Exiting archive ---");
        return true;
    }

    public int getNumberOfTasks() {
        return tasks.size();
    }

    private void addTasks() {
        tasks.add("   1. Add Media");
        tasks.add("   2. Remove Media");
        tasks.add("   3. Change Media");
        tasks.add("   4. Search Media");
        tasks.add("   5. List Content");
        tasks.add("   6. Help");
        tasks.add("   7. Quit");
    }

    private void addMediaTypes() {
        mediaTypes.add("   1. HD");
        mediaTypes.add("   2. CD");
        mediaTypes.add("   3. LP");
        mediaTypes.add("   4. Tape");
    }

    private void addTrackTypes() {
        trackTypes.add("   1. Music");
        trackTypes.add("   2. SFX");
        trackTypes.add("   3. News");
        trackTypes.add("   4. Advertisement");
    }

    private int printInfo(ArrayList<String> arrayStrings) {
        for (String arrayString : arrayStrings) {
            System.out.println(arrayString);
        }
        System.out.print("> ");
        return arrayStrings.size();
    }

    public String typeSelected(int number, String res1, String res2, String res3, String res4) {
        String result = "";
        if (number == 1) {
            result = res1;
        } else if (number == 2) {
            result = res2;
        } else if (number == 3) {
            result = res3;
        } else if (number == 4) {
            result = res4;
        }
        return result;
    }
    
    public void addToTrackOrganizer(Media itemToAdd){
        to.addMedia(itemToAdd);
    }
}
