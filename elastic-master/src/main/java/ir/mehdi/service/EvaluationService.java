package ir.mehdi.service;

import ir.mehdi.model.Employee;
import ir.mehdi.model.Evaluation;

import java.util.List;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 *
 * Creation Date : 2015/04/25
 */
public interface EvaluationService {

    void saveEvaluation(Evaluation evaluation);
    void deleteEvaluationById(Long id);
    void editEvaluation(Evaluation evaluation);
    List<Evaluation> findAllEvaluation();
    Evaluation findEvaluationById(Long id);
}
