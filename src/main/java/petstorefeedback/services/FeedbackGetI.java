package petstorefeedback.services;

import java.util.*;

import petstorefeedback.model.*;

public interface FeedbackGetI {

	public FeedbackGetResponseWrapper execute(FeedbackGetP pojo);
	public <T> T error(int statusCode,Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException;

}