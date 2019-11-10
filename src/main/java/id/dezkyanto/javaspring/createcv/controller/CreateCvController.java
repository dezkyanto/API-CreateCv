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
import id.dezkyanto.javaspring.createcv.model.PersonalDataModel;
import id.dezkyanto.javaspring.createcv.service.CreateCvService;

@RestController
// @CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("cv")
public class CreateCvController {

	@Autowired
	private CreateCvService createCvService;

	@PostMapping("insert")
	public String insert(@RequestBody List<PersonalDataModel> personalData) {
		int count = createCvService.insert(personalData);
		return "inserted : " + count;
	}

	@PutMapping("update/{id}")
	public String update(@RequestBody PersonalDataModel personalData, @PathVariable("id") String idPersonalData) {
		int count = createCvService.update(personalData, idPersonalData);
		return "updated : " + count;
	}

	@GetMapping("get-all")
	public PersonalDataModel getall() {
		return createCvService.getall();
	}

	@GetMapping("get-id/{id}")
	public PersonalDataModel getById(@PathVariable("id") String idPersonalData) {
		return createCvService.getById(idPersonalData);
	}

	@DeleteMapping("remove-id/{id}")
	public String removeById(@PathVariable("id") String idPersonalData) {
		int count = createCvService.removeById(idPersonalData);
		return "removed : " + count;
	}

	@DeleteMapping("remove-all")
	public String removeAll() {
		int count = createCvService.removeAll();
		return "removed : " + count;
	}

	@GetMapping("create-table")
	public String createTable() {
		return createCvService.createTable();
	}

}
