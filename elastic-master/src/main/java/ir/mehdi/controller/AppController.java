package ir.mehdi.controller;

import java.util.List;

import javax.validation.Valid;

import ir.mehdi.model.Employee;
import ir.mehdi.model.Evaluation;
import ir.mehdi.model.Login;
import ir.mehdi.service.EmployeeService;
import ir.mehdi.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Mehdi Afsari kashi
 * @version 1.0.0
 * @since 1.0.0
 * <p/>
 * Creation Date : 2015/04/20
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    EmployeeService service;

    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {

        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("employees", employees);
        return "allemployees";
    }

    /*
     * This method will provide the medium to add a new employee.
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "registration";
    }

    /*
     * This method will be called on form submission, handling POST request for
     * saving employee in database. It also validates the user input
     */
    @RequestMapping(value = { "/new" }, method = RequestMethod.POST)
    public String saveEmployee(@Valid Employee employee, BindingResult result,
                               ModelMap model) {

        if (result.hasErrors()) {
            return "registration";
        }

        service.saveEmployee(employee);

        model.addAttribute("success", "Employee " + employee.getName()
                + " registered successfully");
        return "success";
    }

    /*
     * This method will delete an employee by it's SSN value.
     */
    @RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
    public String deleteEmployee(@PathVariable String ssn) {
        service.deleteEmployeeBySsn(ssn);
        return "redirect:/list";
    }




    @RequestMapping(value="login", method = RequestMethod.GET)
    public String loginView(ModelMap model){
        Login login = new Login();
        model.addAttribute("login", login);
        return "login";

    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String loginCredential(@Valid Login login, BindingResult result,ModelMap model){

        System.out.println("");
        if(result.hasErrors()){

        }
        return "";
    }


}