package id.dezkyanto.javaspring.createcv.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import id.dezkyanto.javaspring.createcv.model.PersonalData;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("cv")
public class CreateCvController {

	@PostMapping("insert")
	public int insert(@RequestBody PersonalData personalData) {

		return 0;
	}

	@PostMapping("update")
	public int update(@RequestBody PersonalData personalData) {

		return 0;
	}

	@PostMapping("getall")
	public PersonalData getall(@RequestBody PersonalData personalData) {

		return null;
	}

	@PostMapping("getid")
	public PersonalData getById(@RequestBody PersonalData personalData) {

		return null;
	}

	@PostMapping("removeid")
	public int removeById(@RequestBody PersonalData personalData) {

		return 0;
	}

	@PostMapping("removeall")
	public String removeAll(@RequestBody PersonalData personalData) {

		return "";
	}

}
