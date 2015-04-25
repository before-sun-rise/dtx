package ir.mehdi.model;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 *
 * Creation Date : 2015/04/25
 */
public class Evaluation {

    private String description;
    private String subscriberName;
    private Question titleQuestion;
    private Question question;


    public Evaluation(String description, String subscriberName, Question titleQuestion, Question question) {
        this.description = description;
        this.subscriberName = subscriberName;
        this.titleQuestion = titleQuestion;
        this.question = question;
    }

    public Evaluation() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Question getTitleQuestion() {
        return titleQuestion;
    }

    public void setTitleQuestion(Question titleQuestion) {
        this.titleQuestion = titleQuestion;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }
}
