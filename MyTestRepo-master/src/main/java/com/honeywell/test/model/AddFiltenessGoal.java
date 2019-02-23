package com.honeywell.test.model;

public class AddFiltenessGoal {
private String name;
private String fitnessGoal;

public AddFiltenessGoal() {
	// TODO Auto-generated constructor stub
}
public AddFiltenessGoal(String name, String fitnessGoal) {
	super();
	this.name = name;
	this.fitnessGoal = fitnessGoal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFitnessGoal() {
	return fitnessGoal;
}
public void setFitnessGoal(String fitnessGoal) {
	this.fitnessGoal = fitnessGoal;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
