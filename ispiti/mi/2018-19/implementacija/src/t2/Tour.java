package t2;

import java.time.LocalDate;

public class Tour {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Tour(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void addConcert(Concert concert){

    }
}
