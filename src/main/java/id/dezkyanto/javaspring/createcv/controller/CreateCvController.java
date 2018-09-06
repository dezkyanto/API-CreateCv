package id.dezkyanto.javaspring.createcv.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import id.dezkyanto.javaspring.createcv.model.PersonalData;
import id.dezkyanto.javaspring.createcv.service.CreateCvService;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("cv")
public class CreateCvController {

	@Autowired
	private CreateCvService createCvService;

	@PostMapping("insert")
	public int insert(@RequestBody List<PersonalData> personalData) {
		return createCvService.insert(personalData);
	}

	@PutMapping("update/{id}")
	public int update(@RequestBody PersonalData personalData, @PathVariable("id") String idPersonalData) {
		return createCvService.update(personalData, idPersonalData);
	}

	@GetMapping("get-all")
	public PersonalData getall() {
		return createCvService.getall();
	}

	@GetMapping("get-id/{id}")
	public PersonalData getById(@PathVariable("id") String idPersonalData) {
		return createCvService.getById(idPersonalData);
	}

	@DeleteMapping("remove-id/{id}")
	public int removeById(@PathVariable("id") String idPersonalData) {
		return createCvService.removeById(idPersonalData);
	}

	@DeleteMapping("remove-all")
	public int removeAll() {
		return createCvService.removeAll();
	}

}
