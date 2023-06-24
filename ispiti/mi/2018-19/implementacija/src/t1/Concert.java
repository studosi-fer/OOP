package t1;

public class Concert extends Event implements EventPromoter{
    private Band playingband;
    private String[] songList;

    public Concert(String name, String location, String date, Band playingband, String[] songList) {
        super(name, location, date);
        this.playingband = playingband;
        this.songList = songList;
    }

    public void printEventPoster(){
        System.out.println("Event date: " + this.getDate()
                + "\nBand: " + playingband.getBandName() + "\nSong list for this concert is:");
        for (int i = 0; i < songList.length; i++) {
            System.out.println("Song " + (i+1) + ": " + songList[i]);
        }
    }
}
