package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tondaroder on 03.02.17.
 */

public class QuestionnaireDropDown extends QuestionnaireItem {

	public static final Font FONT = new Font("Tahoma", Font.PLAIN, 15);
	private JTextField inputField;
	private double minimumLength = 1;
	private Dimension preferredSize = new Dimension(600, 100);
	private ArrayList<JComboBox> answerOption;
	public String[] answerText;
	JComboBox answer;



	/**
	 * This constructor instantiates a new number input quiz item.
	 *
	 * @param question
	 *            A String which contains the question to be shown to a client.
	 */
	public QuestionnaireDropDown(String question) {
		super(question);
	}

	//public void addAnswer(String text) {
	//	answerText.add(text);
	//}


	@Override
	public JPanel getAnswerPanel() {
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));

		JPanel answerListPanel = new JPanel();
		returnPanel.add(answerListPanel);
		answerListPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		answerListPanel.setBackground(returnPanel.getBackground());
		answerListPanel.setLayout(new BoxLayout(answerListPanel, BoxLayout.Y_AXIS));
		answerListPanel.setPreferredSize(preferredSize);
		answerListPanel.setMinimumSize(preferredSize);
		answerListPanel.setMaximumSize(preferredSize);

		answerOption = new ArrayList<JComboBox>();



		answer = new JComboBox<String>(answerText);

		answer.setFont(FONT);

		answer.setBackground(returnPanel.getBackground());
		answerListPanel.add(answer);



		return returnPanel;



	}

	@Override
	public boolean isValid() {
		String inputText = (String) answer.getItemAt(answer.getSelectedIndex());
		return (inputText.isEmpty() == false && inputText != "Bitte auswählen..." && inputText != "---");
	}

	@Override
	public String getAnswer() {
		return (String) answer.getItemAt(answer.getSelectedIndex());
	}

	public void setMinimumLength(double minimumLength) {
		this.minimumLength = minimumLength;
	}

	public void setTextFieldSize(int width, int height) {
		preferredSize = new Dimension(width, height);
	}

}
