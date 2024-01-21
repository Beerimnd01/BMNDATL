package src.oops20jan2024;

public class Bank {


    private String currency;
    private Integer money;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
    public Bank(String currency, Integer money) {
        this.currency = currency;
        this.money = money;
    }
    public Integer add(Bank bankname) throws CustomException {
        if (!(bankname.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR not supported!");
//            throw new ArithmeticException("Arthi");
        }
        Integer sum = this.money + bankname.money;
        return sum;
    }

}
