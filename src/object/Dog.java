package object;

public class Dog {

    //instance variables belong/define the object
    static String name;
    int age;
    String breed = "husky"; //initializing a variable by giving the value at the beginning
    static int food = 20; //when the variable is "STATIC" it means that belong to the class, so it will affect
                          // every time the "food" variable is used.
    public void play(){
        System.out.println("Dog is playing");
        food -=1;
    }
    public String speak(int numberOfWords){
        System.out.println("The Dog is speaking " +numberOfWords + " words.");
        setAge(numberOfWords); //is going to be the same number as numberOfWords
        return "Here are the words " + numberOfWords;//break also works as a break statement.
    }
    public void feed(String foodType, int foodAmount){
        //if the food type x cost for each pound is .50 cents
        //if the food type is y cost for each pound is .10 cents
        if (foodType.equalsIgnoreCase("x")){
            double number = .50 * foodAmount;
        }else{
            double number = .10 * foodAmount;
        }
        System.out.println("Dog is getting food");
    }
    public void setAge(int age1){ //you can initialize an instance variable in the method by using a
        age = age1;               //a parameter as a value
    }
    public static void bath(){
        System.out.println("Getting clean"); //this is a static method
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Sharik";
        System.out.println(dog1.breed);//return is "husky"
        System.out.println(dog1.age);//0,because we did not put any value

        dog1.setAge(1);
        System.out.println(dog1.age);//1

        Dog dog2 = new Dog();
        System.out.println(dog2.age);//0, because is a new dog2

        String str = dog2.speak(7);//because in the method this returns a String, we can store it
        System.out.println(dog2.age);// 7 because we called a method inside another method and age became 7

        System.out.println(str);//return is "Here are the words 7"

        //Dog is playing, food amount decreases

        System.out.println(dog1.food);//20 food
        dog1.play();
        dog1.play();
        System.out.println(dog1.food);//18 food

        System.out.println(dog2.food);//18
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        System.out.println(dog2.food);//13

    // Let's make the String name Static as well
        System.out.println("Dog1 name is --> " + dog1.name);//Sharik, because we made it static so it stays
        System.out.println("Dog2 name is --> " + dog2.name);//Sharik

        dog2.name = "King";
        System.out.println("Dog1 name is --> " + dog1.name);//King, because it changes for all
        System.out.println("Dog2 name is --> " + dog2.name);//King

        bath();//the print is "Getting clean"
        // the static method when it's called in another static method , it doesn't need the object
        //it will come by itself.


















    }
}
