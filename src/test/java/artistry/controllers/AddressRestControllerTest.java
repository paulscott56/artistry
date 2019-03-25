package artistry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AddressRestControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getAll() {
        String message = restTemplate.getForObject("/address/getall", String.class);
        assertNotNull(message);
    }

    @org.junit.jupiter.api.Test
    void getAllById() {
    }
}