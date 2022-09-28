public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 5);
        debbie.greeting("Jonathan");

        debbie.weather();
        debbie.favoriteNumber(10);

        System.out.println("Your total is: " + debbie.addNumbers(15, 20, 30));
        double heightInMeters = debbie.convertFeetToMeters(5);
        System.out.println("You're height in meters is " + heightInMeters + " m");
        System.out.print(debbie.goodbye());
    }
}
