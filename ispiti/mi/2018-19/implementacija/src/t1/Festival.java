package t1;

public class Festival extends Event implements EventPromoter{
    private Band[] bandList;

    public Festival(String name, String location, String date, Band[] bandList) {
        super(name, location, date);
        this.bandList = bandList;
    }

    public void printEventPoster(){
        System.out.println("Event date: " + this.getDate()
                + "\nFestival: " + this.getName() + "\nBand list for the festival is:");
        for (int i = 0; i < bandList.length; i++) {
            System.out.println("Band " + (i+1) + ": " + bandList[i].getBandName());
        }
    }
}
