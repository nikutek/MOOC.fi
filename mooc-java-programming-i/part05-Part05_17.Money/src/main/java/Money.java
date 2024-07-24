
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros(), this.cents + addition.cents());
    }

    public boolean lessThan(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if (this.euros() > compared.euros()) {
            return false;
        }
        if (this.cents() < compared.cents()) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
//        10.50 - 5.00
        if (this.euros() >= decreaser.euros() && this.cents() >= decreaser.cents) {

            return new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents());
        }
//        5.00 - 10.00 OR 5.00 - 5.50 RETURN 0
        if (decreaser.euros() > this.euros() || (this.euros() == decreaser.euros() && this.euros() < decreaser.euros())) {
            return new Money(0, 0);
        }
//        10.20 - 5.50
        if (this.euros() > decreaser.euros() && this.cents() < decreaser.cents()) {
            int eur = this.euros() - decreaser.euros() - 1;
            int cent = 100 - decreaser.cents() + this.cents();
            
            return new Money(eur,cent);
        }

        return new Money(0, 0);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
