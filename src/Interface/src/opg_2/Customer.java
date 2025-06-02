package Interface.src.opg_2;

public class Customer implements Comparable<Customer> {
    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer cus) {
        int compare = this.efternavn.compareTo(cus.efternavn);
        if(compare == 0){
            compare = this.fornavn.compareTo(cus.fornavn);
            if(compare == 0){
                compare = Integer.compare(this.alder,cus.alder);
            }
        }
        return compare;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", alder=" + alder +
                '}';
    }
}
