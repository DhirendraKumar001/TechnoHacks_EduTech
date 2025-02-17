import java.util.Scanner;

public class QuizGame{
    private static final int TOTAL_QUESTIONS = 10;
    private static final int TIME_LIMIT_PER_QUESTION = 30; // Time limit per question in seconds

    private static String[] questions = {
        "Who is considered the original developer of the Java programming language?",
        "When was Java first developed?",
        "What is the size of an int variable in Java?",
        "Which of the following is not a Java reserved keyword??",
        "Which of the following data types has the largest range?",
        "Which method is used to start a thread execution?",
        "Which of the following is not a Java features?",                
        "Command to execute compiled java program is",
        "Which method will a web browser call on a new applet?",
        "Which of the following is not mandatory in variable declaration?"
    };

    private static String[][] options = {
        {"A.  Bjarne Stroustrup","B. James Gosling" ,"C. Dennis Ritchie", "D. Guido van Rossum"},
        {"A. 1991","B. 1993","C. 1995", "D. 1997"},
        {"A. 1", "B. 4", "C. 2", "D. 8"},
        {"A. class", "B. interface", "C. extends", "D. implement"},
        {"A. int", "B. float", "C. long", "D. double"},
        {"A. start()", "B. run()", "C. execute()", "D. begin()"},
        {"A. Dynamic", "B. Architecture Neutral", "C. Use of pointers", "D. Object-oriented"},
        {"A. java", "B. javac", "C. run", "D. jawa"},
        {"A. main method", "B. distroy jmethod", "C. execute method", "D. init method"},
        {"A. a data type ", "B. a semi-colon", "C. an assignment", "D. an identifier"}

    };

    private static char[] answers = {'B', 'C', 'B', 'D', 'C', 'A', 'C', 'B', 'D', 'C'};

    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A, B, C, or D): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            if (userAnswer.charAt(0) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i] + ".");
            }

            System.out.println();
        }

        System.out.println("Quiz ended!");
        System.out.println("Your score: " + score + "/" + TOTAL_QUESTIONS);
    }
}


