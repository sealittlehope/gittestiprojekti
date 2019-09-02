package hh.swd20.gittesti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	// http://localhost:8080/...
	@RequestMapping("*")
	public String getHello() {
		return "Hello world!";
	}
}
