package calculator.model;

public class NumberBean {
	
	private double operand1;
	private double operand2;
	private String operator;
	
	private double calculatedAnswer;
	private String operation;
	private String operationMessage;
	private String displayMessage;
	
	public NumberBean(){
	}
	
	public NumberBean(String operator, double operand1, double operand2){
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public double getOperand1(){
		return operand1;
	}
	
	public void setOperand1(double operand1){
		this.operand1 = operand1;
	}
	
	public double getOperand2(){
		return operand2;
	}
	
	public void setOperand2(double operand2){
		this.operand2 = operand2;
	}
	
	public double getCalculatedAnswer(){
		return calculatedAnswer;
	}
	
	public void setCalculatedAnswer(double calculatedAnswer){
		this.calculatedAnswer = calculatedAnswer;
	}
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public String getOperationMessage() {
		return operationMessage;
	}
	
	public void setOperationMessage(String operationMessage){
		this.operationMessage = operationMessage;
	}
	
	public String displayOperation(){
		if(this.operator.equals("/") && this.operand2 == 0){
			this.displayMessage = "Division by 0 cannot be processed!";
			return this.displayMessage;
		}
		else{
			this.displayMessage = "<p>" + getOperationMessage() + " <b> " + getOperand1() + " </b> " + " by <b>" + getOperand2() + "</b> is " + getCalculatedAnswer() + "</p>";
			return this.displayMessage;
		}
	}
	
	public void determineOperation(){
		if(this.operator.equals("+")){
			this.operation = "Addition";
			this.operationMessage = "Adding ";
			this.calculatedAnswer = (operand1 + operand2);
		}
		else if(this.operator.equals("-")){
			this.operation = "Subraction";
			this.operationMessage = "Subracting ";
			this.calculatedAnswer = (operand1 - operand2);
		}
		else if(this.operator.equals("*")){
			this.operation = "Multiplication";
			this.operationMessage = "Multiplying ";
			this.calculatedAnswer = (operand1 * operand2);
		}
		else {
			this.operation = "Division";
			this.operationMessage = "Dividing ";
			this.calculatedAnswer = (operand1 / operand2);
		}
	}
}
