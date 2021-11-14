package by.jonline.epam.task.bean;

import java.util.Objects;

public class Money extends Treasure{
    private MoneyType moneyType;

    public Money(){

    }

    public Money(String name, int cost, MoneyType moneyType){
        super(name, cost);
        this.moneyType = moneyType;
    }

    public MoneyType getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(MoneyType moneyType) {
        this.moneyType = moneyType;
    }

    public static enum MoneyType{
        COIN("Монета"),
        PAPER_MONEY("Бумажные деньги");

        private String value;
        MoneyType(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Money money = (Money) o;
        return moneyType == money.moneyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moneyType);
    }

    @Override
    public String toString() {
        return super.toString() + " Деньги: " +
                "тип денег: " + moneyType.value;
    }
}
