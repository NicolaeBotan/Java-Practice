package Practice;

import java.util.ArrayList;

public class PhoneNumberPractice {
    public static ArrayList<String> sendMessage(ArrayList<Integer> phoneNumbers){

        ArrayList<String> message = new ArrayList<>();
        for (int phoneNumber: phoneNumbers){
            message.add("Hi everyone "+phoneNumber);
        }
        return message;
    }

    public static void main(String[] args) {
        ArrayList<Integer> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(224555000);
        phoneNumbers.add(224755020);
        phoneNumbers.add(224565000);
        phoneNumbers.add(224585040);
        System.out.println(sendMessage(phoneNumbers));

    }

}
