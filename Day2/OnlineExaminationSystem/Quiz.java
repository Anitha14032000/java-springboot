import java.util.*;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }
    public void addQuestion(Question question) {
        questions.add(question);
    }
   public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        score = 0;

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();

            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.isAnswerCorrect(userAnswer)) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer() + "\n");
            }
        }
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}
