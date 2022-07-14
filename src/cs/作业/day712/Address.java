package cs.作业.day712;

public  class Address {
     String address;
    String zipCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address(){

    }
    public Address(String address, String zipCode) {
        this.address = address;
        this.zipCode = zipCode;
    }

}
