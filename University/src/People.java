public abstract class People {
    private String name;
    private String surname;
    private int age;
    private Address address;
    protected People (String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getname() {
        return name;
    }
    public String getsurname() {
        return surname;
    }
    public int getage() {
        return age;
    }
    public Address getaddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
