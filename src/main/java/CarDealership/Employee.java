package CarDealership;

public class Employee {

    public void handle(Customer customer, Car car, boolean finance) {
        if(customer.getCash() >= car.getPrice()) {
            proceedOperation(customer, car);
        } else {
            if(finance) {
                runCreditHistory(customer, car, customer.getCash() - car.getPrice());
            } else {
                decline(customer, car);
            }
        }
    }

    private void decline(Customer customer, Car car) {
        Dealership.log.error("Customer " + customer + " can't afford " + car + ". Get some cake man!");
    }

    private void runCreditHistory(Customer customer, Car car, double loan) {
        Dealership.log.info("Customer " + customer + " purchased " + car + " by taking a loan of " + loan + "$");
    }

    private void proceedOperation(Customer customer, Car car) {
        Dealership.log.info("Nice purchase " + customer + ", enjoy riding your " + car);
    }
}
