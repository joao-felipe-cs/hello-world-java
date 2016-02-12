package br.com.concretesolutions.test.api;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import br.com.concretesolutions.api.helloworld.HelloWorldController;
import br.com.concretesolutions.config.ApplicationConfig;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author jfelipesp
 *
 */
@SpringApplicationConfiguration(classes = ApplicationConfig.class)
@WebAppConfiguration
public class HelloWorldControllerTest {
  
  @InjectMocks
  private HelloWorldController controller;
  
  private MockMvc mock;
  
  @Before
  public void setUp() {
    initMocks(this);
    mock = MockMvcBuilders.standaloneSetup(controller).build();
  }
  
  @Test
  public void helloWorldOkForUnnamedTest() throws Exception {
    mock.perform(get("/hello")).andExpect(status().isOk());
  }

}
