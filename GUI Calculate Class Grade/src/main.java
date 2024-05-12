import java.util.*;
import java.io.*;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class main {

	public static void main(String[] args) {
		
		//Define and initialize variables
		String firstName;
		String lastName;
		int[] projectGrades = {0,0,0,0,0,0};
		int[] homeworkGrades = {0,0,0,0};
		int[] examGrades = {0,0,0,0};
		int[] classesAttended = {0};
		int tempInput = 0;
		boolean validInput = false;
		
		//Name
		firstName = JOptionPane.showInputDialog(null, "Enter your first name: ","First Name", JOptionPane.QUESTION_MESSAGE);
		lastName = JOptionPane.showInputDialog(null, "Enter your last name: ","Last Name", JOptionPane.QUESTION_MESSAGE);
		
		//Project 1
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Project 1)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		projectGrades[0] = tempInput;
		validInput = false;
		
		//Project 2
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Project 2)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		projectGrades[1] = tempInput;
		validInput = false;
		
		//Project 3
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Project 3)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		projectGrades[2] = tempInput;
		validInput = false;
		
		//Project 4
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 200","Grade (Project 4)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,200);
		}
		while(!validInput);
		projectGrades[3] = tempInput;
		validInput = false;
		
		//Project 5
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Project 5)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,200);
		}
		while(!validInput);
		projectGrades[4] = tempInput;
		validInput = false;
		
		//Bonus Project
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "BONUS PROJECT: Enter a positive integer number <= 200","Grade (BONUS PROJECT)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,200);
		}
		while(!validInput);
		projectGrades[5] = tempInput;
		validInput = false;
		
		//Homework 1
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 50","Grade (HomeWork 1)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,50);
		}
		while(!validInput);
		homeworkGrades[0] = tempInput;
		validInput = false;
		
		//Homework 2
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 50","Grade (HomeWork 2)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,50);
		}
		while(!validInput);
		homeworkGrades[1] = tempInput;
		validInput = false;
		
		//Homework 3
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 50","Grade (HomeWork 3)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,50);
		}
		while(!validInput);
		homeworkGrades[2] = tempInput;
		validInput = false;
		
		//Homework 4
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 50","Grade (HomeWork 4)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,50);
		}
		while(!validInput);
		homeworkGrades[3] = tempInput;
		validInput = false;
		
		//Test 1
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Test 1)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		examGrades[0] = tempInput;
		validInput = false;
		
		//Test 2
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Test 2)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		examGrades[1] = tempInput;
		validInput = false;
		
		//Test 3
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Test 3)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		examGrades[2] = tempInput;
		validInput = false;
		
		//Test 4
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive integer number <= 100","Grade (Test 4)", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,100);
		}
		while(!validInput);
		examGrades[3] = tempInput;
		validInput = false;
		
		
		//Attendance
		do {
			tempInput = Integer.parseInt(JOptionPane.showInputDialog(null, "How many classes has student attended: Enter a Positive Integer Number <= 28 ","Attendance ", JOptionPane.QUESTION_MESSAGE));
			validInput = validInput(tempInput,28);
		}
		while(!validInput);
		classesAttended[0] = tempInput;
		
		displayStudentData(firstName,lastName,projectGrades,homeworkGrades,examGrades,classesAttended);
			

	}
	
	
	//method to display student data 
	public static void displayStudentData(String firstName, String lastName,int projectGrades[],int homeworkGrades[],int examGrades[],int classesAttended[])
	{
		int projectGradesPercentage = calculatePercentages(projectGrades,700);
		int homeworkGradesPercentage = calculatePercentages(homeworkGrades,200);
		int examGradesPercentage = calculatePercentages(examGrades,400);
		int attendancePercentage = calculatePercentages(classesAttended,28);
		int classPercentage = ((int)(projectGradesPercentage*40) + (homeworkGradesPercentage*10) + (examGradesPercentage*50) + (attendancePercentage*10))/100;
		
		
		
		//using Jlabel so the text can easily be centered
		JLabel label = new JLabel("<html><center>"
				+ "CSC 229 Project 1 <br>"
				+ "------------------------------------------<br>"
				+ "First Name = " + firstName + "<br>"
				+ "Last Name = " + lastName + "<br>"
				+ "------------------------------------------<br>"
				+ "Project Grades <br>"
				+ "------------------------------------------<br>"
				+ "Project 1 (50) --- " + projectGrades[0] + "<br>"
				+ "Project 2 (100) --- " + projectGrades[1] + "<br>"
				+ "Project 3 (100) --- " + projectGrades[2] + "<br>"
				+ "Project 4 (100) --- " + projectGrades[3] + "<br>"
				+ "Project 5 (200) --- " + projectGrades[4] + "<br>"
				+ "Bonus (200) --- " + projectGrades[5] + "<br>"
				+ "------------------------------------------<br>"
				+ "Homework Grades <br>"
				+ "------------------------------------------<br>"
				+ "HomeWork 1 (50) --- " + homeworkGrades[0] + "<br>"
				+ "HomeWork 2 (50) --- " + homeworkGrades[1] + "<br>"
				+ "HomeWork 3 (50) --- " + homeworkGrades[2] + "<br>"
				+ "HomeWork 4 (50) --- " + homeworkGrades[3] + "<br>"
				+ "------------------------------------------<br>"
				+ "Test Grades<br>"
				+ "------------------------------------------<br>"
				+ "Test 1 (100) --- " + examGrades[0] + "<br>"
				+ "Test 2 (100) --- " + examGrades[1] + "<br>"
				+ "Test 3 (100) --- " + examGrades[2] + "<br>"
				+ "Test 4 (100) --- " + examGrades[3] + "<br>"
				+ "------------------------------------------<br>"
				+ "Attendance --- " + classesAttended[0] + " of 28<br>"
				+ "------------------------------------------<br>"
				+ "% Grade from Projects --> " + projectGradesPercentage + "%<br>"
				+ "% Grade from Homeworks --> " + homeworkGradesPercentage + "%<br>"
				+ "% Grade from Tests --> " + examGradesPercentage + "%<br>"
				+ "% Class Attendance --> " + attendancePercentage + "%<br>"
				+ "==============================<br>"
				+ "Percentage for Class --> " + classPercentage + "%<br>"
				+ "==============================<br>");
		
		label.setHorizontalAlignment(SwingConstants.CENTER); //centers text
		JOptionPane.showMessageDialog(null, label, "Project 1 - Aiello", JOptionPane.INFORMATION_MESSAGE);
						
	}
	
	//method to calculate percentages based on parameters
	public static int calculatePercentages(int grades[],int maxGrade)
	{
		int tempSum = 0;
		double percentage;
		
		for(int i=0;i<grades.length;i++)
		{
			tempSum += grades[i];
		}
		
		percentage = (double)tempSum/(double)maxGrade;
		
		
		return (int) (percentage*100);
		
	}
	
	//method to check whether the input is valid based on grade assignments 
	public static boolean validInput(int grade,int max)
	{
		if (grade<0 || grade>max)
		{
			JOptionPane.showMessageDialog(null, "Error: Please Enter a valid number within the range prompted to you", "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else
		{
			return true;
		}
	}

}
