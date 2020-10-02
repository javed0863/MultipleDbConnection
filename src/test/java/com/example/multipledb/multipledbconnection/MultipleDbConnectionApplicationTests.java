package com.example.multipledb.multipledbconnection;

import junit.runner.Version;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MultipleDbConnectionApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {

	}

	@Test
	public void testCustomerDB() throws Exception {
		mockMvc.perform(get("/customer/"))
				.andExpect(jsonPath("$[0].name").value("Javed"))
				.andExpect(jsonPath("$[0].id").value(1))
				.andExpect(jsonPath("$[0].age").value(30))
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[0].*", hasSize(3)))
				.andExpect(status().isOk());
	}

	@Test
	public void testProductDB() throws Exception {
		mockMvc.perform(get("/product/"))
				.andExpect(jsonPath("$[0].name").value("Table"))
				.andExpect(jsonPath("$[0].id").value(1))
				.andExpect(jsonPath("$[0].price").value(20))
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[0].*", hasSize(3)))
				.andExpect(status().isOk());
	}

}
