package com.zzar.cloud.demo.springclouddemo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.jaxb.Employee;

import io.swagger.annotations.ApiOperation;

@Controller
public class EmployeeSOAPController {
	@ApiOperation(value = "employee object in xml format", response = Iterable.class)
	 @GetMapping("/employee")
	    public @ResponseBody Employee getEmployee() {
		 Employee emp = new Employee(1,"razz",88888);
			/*try {
				JAXBContext jc = JAXBContext.newInstance(Employee.class);
				Marshaller marshaller = jc.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			    marshaller.marshal(emp, System.out);
			    return emp;
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			return emp;
	    }

}
