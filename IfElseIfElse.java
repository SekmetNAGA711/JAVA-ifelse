public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "rainy";

        if(weather.equals("sunny")){
            System.out.println("It's a nice day for a walk");
        } else if(weather.equals("rainy")) {
             System.out.println("Bring an umbrella!");
        } else{
            System.out.println("Not Sure what to do with this weather");
        }

        // sunny: System.out.println("It's a nice day for a walk.");
        // rainy: System.out.println("Bring an umbrella!");
        // otherwise: System.out.println("Not sure what to do in this weather.");

        int score = 85;
          if(score >= 80){
            System.out.println("You got an A!");
        } else if(score >= 70) {
             System.out.println("You got an B!");
        } else if (score >= 60){
            System.out.println("You got an C");
        } else if(score >= 50){
            System.out.println("You got an D");

        } else {
            System.out.println("you failed");
        }
        // 80 and above: System.out.println("You got an A!");
        // 70 and above: System.out.println("You got a B!");
        // 60 and above: System.out.println("You got a C.");
        // 50 and above: System.out.println("You got a D.");
        // Otherwise: System.out.println("You failed :(");

        String jobTitle = "manager";

         if(jobTitle.equals("manager")){
            System.out.println("You're the boss!");
        } else if(jobTitle.equals("Team Lead")) {
             System.out.println("You're in charge of a team.");
        } else {
            System.out.println("You're an employee.");
        } 
        // CEO: System.out.println("You're the boss!");
        // manager: System.out.println("You're in charge of a team.");
        // Otherwise: System.out.println("You're an employee.");

        
    }
}