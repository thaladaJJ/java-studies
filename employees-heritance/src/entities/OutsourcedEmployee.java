package entities;
public class OutsourcedEmployee extends Employee {
    protected Double additionalCharge;
    public OutsourcedEmployee () {

    }
    public OutsourcedEmployee (String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment () {
        return super.payment() + 1.1 * additionalCharge;
    }
}