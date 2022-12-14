package com.swisscom.taaweni0.demoapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.swisscom.taaweni0.demoapp.model.World;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;



import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class WorldControllerTest {

    @Autowired
    private WorldController controller;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        obj.registerModule(new JavaTimeModule());
        MvcResult result = this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk()).andReturn();
        World response = obj.readValue(result.getResponse().getContentAsString(), World.class);
        assertThat(response).isNotNull();
        assertThat(response.getHello()).contains("World");

    }
}
