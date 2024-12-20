package com.scanner.project;

public class Token {

	// Token type
	// Identifier, Keyword, Literal,
	// Separator, Operator, or Other
	private String type;
	// Token value
	private String value;

	/**
	 * @param value
	 *            . Set the value of a Token.
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return Returns the value of a Token.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param type
	 *            . Set the type of a Token.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return Returns the type of a Token.
	 */
	public String getType() {
		return type;
	}

	public String toString() {
		return "Value: " + this.getValue() + " " + "Type: " + this.getType();
	}

}
