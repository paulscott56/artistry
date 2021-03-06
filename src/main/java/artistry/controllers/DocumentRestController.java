package artistry.controllers;

import artistry.models.Document;
import artistry.repositories.DocumentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Configuration
@RestController
@Description("Controller to manage documents")
@RequestMapping("/document")
class DocumentRestController {

	static final Logger log = LoggerFactory.getLogger(DocumentRestController.class);

	@Autowired
	private DocumentRepository docRepo;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Iterable<Document> getAll() {
		return docRepo.findAll();
	}

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Optional<Document> getAllById(@PathVariable("id") Long id) {
		return docRepo.findById(id);
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Document createDocument(@RequestBody Document document) {
		document.setCreationDate(new Date());
		return docRepo.save(document);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private Document updateDocument(@RequestBody Document document) {
		Optional<Document> olddoc = docRepo.findById(document.getId());
		if(olddoc.isPresent()) {
			Document doc = olddoc.get();
			Set<Date> revdates = doc.getRevisionDates();
			if(revdates == null) {
				revdates = new HashSet<>();
			}
			revdates.add(new Date());
			doc.setRevisionDates(revdates);
			doc.setAdditionalAuthors(document.getAdditionalAuthors());
			doc.setCreationDate(doc.getCreationDate());
			doc.setDocumentBody(document.getDocumentBody());
			doc.setId(doc.getId());
			doc.setLicense(document.getLicense());
			doc.setPrimaryAuthor(document.getPrimaryAuthor());
			doc.setStatus(document.getStatus());
			doc.setTitle(document.getTitle());
			doc.setVersion(document.getVersion());
			
			return docRepo.save(doc);
		}
		return document;
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteDocument(@PathVariable("id") Long id) {
		Optional<Document> document = docRepo.findById(id);
		document.ifPresent(document1 -> docRepo.delete(document1));
	}

	@RequestMapping(value = "/deleteall", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	private void deleteAll() {
		docRepo.deleteAll();

	}
}
