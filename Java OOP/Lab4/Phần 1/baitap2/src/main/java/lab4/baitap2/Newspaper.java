package lab4.baitap2;

public class Newspaper extends Document {

    private int dayIssue;

    public Newspaper() {
    }

    public Newspaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Newspaper{"
                + "dayIssue=" + dayIssue
                + ", id='" + id + '\''
                + ", nxb='" + nxb + '\''
                + ", number='" + number + '\''
                + '}';
    }

}
