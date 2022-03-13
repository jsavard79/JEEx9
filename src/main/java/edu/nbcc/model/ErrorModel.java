/**
 * 
 */
package edu.nbcc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jensa
 *
 */
public class ErrorModel {
	
	private List<String> errors = new ArrayList<String>();
	
	public ErrorModel() {
		
	}
	
	public ErrorModel(String error) {
		this.errors.add(error);
	}
	
	/**
	 * 
	 * @return
	 */
	public List<String> getErrors() {
		return errors;
	}

	/**
	 * 
	 * @param errors
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
}
