package com.faten.parfums;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import com.faten.parfums.entities.Parfum;
import com.faten.parfums.entities.Type;
import com.faten.parfums.repos.ParfumRepository;

@SpringBootTest
class Parfums1ApplicationTests {
	@Autowired
	private ParfumRepository parfumRepository;
	
	@Test
	public void testCreateParfum() {
		Parfum pars = new Parfum("Yves Saint Laurent Mon Paris",3000.500,new Date());
		parfumRepository.save(pars);

}
	@Test
	public void testFindParfum()
	{
	Parfum p = parfumRepository.findById(1L).get(); 
	System.out.println(p);
	}
	
	@Test
	public void testUpdateParfum()
	{
	Parfum p = parfumRepository.findById(1L).get();
	p.setPrixParfum(3000.0);
	parfumRepository.save(p);
	}
	
	@Test
	public void testDeleteParfum()
	{
	parfumRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousParfums()
	{
	List<Parfum> pars = parfumRepository.findAll();
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testFindByNomParfum()
	{
	List<Parfum> pars = parfumRepository.findByNomParfum("Dior j'adore");
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	
	}
	@Test
	public void findByNomParfumContains(){
		
	List<Parfum> pars=parfumRepository.findByNomParfumContains("Dior j'adore");
	for (Parfum p : pars)
	{
	System.out.println(p);
	} }

	
	@Test
	public void testfindByNomPrix()
	{
	List<Parfum> pars = parfumRepository.findByNomPrix("Dior j'adore", 1000.0);
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByType()
	{
	Type typ = new Type();
	typ.setIdTyp(1L);
	List<Parfum> pars = parfumRepository.findByType(typ);
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void findByTypeIdTyp()
	{
	List<Parfum> pars = parfumRepository.findByTypeIdTyp(1L);
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	 }
	
	
	@Test
	public void testfindByOrderByNomParfumAsc()
	{
	List<Parfum> pars = 
	parfumRepository.findByOrderByNomParfumAsc();
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	}
	
	
	@Test
	public void testTrierParfumsNomsPrix()
	{
	List<Parfum> pars = parfumRepository.trierParfumsNomsPrix();
	for (Parfum p : pars)
	{
	System.out.println(p);
	}
	}

	
	
	

	
	
	
	
}

