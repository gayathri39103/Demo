package spring_mvc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	private final DAO dao;
	@Autowired
	public AppController(DAO dao) {
        this.dao = dao;
    }
	
	@GetMapping("/students")
	public String listStudents(Model m) {
		List<Student> sl =dao.getAllStudents();
		m.addAttribute("students", sl);
		return "index";
	}
	
	
	
}