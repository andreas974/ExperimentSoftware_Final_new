package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 * The Class QuestionnaireItemMultipleChoice represents an implementation of a QuestionnaireItem;
 * a multiple choice question.
 *
 * @author tonda roder
 */
public class QuestionnaireLikert extends QuestionnaireItem {

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
	public QuestionnaireLikert(String question) {
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
		for (String anAnswerText : answerText) {
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

		/*
		Previous Version of Texpanel above

		JPanel textpanel = new JPanel();
		returnPanel.add(textpanel);
		//textpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		textpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		textpanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textpanel.setBackground(returnPanel.getBackground());
		textpanel.setPreferredSize(textsize);
		//textpanel.setLayout(new GridLayout(1,6));
		textpanel.setLayout(new GridBagLayout());
		GridBagConstraints f = new GridBagConstraints();
		JTextArea text01 = new JTextArea();
		JTextArea text02 = new JTextArea();
		JTextArea text03 = new JTextArea();
		JTextArea text04 = new JTextArea();
		JTextArea text05 = new JTextArea();
		//text.insert("                                                                                                                           Ich stimme voll und ganz zu            Ich stimme zu            Ich stimme weder zu noch lehne ab            Ich stimme nicht zu            Ich stimme überhaupt nicht zu", 0);
		text01.insert("1... Ich stimme voll und ganz zu,  ", 0);
		text02.insert("2... Ich stimme zu,  ", 0);
		text03.insert("3... Ich stimme weder zu noch lehne ab,  ", 0);
		text04.insert("4... Ich Ich stimme nicht zu,  ", 0);
		text05.insert("5... Ich stimme überhaupt nicht zu,  ", 0);
		textpanel.add(text01);
		f.gridx = 6;
		textpanel.add(text02);
		f.gridx = 7;
		textpanel.add(text03);
		f.gridx = 8;
		textpanel.add(text04);
		f.gridx = 9;
		textpanel.add(text05);
		f.gridx = 10;*/

		answerOption = new ArrayList<>();
		JRadioButton answer1;
		JRadioButton answer2;
		JRadioButton answer3;
		JRadioButton answer4;
		JRadioButton answer5;
		JRadioButton answer6;
		JRadioButton answer7;
		JTextPane QuestionText;

		JPanel answerListPanel = new JPanel();
		answerListPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();

		//JTextArea text1 = new JTextArea("  1");
		JTextPane text1 = new JTextPane();
		text1.setEditable(false);
		setComponentSize(text1, 100, 60);
		System.out.println("PrefSize:" +text1.getPreferredSize());
		System.out.println("MaxSize:" +text1.getMaximumSize());
		System.out.println("MinSize:" +text1.getMinimumSize());
		text1.setContentType("text/html");
		text1.setText("Stimme<br>überhaupt<br>nicht zu");
		text1.setFont(ANSWER_FONT);
		text1.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 1;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text1, d);

		//JTextArea text2 = new JTextArea("  2");
		JTextPane text2 = new JTextPane();
		text2.setEditable(false);
		setComponentSize(text2, 100, 60);
		text2.setFont(ANSWER_FONT);
		text2.setContentType("text/html");
		text2.setText("Stimme<br>nicht zu<br>\n");
		text2.setAlignmentX(text1.TOP_ALIGNMENT);
		text2.setAlignmentY(text1.TOP_ALIGNMENT);
		text2.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 2;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text2, d);

		//JTextArea text3 = new JTextArea("  3");
		JTextPane text3 = new JTextPane();
		text3.setEditable(false);
		setComponentSize(text3, 100, 60);
		text3.setFont(ANSWER_FONT);
		text3.setContentType("text/html");
		text3.setText("Stimme eher<br>nicht zu<br> ");
		text3.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 3;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text3, d);

		//JTextArea text4 = new JTextArea("  4");
		JTextPane text4 = new JTextPane();
		text4.setEditable(false);
		setComponentSize(text4, 100, 60);
		text4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text4.setContentType("text/html");
		text4.setText("Stimme weder<br>zu noch<br>lehne ab");
		text4.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 4;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text4, d);

		//JTextArea text5 = new JTextArea("  5");
		JTextPane text5 = new JTextPane();
		text5.setEditable(false);
		setComponentSize(text5, 100, 60);
		text5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text5.setContentType("text/html");
		text5.setText("Stimme eher<br>zu\n");
		text5.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 5;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text5, d);

		//JTextArea text6 = new JTextArea("  6");
		JTextPane text6 = new JTextPane();
		text6.setEditable(false);
		setComponentSize(text6, 100, 60);
		text6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text6.setContentType("text/html");
		text6.setText("Stimme zu<br> <br> ");
		text6.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		text6.setAlignmentX(Component.CENTER_ALIGNMENT);
		d.gridx = 6;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text6, d);

		//JTextArea text7 = new JTextArea("  7");
		JTextPane text7 = new JTextPane();
		text7.setEditable(false);
		setComponentSize(text7, 100, 60);
		text7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		text7.setContentType("text/html");
		text7.setText("Stimme voll<br>und ganz zu<br> ");
		text7.setBorder(BorderFactory.createLineBorder(Color.white, 2));
		d.gridx = 7;
		d.weightx = 0.5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text7, d);
		answerListPanel.setBackground(returnPanel.getBackground());

		//ButtonGroup answerGroup = new ButtonGroup();
		int j = 1;
		for (String anAnswerText : answerText) {

			System.out.println(anAnswerText + ". j: " + j);
			ButtonGroup answerGroup = new ButtonGroup();
			//QuestionText = new JTextArea(anAnswerText);

			QuestionText = new JTextPane();
			QuestionText.setEditable(false);
			setComponentSize(QuestionText, 500, 30);
			QuestionText.setFont(new Font("Tahoma", Font.PLAIN, 17));
			QuestionText.setContentType("text/html");
			QuestionText.setText(anAnswerText);
			Color lightgrey = new Color(224,224,224);
			QuestionText.setBorder(whiteline);
			System.out.println("Alignment: " + QuestionText.getAlignmentY());
			QuestionText.setAlignmentY(JTextPane.BOTTOM_ALIGNMENT);
			if (j%2 != 0){
				QuestionText.setBackground(Color.white);
			}
			else {
				QuestionText.setBackground(Color.white);
			}
			d.gridx = 0;
			d.weightx = 0.5;
			d.gridy = j;
			d.anchor = GridBagConstraints.WEST;
			//questions.add(QuestionText);

			answerListPanel.add(QuestionText, d);


			if (selectMultiple) {
				answer1 = new JRadioButton("      ", false);
				answer2 = new JRadioButton("      ", false);
				answer3 = new JRadioButton("      ", false);
				answer4 = new JRadioButton("      ", false);
				answer5 = new JRadioButton("      ", false);
				answer6 = new JRadioButton("      ", false);
				answer7 = new JRadioButton("      ", false);
			} else {
				answer1 = new JRadioButton(" 1", false);
				//answer1.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer1.setBorder(oneline);
				answer1.setHorizontalTextPosition(SwingConstants.LEFT);
				answer1.setVerticalTextPosition(SwingConstants.TOP);
				answer1.setVerticalAlignment(SwingConstants.TOP);
				answer1.setForeground(Color.white);
				if (j%2 != 0){
					answer1.setBackground(Color.white);
					answer1.setForeground(Color.white);
					answer1.setOpaque(true);
				}
				else {
					answer1.setForeground(Color.white);
					answer1.setBackground(Color.white);
				}
				d.anchor = GridBagConstraints.NORTHWEST;
				d.gridx = 1;
				d.weightx = 0.5;
				d.gridy = j;
				answerGroup.add(answer1);
				answerListPanel.add(answer1, d);
				answer2 = new JRadioButton("  2", false);
				answer2.setHorizontalTextPosition(SwingConstants.LEFT);
				answer2.setVerticalTextPosition(SwingConstants.TOP);
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
				answer3 = new JRadioButton("  3", false);
				answer3.setHorizontalTextPosition(SwingConstants.LEFT);
				answer3.setVerticalTextPosition(SwingConstants.TOP);
				if (j%2 != 0){
					answer3.setBackground(Color.white);
					answer3.setForeground(Color.white);
					answer3.setOpaque(true);
				}
				else {
					answer3.setForeground(Color.white);
					answer3.setBackground(Color.white);
				}
				answerGroup.add(answer3);
				d.gridx = 3;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer3, d);
				answer4 = new JRadioButton("  4", false);
				answer4.setHorizontalTextPosition(SwingConstants.LEFT);
				answer4.setVerticalTextPosition(SwingConstants.TOP);
				if (j%2 != 0){
					answer4.setBackground(Color.white);
					answer4.setForeground(Color.white);
					answer4.setOpaque(true);
				}
				else {
					answer4.setForeground(Color.white);
					answer4.setBackground(Color.white);
				}
				answerGroup.add(answer4);
				d.gridx = 4;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer4, d);
				answer5 = new JRadioButton("  5", false);
				answer5.setHorizontalTextPosition(SwingConstants.LEFT);
				answer5.setVerticalTextPosition(SwingConstants.TOP);
				if (j%2 != 0){
					answer5.setBackground(Color.white);
					answer5.setForeground(Color.white);
					answer5.setOpaque(true);
				}
				else {
					answer5.setForeground(Color.white);
					answer5.setBackground(Color.white);
				}
				answerGroup.add(answer5);
				d.gridx = 5;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer5, d);
				answer6 = new JRadioButton("  6", false);
				answer6.setHorizontalTextPosition(SwingConstants.LEFT);
				answer6.setVerticalTextPosition(SwingConstants.TOP);
				if (j%2 != 0){
					answer6.setBackground(Color.white);
					answer6.setForeground(Color.white);
					answer6.setOpaque(true);
				}
				else {
					answer6.setForeground(Color.white);
					answer6.setBackground(Color.white);
				}
				answerGroup.add(answer6);
				d.gridx = 6;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer6, d);
				answer7 = new JRadioButton("  7", false);
				answer7.setHorizontalTextPosition(SwingConstants.LEFT);
				answer7.setVerticalTextPosition(SwingConstants.TOP);
				if (j%2 != 0){
					answer7.setBackground(Color.white);
					answer7.setForeground(Color.white);
					answer7.setOpaque(true);
				}
				else {
					answer7.setForeground(Color.white);
					answer7.setBackground(Color.white);
				}
				answerGroup.add(answer7);
				d.gridx = 7;
				d.weightx = 0.5;
				d.gridy = j;
				answerListPanel.add(answer7, d);
				answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
			}
			//answer.setFont(ANSWER_FONT);
			//questions.add(QuestionText);
			answerOption.add(answer1);
			answerOption.add(answer2);
			answerOption.add(answer3);
			answerOption.add(answer4);
			answerOption.add(answer5);
			answerOption.add(answer6);
			answerOption.add(answer7);

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
		for (String anAnswerText : answerText) {
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
