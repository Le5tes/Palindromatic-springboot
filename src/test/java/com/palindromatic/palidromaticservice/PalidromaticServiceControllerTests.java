package com.palindromatic.palidromaticservice;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PalidromaticServiceControllerTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void serverIsRunning ()  throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/")).andExpect(status().isOk());
    }
}
