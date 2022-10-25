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
public class QuestionnaireMultipleChoiceKonow extends QuestionnaireItem {

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
	public QuestionnaireMultipleChoiceKonow(String question) {
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
		setComponentSize(bob, 800, 180);
		bob.setContentType("text/html");
		bob.setText(QText);
		returnPanel.add(bob);

		JPanel answerListPanel = new JPanel();
		returnPanel.add(answerListPanel);
		answerListPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		answerListPanel.setBackground(returnPanel.getBackground());
		answerListPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();
		answerListPanel.setPreferredSize(PREFERRED_SIZE);

		answerOption = new ArrayList<>();
		AbstractButton answer;
		JTextPane text;
		ButtonGroup answerGroup = new ButtonGroup();
		int i = 1;
		for (String anAnswerText : answerText) {
			if (selectMultiple) {
				answer = new JCheckBox(anAnswerText, false);
			} else {
				answer = new JRadioButton(String.valueOf(i), false);
				setComponentSize(answer, 50, 65);
				answer.setHorizontalTextPosition(SwingConstants.LEFT);
				answer.setVerticalTextPosition(JRadioButton.CENTER);
				answer.setBackground(Color.white);
				answer.setForeground(Color.white);
				d.gridx = 1;
				d.gridy = i;
				d.anchor = GridBagConstraints.WEST;
				answerListPanel.add(answer, d);

				text = new JTextPane();
				text.setEditable(false);
				setComponentSize(text, 680, 60);
				text.setContentType("text/html");
				text.setText("<p style=\"vertical-align:middle; font-family: Tahoma; font-size: 12px; \">"+anAnswerText);
				text.setAlignmentY(Component.CENTER_ALIGNMENT);
				text.setAlignmentX(Component.CENTER_ALIGNMENT);
				d.gridx = 5;
				d.gridy = i;
				d.anchor = GridBagConstraints.WEST;
				answerListPanel.add(text, d);
				i++;

				answerGroup.add(answer);
			}
			answerOption.add(answer);
			answerListPanel.setBorder(blackline);

			answer.setBackground(returnPanel.getBackground());
		}

		return returnPanel;
	}

	@Override
	public boolean isValid() {
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				return true;
			}
		}
		return false;
	}

	@Override public String getAnswer() {
		String answer = "";
		int selectedCounter = 0;
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				if (selectedCounter == 0) {
					answer = anAnswerOption.getText();
				} else {
					answer += (SPLIT_SIGN + anAnswerOption.getText());
				}
				selectedCounter++;
			}
		}
		return answer;
	}

}
