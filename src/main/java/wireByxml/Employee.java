package wireByxml;

public class Employee {
    private Address address;

    public Employee(Address address) {
        this.address = address;
        System.out.println("Inside Constructor");
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting Value..");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
