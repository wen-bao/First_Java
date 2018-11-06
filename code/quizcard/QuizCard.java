import java.io.*;

public class QuizCard implements Serializable {
    String question;
    String answer;

    public QuizCard(String que, String ans) {
        question = que;
        answer = ans;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}