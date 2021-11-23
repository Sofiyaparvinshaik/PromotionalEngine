package com.promotionalEngine.PromotionalEngineException;

public class PromotionalEngineException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8769760884238473224L;

	public PromotionalEngineException() {
		super();		
	}

	public PromotionalEngineException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public PromotionalEngineException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public PromotionalEngineException(String message) {
		super(message);
		
	}

	public PromotionalEngineException(Throwable cause) {
		super(cause);
	}
	
	

}
