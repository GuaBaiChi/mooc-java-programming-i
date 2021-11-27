
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        this.day = this.day + 1;

        if (this.day > 30) {
            this.day = 1;
            this.month = this.month + 1;
            if (this.month > 12) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }
    }

    public void advance(int howManyDays) {
        int thisManyDays = howManyDays;

        for (int i = 1; thisManyDays >= i; i++) {
            advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.day = this.day;
        newDate.month = this.month;
        newDate.year = this.year;
        newDate.advance(days);
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
