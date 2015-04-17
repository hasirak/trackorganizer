
package gui;

import backend.MusicTrack;
import backend.SearchTracks;
import backend.Track;
import backend.TrackOrganizer;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class MediaModel extends AbstractTableModel {
    
    private String[] columnNames = {"Title", "Artist"};
   
    TrackOrganizer trackOrganizer;
    
    ArrayList<Track> filteredTracks = new ArrayList<>();
    
    public MediaModel(TrackOrganizer trackOrganizer){
        this.trackOrganizer = trackOrganizer;
    }

    public void setFilter(String filter){
        
        filteredTracks = trackOrganizer.findTracks(new SearchTracks.ByTitle(filter).contains());
        this.fireTableDataChanged();
        
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        if(filteredTracks.size() > 0){
            return filteredTracks.size();
        }
        return trackOrganizer.getTrackCount();
    }
    

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        
        Track track;
        
        if(filteredTracks.size() > 0){
            track = filteredTracks.get(row);
        }else{
            track = trackOrganizer.getTrackAt(row);

        }
        
        switch(col){
            case 0:
                return track.getTitle();
            case 1:
                if(track instanceof MusicTrack){
                    return ((MusicTrack)track).getArtist();
                }
                return "";

        }
        return "UNKNOWN";
    }
    
}
