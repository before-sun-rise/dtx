package ir.mehdi.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 *
 * Creation Date : 2015/04/25
 */

@Entity
@Table(name="EVALUATION")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "SUBSCRIBER_NAME", nullable = false)
    private String subscriberName;

    @Column(name="TITLE_QUESTION")
    private Question titleQuestion;

    @Column(name = "QUESTION_ID")
    private Set<Question> questions;


    public Evaluation(String description, String subscriberName, Question titleQuestion, Set<Question> questions) {
        this.description = description;
        this.subscriberName = subscriberName;
        this.titleQuestion = titleQuestion;
        this.questions = questions;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }
}
