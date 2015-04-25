package ir.mehdi.controller;

import ir.mehdi.model.Evaluation;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static ir.mehdi.controller.NavigationURL.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/25
 */
@RequestMapping(value = "/evaluation")
public class EvaluationAdmin {



    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addEvaluationView(ModelMap model){
        Evaluation evaluation = new Evaluation();
        model.addAttribute("employee", evaluation);

        return ADD_PAGE.url();

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addEvaluation(@Valid Evaluation evaluation, BindingResult result,ModelMap model){

        if(result.hasErrors()){

        }

        return LIST_PAGE.url();
    }


    @RequestMapping(value="/update/{evaluationId}", method = RequestMethod.GET)
    public String updateEvaluationView(@PathVariable long evaluationId, ModelMap model){
        Evaluation evaluation = null;// get the current Evaluation from Database
        //Add the evaluation to scope
        model.addAttribute("employee", evaluation);
        //redirect to updatePage
        return UPDATE_PAGE.url();

    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateEvaluationAction(@Valid Evaluation evaluation, BindingResult result, ModelMap model){

        if(result.hasErrors()){

        }

        //TODO update the evaluation using existing DAO
        return LIST_PAGE.url();
    }


    @RequestMapping(value = "/delete/{evaluationId}")
    public String deleteEvaluationAction(@PathVariable long evaluationId, BindingResult result, ModelMap model){

        //TODO delete the evaluation from the database using its ID
        return LIST_PAGE.url();
    }


    @RequestMapping(value = "/evaluations")
    public String evaluationsView(ModelMap model){

        //TODO get the complete Evaluation List From Database
        List<Evaluation> evaluations = null;
        model.addAttribute("evaluations", evaluations);

        return LIST_PAGE.toString();
    }
}
