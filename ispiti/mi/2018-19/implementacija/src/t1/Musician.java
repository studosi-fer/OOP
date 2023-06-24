package t1;

public class Musician extends Person{
    private BandPosition bandPosition;
    private Integer skill;

    public Musician(String name, String country, int age, BandPosition bandPosition, Integer skill) {
        super(name, country, age);
        this.bandPosition = bandPosition;
        this.skill = skill;
    }

    public BandPosition getBandPosition() {
        return bandPosition;
    }

    public void setBandPosition(BandPosition bandPosition) {
        this.bandPosition = bandPosition;
    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public void trainForOneYear(){
        this.setAge(this.getAge() + 1);
        this.setSkill(this.getSkill() + 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Musician other = (Musician) obj;
        if (bandPosition != other.bandPosition)
            return false;
        if (skill == null) {
            if (other.skill != null)
                return false;
        } else if (!skill.equals(other.skill))
            return false;
        return true;
    }
}
