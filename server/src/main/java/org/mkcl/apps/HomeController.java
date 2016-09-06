package org.mkcl.apps;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity<String> home(Locale locale, Model model) {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(
				"Hello World", HttpStatus.OK);
		return responseEntity;
	}

}
