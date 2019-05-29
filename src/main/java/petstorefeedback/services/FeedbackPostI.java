package petstorefeedback.services;

import java.util.*;

import petstorefeedback.model.*;

public interface FeedbackPostI {

	public FeedbackPostResponseWrapper execute(FeedbackPostP pojo);
	public <T> T error(int statusCode,Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}