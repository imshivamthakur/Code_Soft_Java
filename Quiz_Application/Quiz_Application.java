import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz_Application {
    public static void main(String[] args) {
        String[] questions = {
            "Which of the following is an immediate subclass of the Panel class?",
            "Which of the following is a valid long literal?",
            "Which of the following is not a Java features?",
            "Which one is used to find and fix bugs in the Java programs?",
            "Which of the following is a reserved keyword in Java?"


        };

        String[][] options = {
            {"Applet class","Window class","Frame class","Dialog class"},
            {"ABH8097","L990023","904423","0xnf029"},
            {"Dynamic","Architecture Neutral","Use of pointers","Object-oriented"},
            {"JVM","JRE","JDK","JDB"},
            {"object","strictfp","main","system"}
        };

        String[] answers = {
            "Applet class",
            "0xnf029",
            "Use of pointers",
            "JDB",
            "strictfp"
        };

        final int[] scoreArray = {0}; // use an array to make it effectively final
        final String[] questionsArray = questions; // use a final reference to the questions array
        final String[][] optionsArray = options; // use a final reference to the options array
        final String[] answersArray = answers; // use a final reference to the answers array

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionsArray.length; i++) {
            final int questionIndex = i;

            Timer timer = new Timer();

            System.out.println("Question " + (i + 1) + ": " + questionsArray[i]);
            for (int j = 0; j < optionsArray[i].length; j++) {
                System.out.println((j + 1) + ". " + optionsArray[i][j]);
            }

            TimerTask task = new TimerTask() {
                int time = 20; // 30 seconds

                @Override
                public void run() {
                    System.out.print("\rTime remaining: " + time + " seconds");
                    time--;
                    if (time <= 0) {
                        System.out.println("\nTime's up! The answer is " + answersArray[questionIndex]);
                        System.out.println("Your final score is " + scoreArray[0] + " out of " + questionsArray.length);
                        System.exit(0);
                    }
                }
            };

            timer.scheduleAtFixedRate(task, 1000, 1000); // 1 second interval

            System.out.print("Enter your answer (1-" + optionsArray[i].length + "): ");
            int userAnswerIndex = scanner.nextInt();

            if (optionsArray[i][userAnswerIndex - 1].equalsIgnoreCase(answersArray[i])) {
                scoreArray[0]++; // increment the score array
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + answersArray[i]);
            }

            timer.cancel();

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Your final score is " + scoreArray[0] + " out of " + questionsArray.length);
    }
}
