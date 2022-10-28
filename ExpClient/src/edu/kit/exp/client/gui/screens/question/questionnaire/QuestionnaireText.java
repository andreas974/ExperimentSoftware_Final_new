package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

/**
 * The Class QuestionnaireItemMultipleChoice represents an implementation of a QuestionnaireItem;
 * a multiple choice question.
 *
 * @author tonda roder
 */
public class QuestionnaireText extends QuestionnaireItem {

	private static final Font ANSWER_FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Dimension PREFERRED_SIZE = new Dimension(300, 200);
	public static final String SPLIT_SIGN = ";";



	/** The answer text. */
	private ArrayList<String> answerText;

	/** The question text */
	private String QText;

	/** The answer option. */
	private ArrayList<AbstractButton> answerOption;

	/** Indicates whether multiple answers where selected. */
	private boolean selectMultiple;

	private ArrayList<String> Text;

	/**
	 * This method checks if multiple answers can be selected.
	 *
	 * @return true, if multiple answers can be selected.
	 */
	public boolean isSelectMultiple() {
		return selectMultiple;
	}

	/**
	 * This method sets a true or false value that indicates whether multiple
	 * answers can be selected in a quiz.
	 *
	 * @param selectMultiple
	 *            A boolean which regulates whether multiple or just one answer
	 *            can be selected.
	 */
	public void setSelectMultiple(boolean selectMultiple) {
		this.selectMultiple = selectMultiple;
	}

	/**
	 * This constructor instantiates a new multiple choice quiz item.
	 *
	 * @param question
	 *            A String which contains the question that will be displayed to
	 *            the client.
	 */
	public QuestionnaireText(String question) {
		super(question);

		answerText = new ArrayList<>();
		selectMultiple = false;
		Text = new ArrayList<>();
	}
	private void setComponentSize(JComponent comp, int width, int height) {
		comp.setPreferredSize(new Dimension(width, height));
		comp.setMaximumSize(new Dimension(width, height));
		comp.setMinimumSize(new Dimension(width, height));
	}

	/**
	 * This method provides the experimenter with the option to add possible
	 * answers for the question.
	 *
	 * @param text
	 *            A String which contains the client answer.
	 */
	public void addAnswer(String text) {
		answerText.add(text);
	}

	public void addText(String text) {
		Text.add(text);
	}

	public void setQText(String text){
		QText = text;
	}


	@Override
	public JPanel getAnswerPanel() {
		Border blackline;
		Border whiteline;
		blackline = BorderFactory.createLineBorder(Color.black);
		whiteline = BorderFactory.createLineBorder(Color.white);
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));

		JTextPane bob = new JTextPane();
		bob.setEditable(false);
		setComponentSize(bob, 800, 500);
		bob.setContentType("text/html");
		bob.setText("<p style='font-family: Tahoma; font-size: 12px'; align='justify'>" +QText);
		returnPanel.add(bob);


		return returnPanel;
	}

	@Override
	public boolean isValid() {
		return true;
	}

	@Override public String getAnswer() {
		String answer = "";

		return answer;
	}

}
