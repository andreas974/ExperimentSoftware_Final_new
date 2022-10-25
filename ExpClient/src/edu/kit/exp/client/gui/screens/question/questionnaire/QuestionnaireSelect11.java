package edu.kit.exp.client.gui.screens.question.questionnaire;

import org.eclipse.swt.internal.C;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;

/**
 * The Class QuestionnaireItemMultipleChoice represents an implementation of a QuestionnaireItem;
 * a multiple choice question.
 *
 * @author tonda roder
 */
public class QuestionnaireSelect11 extends QuestionnaireItem {

	private static final Font ANSWER_FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Dimension PREFERRED_SIZE = new Dimension(300, 200);
	public static final Dimension textsize = new Dimension(500, 15);

	public static final String SPLIT_SIGN = ";";

	/**
	 * The answer text.
	 */
	private ArrayList<String> answerText;

	/**
	 * The answer text.
	 */
	private ArrayList<String> questionText;

	/**
	 * The answer option.
	 */
	private ArrayList<AbstractButton> answerOption;


	/**
	 * Indicates whether multiple answers where selected.
	 */
	private boolean selectMultiple;

	private ArrayList<String> Text;

	private ArrayList<JTextArea> questions;

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
	 * @param selectMultiple A boolean which regulates whether multiple or just one answer
	 *                       can be selected.
	 */
	public void setSelectMultiple(boolean selectMultiple) {
		this.selectMultiple = selectMultiple;
	}

	/**
	 * This constructor instantiates a new multiple choice quiz item.
	 *
	 * @param question A String which contains the question that will be displayed to
	 *                 the client.
	 */
	public QuestionnaireSelect11(String question) {
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
	 * @param text A String which contains the client answer.
	 */

	public void addAnswer(String text) {
		answerText.add(text);
	}
	public void addQuestion(String text) {
		questionText.add(text);
	}

	public void addText(String text) {
		Text.add(text);
	}


	@Override
	public JPanel getAnswerPanel() {
		JPanel basePanel = new JPanel();
		//basePanel.setLayout(new GridLayout(2,2));
		basePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		basePanel.setBackground(Color.white);
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
		int i = 0;
		for (String ananswerText : answerText) {
			i++;
		}
		////GridBagConstraints c = new GridBagConstraints();
		returnPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		Border blackline;
		Border whiteline;
		blackline = BorderFactory.createLineBorder(Color.black);
		whiteline = BorderFactory.createLineBorder(Color.white);
		Border oneline;
		oneline = BorderFactory.createMatteBorder(2,0,0,0,Color.lightGray);


		answerOption = new ArrayList<>();
		JRadioButton answer1;
		JRadioButton answer2;
		JRadioButton answer3;
		JRadioButton answer4;
		JRadioButton answer5;
		JRadioButton answer6;
		JRadioButton answer7;
		JRadioButton answer8;
		JRadioButton answer9;
		JRadioButton answer10;
		JRadioButton answer11;
		JTextPane QuestionText;
		JTextPane LeftText;
		JTextPane RightText;

		JPanel answerListPanel = new JPanel();
		answerListPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();


		//ButtonGroup answerGroup = new ButtonGroup();
		int j = 0;
		for (String ananswerText : answerText) {
			String[] parts = ananswerText.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			ButtonGroup answerGroup = new ButtonGroup();
			//QuestionText = new JTextArea(anAnswerText);

			LeftText = new JTextPane();
			LeftText.setEditable(false);
			setComponentSize(LeftText, 100, 70);
			LeftText.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LeftText.setContentType("text/html");
			LeftText.setText("<br>"+ "<p style=\"vertical-align:middle; font-family: Tahoma; font-size: 13px; \">"+"<b>"+part1);
			LeftText.setBorder(whiteline);
			LeftText.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			LeftText.setBackground(Color.white);
			LeftText.setBackground(Color.white);
			d.gridx = 0;
			d.weightx = 0.5;
			d.gridy = 0;
			//questions.add(QuestionText);

			answerListPanel.add(LeftText, d);


			if (selectMultiple) {
				answer1 = new JRadioButton("      ", false);
				answer2 = new JRadioButton("      ", false);
				answer3 = new JRadioButton("      ", false);
				answer4 = new JRadioButton("      ", false);
				answer5 = new JRadioButton("      ", false);
				answer6 = new JRadioButton("      ", false);
				answer7 = new JRadioButton("      ", false);
				answer8 = new JRadioButton("      ", false);
				answer9 = new JRadioButton("      ", false);
				answer10 = new JRadioButton("      ", false);
				answer11 = new JRadioButton("      ", false);
			} else {
				answer1 = new JRadioButton("1", false);
				answer1.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer1.setHorizontalAlignment(SwingConstants.CENTER);
				answer1.setHorizontalTextPosition(SwingConstants.CENTER);
				answer1.setVerticalTextPosition(JRadioButton.TOP);
				d.anchor = GridBagConstraints.CENTER;
				d.gridx = 1;
				d.weightx = 0.5;
				d.gridy = j;
				answerGroup.add(answer1);
				answerListPanel.add(answer1, d);
				answer2 = new JRadioButton("2", false);
				answer2.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer2.setHorizontalAlignment(SwingConstants.CENTER);
				answer2.setHorizontalTextPosition(SwingConstants.CENTER);
				answer2.setVerticalTextPosition(JRadioButton.TOP);
				answer2.setBorder(whiteline);
				answer2.setAlignmentY(SwingConstants.TOP);
				answer2.setBorder(oneline);
				answerGroup.add(answer2);
				d.gridx = 2;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer2, d);
				answer3 = new JRadioButton("3", false);
				answer3.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer3.setHorizontalAlignment(SwingConstants.CENTER);
				answer3.setHorizontalTextPosition(SwingConstants.CENTER);
				answer3.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer3);
				d.gridx = 3;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer3, d);
				answer4 = new JRadioButton("4", false);
				answer4.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer4.setHorizontalAlignment(SwingConstants.CENTER);
				answer4.setHorizontalTextPosition(SwingConstants.CENTER);
				answer4.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer4);
				d.gridx = 4;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer4, d);
				answer5 = new JRadioButton("5", false);
				answer5.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer5.setHorizontalAlignment(SwingConstants.CENTER);
				answer5.setHorizontalTextPosition(SwingConstants.CENTER);
				answer5.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer5);
				d.gridx = 5;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer5, d);
				answer6 = new JRadioButton("6", false);
				answer6.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer6.setHorizontalAlignment(SwingConstants.CENTER);
				answer6.setHorizontalTextPosition(SwingConstants.CENTER);
				answer6.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer6);
				d.gridx = 6;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer6, d);
				answer7 = new JRadioButton("7", false);
				answer7.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer7.setHorizontalAlignment(SwingConstants.CENTER);
				answer7.setHorizontalTextPosition(SwingConstants.CENTER);
				answer7.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer7);
				d.gridx = 7;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer7, d);
				answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
				answer8 = new JRadioButton("8", false);
				answer8.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer8.setHorizontalAlignment(SwingConstants.CENTER);
				answer8.setHorizontalTextPosition(SwingConstants.CENTER);
				answer8.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer8);
				d.gridx = 8;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer8, d);
				answer9 = new JRadioButton("9", false);
				answer9.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer9.setHorizontalAlignment(SwingConstants.CENTER);
				answer9.setHorizontalTextPosition(SwingConstants.CENTER);
				answer9.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer9);
				d.gridx = 9;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer9, d);
				answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

				answer10 = new JRadioButton("10", false);
				answer10.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer10.setHorizontalAlignment(SwingConstants.CENTER);
				answer10.setHorizontalTextPosition(SwingConstants.CENTER);
				answer10.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer10);
				d.gridx = 10;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer10, d);
				answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

				answer11 = new JRadioButton("11", false);
				answer11.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer11.setHorizontalAlignment(SwingConstants.CENTER);
				answer11.setHorizontalTextPosition(SwingConstants.CENTER);
				answer11.setVerticalTextPosition(JRadioButton.TOP);
				answerGroup.add(answer11);
				d.gridx = 11;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer11, d);
				//answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
				answerListPanel.setBackground(Color.white);
			}

			RightText = new JTextPane();
			RightText.setEditable(false);
			setComponentSize(RightText, 100, 70);
			RightText.setFont(new Font("Tahoma", Font.PLAIN, 17));
			RightText.setContentType("text/html");
			RightText.setText("<br>"+"<p style=\"vertical-align:middle; font-family: Tahoma; font-size: 13px; \">"+"<b>"+part2);
			RightText.setBorder(whiteline);
			RightText.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			RightText.setBackground(Color.white);
			RightText.setBackground(Color.white);
			d.gridx = 12;
			d.weightx = 0.5;
			d.gridy = 0;
			//questions.add(QuestionText);

			answerListPanel.add(RightText, d);
			//answer.setFont(ANSWER_FONT);
			//questions.add(QuestionText);

			answerOption.add(answer1);
			answerOption.add(answer2);
			answerOption.add(answer3);
			answerOption.add(answer4);
			answerOption.add(answer5);
			answerOption.add(answer6);
			answerOption.add(answer7);
			answerOption.add(answer8);
			answerOption.add(answer9);
			answerOption.add(answer10);
			answerOption.add(answer11);

			answerListPanel.setAlignmentX(returnPanel.LEFT_ALIGNMENT);
			answerListPanel.setAlignmentY(answerListPanel.TOP_ALIGNMENT);
			returnPanel.add(answerListPanel);

			j++;
		}

		/*JTextArea options1 = new JTextArea("1..." + "Ich stimme voll und ganz zu");
		JTextArea options2 = new JTextArea("2..." + "Ich stimme zu");
		JTextArea options3 = new JTextArea("3..." + "Ich stimme weder zu noch lehne ab");
		JTextArea options4 = new JTextArea("4..."+"Ich Ich stimme nicht zu");
		JTextArea options5 = new JTextArea("5..."+"Ich stimme überhaupt nicht zu");
		//options.setText("1..." + "Ich stimme voll und ganz zu" + "2..." + "Ich stimme zu" + "3..." + "Ich stimme weder zu noch lehne ab" + "4..."+"Ich Ich stimme nicht zu" + "5..."+"Ich stimme überhaupt nicht zu");
		d.gridy = 7;
		d.gridwidth = 5;
		basePanel.add(options1, d);
		basePanel.add(options2, d);
		basePanel.add(options3, d);
		basePanel.add(options4, d);
		basePanel.add(options5, d);*/
		returnPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		return returnPanel;
	}


	@Override
	public boolean isValid() {
		int i = 0;
		for (String ananswerText : answerText) {
			i++;
		}
		int j=0;
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				j++;
			}
		}
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected() && i==j) {
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
