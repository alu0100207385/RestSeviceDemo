package controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String login(){
		return "login";
	}

}
