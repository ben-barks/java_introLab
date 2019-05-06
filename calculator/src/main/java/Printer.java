import static java.lang.Integer.min;

public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public String print(int pages, int copies){
        if (pages < 0 || copies < 0 ){
            return "Error!";
        }
        else {
            if (pages * copies <= min(this.paper, this.toner)) {
                int sheets = pages * copies;
                this.paper -= sheets;
                this.toner -= sheets;
                return "Pages printed.";
            }
            else {
                return "Refill required!";
            }
        }
    }

    public void refillPaper() {
        this.paper = 200;
    }

    public void refillToner() {
        this.toner = 200;
    }
}
