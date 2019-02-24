package artistry.controllers;

import artistry.models.StrategicTheme;
import artistry.repositories.StrategicThemeRepository;
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
@Description("Controller to manage Strategic themes")
@RequestMapping("/theme")
public class StrategicThemeRestController {
	
	static final Logger log = LoggerFactory.getLogger(StrategicThemeRestController.class);
	
	@Autowired
	private StrategicThemeRepository themeRepo;
	
	/**
	 * Strategic themes
	 */
	@RequestMapping(value = "/newtheme", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private StrategicTheme createTheme(@RequestBody StrategicTheme theme) {
		StrategicTheme savedtheme = themeRepo.save(theme);
		return savedtheme;
	}

	@RequestMapping(value = "/getallthemes", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Iterable<StrategicTheme> getAllThemess() {
		Iterable<StrategicTheme> data = themeRepo.findAll();
		return data;
	}

	@RequestMapping(value = "/updatetheme", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private StrategicTheme updateTheme(@RequestBody StrategicTheme theme) {
		StrategicTheme savedtheme = themeRepo.save(theme);
		return savedtheme;
	}

	@RequestMapping(value = "/deletetheme/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteTheme(@PathVariable("id") Long id) {
		Optional<StrategicTheme> theme = themeRepo.findById(id);
        theme.ifPresent(strategicTheme -> themeRepo.delete(strategicTheme));
	}

	@RequestMapping(value = "/getthemebyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<StrategicTheme> getThemeById(@PathVariable("id") Long id) {
		return themeRepo.findById(id);
	}
	
	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		themeRepo.deleteAll();

	}

}
