package com.Harman_batch04;

public interface RBI {
    void setInterestRate();

}
class SBI implements RBI{

    public void setInterestRate() {
        System.out.println("7% interest");

    }
}
class ICICI implements RBI{

    public void setInterestRate() {
        System.out.println("7.5% interest");

    }
}
class Bank {
    public static void main(String[] args){
        RBI ob_sbi=new SBI();
        RBI ob_icici=new ICICI();
        System.out.println("SBI Bank");
        ob_sbi.setInterestRate();
        System.out.println("ICICI Bank");
        ob_icici.setInterestRate();



    }
}
