package artistry.controllers;

import artistry.models.Portfolio;
import artistry.repositories.PortfolioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Configuration
@RestController
@Description("Controller to manage portfolios")
@RequestMapping("/portfolio")
public class PortfolioRestController {

static final Logger log = LoggerFactory.getLogger(PortfolioRestController.class);
	
	@Autowired
	private PortfolioRepository portRepo;
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Portfolio> getAll() {
		return portRepo.findAll();
	}
	
	@RequestMapping(value = "/getbyname/{name}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Portfolio> getAllByName(@PathVariable("name") String name) {
		return portRepo.findByPortfolioName(name);
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Portfolio> getById(@PathVariable("id") Long id) {
		return portRepo.findById(id);
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
		return portRepo.save(portfolio);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Portfolio updatePortfolio(@RequestBody Portfolio portfolio) {
		return portRepo.save(portfolio);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deletePortfolio(@PathVariable("id") Long id) {
		Optional<Portfolio> portfolio = portRepo.findById(id);
		portfolio.ifPresent(portfolio1 -> portRepo.delete(portfolio1));
	}
}
