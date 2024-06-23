package recapWithAhmed.OOP;

public class EncapsulationPractice {

    private String name = "David";
    private int age = 31;
    private long creditCard = 12345673;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.startsWith("N")){
            this.name = name;
        }else{
            System.out.println("Wrong Input");
        }
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}
