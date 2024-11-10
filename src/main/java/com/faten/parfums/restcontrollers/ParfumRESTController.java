package com.faten.parfums.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.faten.parfums.entities.Parfum;
import com.faten.parfums.service.ParfumService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ParfumRESTController {

    @Autowired
    private ParfumService parfumService;

    @GetMapping("all")
    public List<Parfum> getAllParfums() {
        return parfumService.getAllParfums();
    }
    
    @GetMapping("/getbyid/{id}")
    public Parfum getParfumById(@PathVariable("id") Long id) {
    return parfumService.getParfum(id);
     }
    
    @PostMapping("/addpars")
    public Parfum createParfum(@RequestBody Parfum parfum) {
    return parfumService.saveParfum(parfum);
    }
    
    
    @PutMapping("/updatepars")
    public Parfum updateParfum(@RequestBody Parfum parfum) {
        return parfumService.updateParfum(parfum);
    }


    
    @DeleteMapping("/delpars/{id}")
    public void deleteParfum(@PathVariable("id") Long id)
    {
    parfumService.deleteParfumById(id);
    }

    
    @GetMapping("/parstyp/{idTyp}")
    public List<Parfum> getParfumsByTypId(@PathVariable("idTyp") Long idTyp) {
    return parfumService.findByTypeIdTyp(idTyp);
    }
    
    
    
    
    
    
    
}

    

   

    

