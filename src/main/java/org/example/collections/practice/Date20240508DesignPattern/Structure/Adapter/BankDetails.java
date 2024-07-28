package org.example.collections.practice.Date20240508DesignPattern.Structure.Adapter;

public class BankDetails {

    long accNumb;
    String accName;
    String BankName;

    public long getAccNumb() {
        return accNumb;
    }

    public void setAccNumb(long accNumb) {
        this.accNumb = accNumb;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }
}
