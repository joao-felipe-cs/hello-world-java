package br.com.concretesolutions.api.helloworld;

import br.com.concretesolutions.api.models.HelloWorldResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class HelloWorldController.
 *
 * @author jfelipesp
 */
@RestController
public class HelloWorldController {

  /**
   * Say hello.
   *
   * @param name the name
   * @return the response entity
   */
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public ResponseEntity<HelloWorldResponse> sayHello(@RequestParam(value = "name",defaultValue = "No Name",  required = false) String name) {
    return new ResponseEntity<HelloWorldResponse>(new HelloWorldResponse(name), HttpStatus.OK);
  }
}
