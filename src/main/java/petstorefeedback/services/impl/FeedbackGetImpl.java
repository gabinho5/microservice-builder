package petstorefeedback.services.impl;

import java.util.*;

import petstorefeedback.model.*;

import petstorefeedback.dao.*;
import petstorefeedback.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class FeedbackGetImpl implements FeedbackGetI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public FeedbackGetResponseWrapper execute(FeedbackGetP pojo){
		//TODO
		return new FeedbackGetResponseWrapper();
	}

	public FeedbackGetResponseWrapper reliable(FeedbackGetP pojo){
		//TODO
		return new FeedbackGetResponseWrapper();
	}
	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}