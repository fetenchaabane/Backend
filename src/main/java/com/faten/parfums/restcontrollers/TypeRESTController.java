package com.faten.parfums.restcontrollers;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.faten.parfums.entities.Type;
import com.faten.parfums.repos.TypeRepository;

@RestController
@RequestMapping("/api/typ")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeRESTController {
	
	@Autowired
	TypeRepository typeRepository;
	
	@GetMapping
	public List<Type> getAlltypes()
	{
	return typeRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Type getTypeById(@PathVariable("id") Long id) {
	return typeRepository.findById(id).get();
	}
	
	  @PostMapping
	    public Type createType(@RequestBody Type type) {
	        return typeRepository.save(type);
	    }


}
