package t1;

public class Manager extends Person{
    private Band managingBand;

    public Manager(String name, String country, int age, Band managingBand) {
        super(name, country, age);
        this.managingBand = managingBand;
    }


    public void kickBandMember(Musician musician){
        Musician[] musicians = new Musician[managingBand.getBandMembers().length - 1];

        for (int i = 0; i < managingBand.getBandMembers().length; i++) {
            if (!musician.getName().equals(managingBand.getBandMembers()[i].getName())){
                musicians[i] = managingBand.getBandMembers()[i];
            }
        }

        managingBand.setBandMembers(musicians);

    }


    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "managingBand=" + managingBand +
                '}';
    }
}
