package petstorefeedback.controller;

import petstorefeedback.model.ErrorResponse;
import petstorefeedback.model.Feedback;
import petstorefeedback.model.FeedbackInput;
import petstorefeedback.model.SuccessfulResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-29T16:54:41.391Z")

@Controller
public class FeedbackApiController implements FeedbackApi {

    private static final Logger log = LoggerFactory.getLogger(FeedbackApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FeedbackApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Feedback> feedbackGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Feedback>(objectMapper.readValue("{  \"feedback\" : \"feedback\",  \"rev\" : \"rev\",  \"created_ts\" : \"created_ts\",  \"name\" : \"name\",  \"rating\" : 0,  \"id\" : \"id\"}", Feedback.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Feedback>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Feedback>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SuccessfulResponse> feedbackPost(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody FeedbackInput body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SuccessfulResponse>(objectMapper.readValue("{  \"rev\" : \"rev\",  \"id\" : \"id\"}", SuccessfulResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SuccessfulResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SuccessfulResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
