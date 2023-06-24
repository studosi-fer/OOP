package t3;

public class BoxOfRecords<T extends Record> extends BoxOfMemorabilia <T>{

    public int totalDuration(){
        int sum = 0;
        for (Record r: this.getItems()) {
            sum += r.getDuration();
        }
        return sum;
    }
}
