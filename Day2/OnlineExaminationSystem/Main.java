public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question(
            "What is the capital of France?", 
            new String[] {"Paris", "London", "Berlin", "Madrid"}, 
            "Paris"
        ));

        quiz.addQuestion(new Question(
            "Which planet is known as the Red Planet?", 
            new String[] {"Earth", "Mars", "Jupiter", "Venus"}, 
            "Mars"
        ));

        quiz.addQuestion(new Question(
            "Who wrote 'To Kill a Mockingbird'?", 
            new String[] {"Harper Lee", "J.K. Rowling", "Ernest Hemingway", "F. Scott Fitzgerald"}, 
            "Harper Lee"
        ));
        quiz.takeQuiz();
    }
}
