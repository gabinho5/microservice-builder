package petstorefeedback.model;

import java.util.*;

import org.threeten.bp.*;

import java.math.*;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FeedbackPostP {

	private FeedbackInput body;

	public FeedbackPostP(){}

	public FeedbackPostP(FeedbackInput body){
		 this.body=body;
	}


	public FeedbackInput getBody() {
		 return body;
	}

	public void setBody(FeedbackInput body) {
		 this.body=body;
	}
}