package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * The Class QuestionnaireItemMultipleChoice represents an implementation of a QuestionnaireItem;
 * a multiple choice question.
 *
 * @author tonda roder
 */
public class QuestionnaireSelection extends QuestionnaireItem {

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
	public QuestionnaireSelection(String question) {
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
		JButton button = new JButton("Erklärungen");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(returnPanel, "<html><b>Geistige Anforderung:</b>"+
						"<div width='400px'><p align='justify'>Wie viel geistige Anforderung war bei der Informationsaufnahme und bei der Informationsverarbeitung erforderlich (z.B. Denken, Entscheiden, Rechnen, Erinnern, Hinsehen, Suchen ...)? War die Aufgabe leicht oder anspruchsvoll, einfach oder komplex, erfordert sie hohe Genauigkeit oder ist sie fehlertolerant?" +
						"<br>" +
						"<br>" +
						"<b>Zeitliche Anforderung:</b><br> "+
						"Wie viel Zeitdruck empfanden Sie hinsichtlich der Häufigkeit oder dem Takt mit dem die Aufgaben oder Aufgabenelemente auftraten? War die Aufgabe langsam und geruhsam oder schnell und hektisch?"+
						"<br>" +
						"<br>" +
						"<b>Leistung:</b><br> "+
						"Wie erfolgreich haben Sie Ihrer Meinung nach die vom Versuchsleiter (oder Ihnen selbst) gesetzten Ziele erreicht? Wie zufrieden waren Sie mit Ihrer Leistung bei der Verfolgung dieser Ziele?"+
						"<br>" +
						"<br>" +
						"<b>Anstrengung:</b><br> "+
						"Wie hart mussten Sie arbeiten, um Ihren Grad an Aufgabenerfüllung zu erreichen?"+
						"<br>" +
						"<br>" +
						"<b>Frustration:</b><br> "+
						"Wie unsicher, entmutigt, irritiert, gestresst und verärgert (versus sicher, bestätigt, zufrieden, entspannt und zufrieden mit sich selbst) fühlten Sie sich während der Aufgabe?"+
						"<html>", "Erklärungen", JOptionPane.INFORMATION_MESSAGE);

			}
		});
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnPanel.add(button);
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
		JTextPane LeftText;
		JTextPane RightText;

		JPanel answerListPanel = new JPanel();
		answerListPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();
		answerListPanel.setBackground(Color.white);
		setComponentSize(answerListPanel, 600,400);


		//ButtonGroup answerGroup = new ButtonGroup();
		int j = 2;
		for (String ananswerText : answerText) {
			String[] parts = ananswerText.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			ButtonGroup answerGroup = new ButtonGroup();
			//QuestionText = new JTextArea(anAnswerText);

			LeftText = new JTextPane();
			LeftText.setEditable(false);
			setComponentSize(LeftText, 150, 25);
			LeftText.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LeftText.setContentType("text/html");
			LeftText.setText(part1);
			Color lightgrey = new Color(224,224,224);
			LeftText.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			LeftText.setAlignmentX(Component.RIGHT_ALIGNMENT);
			if (j%2 != 0){
				LeftText.setBackground(Color.white);
			}
			else {
				LeftText.setBackground(Color.white);
			}
			d.gridx = 0;
			d.weightx = 0.5;
			d.gridy = j;
			d.anchor = GridBagConstraints.WEST;
			//questions.add(QuestionText);

			answerListPanel.add(LeftText, d);

			RightText = new JTextPane();
			RightText.setEditable(false);
			setComponentSize(RightText, 150, 25);
			RightText.setFont(new Font("Tahoma", Font.PLAIN, 17));
			RightText.setContentType("text/html");
			RightText.setText(part2);
			RightText.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			if (j%2 != 0){
				RightText.setBackground(Color.white);
			}
			else {
				RightText.setBackground(Color.white);
			}
			d.gridx = 3;
			d.weightx = 0.5;
			d.gridy = j;
			d.anchor = GridBagConstraints.WEST;
			//questions.add(QuestionText);

			answerListPanel.add(RightText, d);


			if (selectMultiple) {
				answer1 = new JRadioButton("      ", false);
				answer2 = new JRadioButton("      ", false);
			} else {
				answer1 = new JRadioButton("1", false);
				answer1.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer1.setHorizontalAlignment(SwingConstants.CENTER);
				answer1.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer1.setForeground(Color.white);
				answer1.setFocusable(false);
				setComponentSize(answer1, 50, 25);
				if (j%2 != 0){
					answer1.setBackground(Color.white);
					answer1.setForeground(Color.white);
					answer1.setOpaque(true);
				}
				else {
					answer1.setForeground(Color.white);
					answer1.setBackground(Color.white);
				}
				d.anchor = GridBagConstraints.CENTER;
				d.gridx = 1;
				d.weightx = 0.5;
				d.gridy = j;
				answerGroup.add(answer1);
				answerListPanel.add(answer1, d);
				answer2 = new JRadioButton("2", false);
				answer2.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer2.setHorizontalAlignment(SwingConstants.CENTER);
				answer2.setVerticalTextPosition(SwingConstants.BOTTOM);
				answer2.setFocusable(false);
				setComponentSize(answer2, 50, 25);
				if (j%2 != 0){
					answer2.setBackground(Color.white);
					answer2.setForeground(Color.white);
					answer2.setOpaque(true);
				}
				else {
					answer2.setForeground(Color.white);
					answer2.setBackground(Color.white);
				}
				answer2.setBorder(whiteline);
				answer2.setAlignmentY(SwingConstants.TOP);
				answer2.setBorder(oneline);
				answerGroup.add(answer2);
				d.gridx = 2;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer2, d);
			}

			answerOption.add(answer1);
			answerOption.add(answer2);
			answerListPanel.setAlignmentY(Component.TOP_ALIGNMENT);
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
