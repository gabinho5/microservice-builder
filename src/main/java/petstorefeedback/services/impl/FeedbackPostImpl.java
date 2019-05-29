package petstorefeedback.services.impl;

import java.util.*;

import petstorefeedback.model.*;

import petstorefeedback.dao.*;
import petstorefeedback.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class FeedbackPostImpl implements FeedbackPostI {

	@Override
	@HystrixCommand(fallbackMethod = "reliable")
	public FeedbackPostResponseWrapper execute(FeedbackPostP pojo){
		//TODO
		return new FeedbackPostResponseWrapper();
	}

	public FeedbackPostResponseWrapper reliable(FeedbackPostP pojo){
		//TODO
		return new FeedbackPostResponseWrapper();
	}
	@Override
	public <T> T error(int statusCode, Class<T> type,Exception exception)
			throws InstantiationException, IllegalAccessException {
		//TODO to write error response
		return type.newInstance();
	}}