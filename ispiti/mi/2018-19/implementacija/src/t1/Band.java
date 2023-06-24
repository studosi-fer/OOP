package t1;

import java.util.Arrays;

public class Band {
    private Musician[] bandMembers;
    private String bandName;

    public Band(Musician[] bandMembers, String bandName) {
        this.bandMembers = bandMembers;
        this.bandName = bandName;
    }

    public Musician[] getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(Musician[] bandMembers) {
        this.bandMembers = bandMembers;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        String output = "Members of the band " + bandName + " are: ";

        for (int i = 0; i < bandMembers.length; i++) {
            output += bandMembers[i].getName();

            if (i != bandMembers.length - 1)
                output += ", ";
        }

        return output;
    }
}
