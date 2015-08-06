package com.spt.workshop.web;
import com.spt.workshop.domain.Employee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employees")
@Controller
@RooWebScaffold(path = "employees", formBackingObject = Employee.class)
public class EmployeeController {
}
