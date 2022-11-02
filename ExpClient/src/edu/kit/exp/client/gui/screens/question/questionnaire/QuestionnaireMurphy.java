package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.regex.Pattern;

/**
 * The class QuestionnaireItemNumberInput provides a QuestionnaireItem where clients can enter
 * numbers as an answer.
 *
 * @author tonda roder
 */
public class QuestionnaireMurphy extends QuestionnaireItem {

	public static final String PATTERN_FOR_VALIDATION = "[\\d]+([\\.,][\\d]+)?";
	private static final Font ANSWER_FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Font FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Font inputFONT = new Font("Tahoma", Font.PLAIN, 12);

	public static final Dimension PREFERRED_SIZE = new Dimension(300, 50);

	private ArrayList<String> answerText;
	private ArrayList<String> sliderAnswer1;

	private ArrayList<String> answerNumbers = new ArrayList<>();


	private ArrayList<String> sliderAnswer2;
	private ArrayList<JTextField> textAnswer1;
	private ArrayList<JTextField> textAnswer2;

	private ArrayList<JSlider> answerOption;

	public JScrollPane scrollFrame = new JScrollPane();

	private String inputSlider2 = "";
	private String inputSlider1 = "";
	private String inputText1 = "";
	private String inputText2 = "";

	/** The input field. */
	private JSlider inputField;
	private JTextField inputField1;

	private JTextField inputField2;

	private JTextPane text1;
	private JTextPane text2;
	private JTextPane text3;
	private JTextPane text4;
	private JTextPane text5;
	private JTextPane text6;
	private JTextPane text7;
	private JTextPane text8;
	private JTextPane text9;
	private JTextPane btext1;
	private JTextPane btext2;
	private JTextPane btext3;
	private JTextPane btext4;
	private JTextPane btext5;
	private JTextPane btext6;
	private JTextPane btext7;
	private JTextPane btext8;
	private JTextPane btext9;

	/**
	 * This constructor instantiates a new number input quiz item.
	 *
	 * @param question
	 *            A String which contains the question to be shown to a client.
	 */
	public QuestionnaireMurphy(String question) {
		super(question);
		answerText = new ArrayList<>();
		scrollFrame.getVerticalScrollBar().setValue(0);
	}

	private void setComponentSize(JComponent comp, int width, int height) {
		comp.setPreferredSize(new Dimension(width, height));
		comp.setMaximumSize(new Dimension(width, height));
		comp.setMinimumSize(new Dimension(width, height));
		scrollFrame.getVerticalScrollBar().setValue(0);

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
		scrollFrame.getVerticalScrollBar().setValue(0);
	}



	@Override
	public JPanel getAnswerPanel() {
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
		Border blackline;
		Border whiteline;
		blackline = BorderFactory.createLineBorder(Color.black);
		whiteline = BorderFactory.createLineBorder(Color.white);

		JButton button = new JButton("Erklärungen");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(returnPanel, "<html><div width='400px'><p align='justify'>Bei den folgenden Fragen werden Sie bestimmen, wie Sie bestimmte Geldbeträge zwischen sich selbst und einer anderen Person aufteilen würden. Im Folgenden werden wir diese andere Person schlicht als „Jemand“ bezeichnen. Diese/r Jemand ist eine Person, welche Sie nicht kennen und gegenseitig anonym bleiben wird. All ihre Entscheidungen sind vollumfänglich vertraulich. Für jede der folgenden Fragen, geben Sie bitte jeweils diejenige Geldverteilung an, welche Sie am meisten bevorzugen würden.<br><br>" +
								"Stellen Sie sich vor, dass Ihre Entscheidungen jeweils sowohl Geld für Sie wie auch für die andere Person generieren. Die Währung und Einheit der Geldverteilung ist dabei unerheblich.<br><br>" +
								"Es gibt keine richtigen und falschen Antworten in dieser Aufgabe, es geht hier ausschließlich um persönliche Präferenzen. Wenn Sie Ihre Entscheidung gefällt haben, markieren Sie die entsprechende Position auf der Mittellinie und schreiben Sie die entsprechende Geldverteilung in die Kästen rechts. Sie können pro Frage nur eine Position markieren."
								, "Erklärungen", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		returnPanel.add(button);

		JPanel test = new JPanel();
		setComponentSize(test, 800, 1000);
		test.setBackground(Color.white);
		test.setAutoscrolls(true);
		scrollFrame = new JScrollPane(test);
		setComponentSize(scrollFrame, 900, 400);
		scrollFrame.setBorder(whiteline);
		scrollFrame.setBackground(Color.white);
		returnPanel.add(scrollFrame);


		sliderAnswer1 = new ArrayList<>();
		sliderAnswer2 = new ArrayList<>();
		textAnswer1 = new ArrayList<>();
		textAnswer2 = new ArrayList<>();
		answerOption = new ArrayList<>();

		//setComponentSize(answerListPanel, 800, 500);


		int i = 0;

		for (String ananswerText : answerText) {

			JPanel answerListPanel = new JPanel();
			answerListPanel.setLayout(new GridBagLayout());
			//returnPanel.add(answerListPanel);
			answerListPanel.setBackground(returnPanel.getBackground());
			setComponentSize(answerListPanel, 800, 100);
			GridBagConstraints d = new GridBagConstraints();

			answerNumbers.add(ananswerText);

			String[] parts = ananswerText.split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			String part4 = parts[3];
			String part5 = parts[4];
			String part6 = parts[5];
			String part7 = parts[6];
			String part8 = parts[7];
			String part9 = parts[8];
			String part10 = parts[9];
			String part11 = parts[10];
			String part12 = parts[11];
			String part13 = parts[12];
			String part14 = parts[13];
			String part15 = parts[14];
			String part16 = parts[15];
			String part17 = parts[16];
			String part18 = parts[17];

			JTextPane LeftText;
			LeftText = new JTextPane();
			LeftText.setEditable(false);
			setComponentSize(LeftText, 100, 20);
			LeftText.setText("  Sie erhalten");
			LeftText.setBackground(Color.white);
			d.gridx = 0;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(LeftText, d);

			text1 = new JTextPane();
			text1.setEditable(false);
			setComponentSize(text1, 50, 20);
			text1.setText(part1);
			StyledDocument doc1 = text1.getStyledDocument();
			SimpleAttributeSet center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			text1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 1;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text1, d);

			text2 = new JTextPane();
			text2.setEditable(false);
			setComponentSize(text2, 50, 20);
			text2.setText(part2);
			StyledDocument doc2 = text2.getStyledDocument();
			SimpleAttributeSet center2 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
			doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
			text2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 2;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text2, d);

			text3 = new JTextPane();
			text3.setEditable(false);
			setComponentSize(text3, 50, 20);
			text3.setText(part3);
			StyledDocument doc3 = text3.getStyledDocument();
			SimpleAttributeSet center3 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center3, StyleConstants.ALIGN_CENTER);
			doc3.setParagraphAttributes(0, doc3.getLength(), center3, false);
			text3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 3;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text3, d);

			text4 = new JTextPane();
			text4.setEditable(false);
			setComponentSize(text4, 50, 20);
			text4.setText(part4);
			StyledDocument doc4 = text4.getStyledDocument();
			SimpleAttributeSet center4 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
			doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);
			text4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 4;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text4, d);

			text5 = new JTextPane();
			text5.setEditable(false);
			setComponentSize(text5, 50, 20);
			text5.setText(part5);
			StyledDocument doc5 = text5.getStyledDocument();
			SimpleAttributeSet center5 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center5, StyleConstants.ALIGN_CENTER);
			doc5.setParagraphAttributes(0, doc5.getLength(), center5, false);
			text5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 5;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text5, d);

			text6 = new JTextPane();
			text6.setEditable(false);
			setComponentSize(text6, 50, 20);
			text6.setText(part6);
			StyledDocument doc6 = text6.getStyledDocument();
			SimpleAttributeSet center6 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center6, StyleConstants.ALIGN_CENTER);
			doc6.setParagraphAttributes(0, doc6.getLength(), center6, false);
			text6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 6;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text6, d);

			text7 = new JTextPane();
			text7.setEditable(false);
			setComponentSize(text7, 50, 20);
			text7.setText(part7);
			StyledDocument doc7 = text7.getStyledDocument();
			SimpleAttributeSet center7 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center7, StyleConstants.ALIGN_CENTER);
			doc7.setParagraphAttributes(0, doc7.getLength(), center7, false);
			text7.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 7;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text7, d);

			text8 = new JTextPane();
			text8.setEditable(false);
			setComponentSize(text8, 50, 20);
			text8.setText(part8);
			StyledDocument doc8 = text8.getStyledDocument();
			SimpleAttributeSet center8 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center8, StyleConstants.ALIGN_CENTER);
			doc8.setParagraphAttributes(0, doc8.getLength(), center8, false);
			text8.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 8;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text8, d);

			text9 = new JTextPane();
			text9.setEditable(false);
			setComponentSize(text9, 50, 20);
			text9.setText(part9);
			StyledDocument doc9 = text9.getStyledDocument();
			SimpleAttributeSet center9 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center9, StyleConstants.ALIGN_CENTER);
			doc9.setParagraphAttributes(0, doc9.getLength(), center9, false);
			text9.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 9;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text9, d);

			JTextPane text10 = new JTextPane();
			text10.setEditable(false);
			setComponentSize(text10, 60, 20);
			text10.setText("Sie: ");
			StyledDocument doc10 = text10.getStyledDocument();
			SimpleAttributeSet center10 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
			doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
			d.gridx = 10;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(text10, d);

			inputField1 = new JTextField();
			inputField1.setFont(inputFONT);
			inputField1.setHorizontalAlignment(JTextField.CENTER);
			setComponentSize(inputField1, 60, 20);
			inputField1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 11;
			d.gridy = i;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(inputField1, d);


			inputField = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
			inputField.setBackground(Color.white);
			/*Dictionary map = new Hashtable();
			map.put( new Integer(0), new JLabel("Gering") );
			map.put( new Integer(11), new JLabel("Hoch") );*/
			inputField.setMajorTickSpacing(1);
			inputField.setPaintTicks(false);
			inputField.setSnapToTicks(true);
			inputField.setPaintLabels(false);
			setComponentSize(inputField, 430, 50);
			d.insets = new Insets(0, 10, 0, 0);
			d.gridx = 1;
			d.gridy = i + 1;
			d.weightx = 1;
			d.gridwidth = 10;
			answerListPanel.add(inputField, d);

			JTextPane RightText;
			RightText = new JTextPane();
			RightText.setEditable(false);
			setComponentSize(RightText, 100, 20);
			RightText.setText("  Jemand erhält");
			RightText.setBackground(Color.white);
			d.gridx = 0;
			d.insets = new Insets(0, 0, 0, 0);
			d.weightx = 0.5;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(RightText, d);

			btext1 = new JTextPane();
			btext1.setEditable(false);
			setComponentSize(btext1, 50, 20);
			btext1.setText(part10);
			doc1 = btext1.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 1;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext1, d);

			btext2 = new JTextPane();
			btext2.setEditable(false);
			setComponentSize(btext2, 50, 20);
			btext2.setText(part11);
			doc1 = btext2.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 2;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext2, d);

			btext3 = new JTextPane();
			btext3.setEditable(false);
			setComponentSize(btext3, 50, 20);
			btext3.setText(part12);
			doc1 = btext3.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 3;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext3, d);

			btext4 = new JTextPane();
			btext4.setEditable(false);
			setComponentSize(btext4, 50, 20);
			btext4.setText(part13);
			doc1 = btext4.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 4;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext4, d);

			btext5 = new JTextPane();
			btext5.setEditable(false);
			setComponentSize(btext5, 50, 20);
			btext5.setText(part14);
			doc1 = btext5.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 5;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext5, d);

			btext6 = new JTextPane();
			btext6.setEditable(false);
			setComponentSize(btext6, 50, 20);
			btext6.setText(part15);
			doc1 = btext6.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 6;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext6, d);

			btext7 = new JTextPane();
			btext7.setEditable(false);
			setComponentSize(btext7, 50, 20);
			btext7.setText(part16);
			doc1 = btext7.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext7.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 7;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext7, d);

			btext8 = new JTextPane();
			btext8.setEditable(false);
			setComponentSize(btext8, 50, 20);
			btext8.setText(part17);
			doc1 = btext8.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext8.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 8;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext8, d);

			btext9 = new JTextPane();
			btext9.setEditable(false);
			setComponentSize(btext9, 50, 20);
			btext9.setText(part18);
			doc1 = btext9.getStyledDocument();
			center1 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
			doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
			btext9.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			d.gridx = 9;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext9, d);

			JTextPane btext10 = new JTextPane();
			btext10.setEditable(false);
			setComponentSize(btext10, 60, 20);
			btext10.setText("Jemand: ");
			doc10 = btext10.getStyledDocument();
			center10 = new SimpleAttributeSet();
			StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
			doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
			d.gridx = 10;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(btext10, d);


			inputField2 = new JTextField();
			inputField2.setFont(inputFONT);
			inputField2.setHorizontalAlignment(JTextField.CENTER);
			inputField2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
			setComponentSize(inputField2, 60, 20);
			d.gridx = 11;
			d.gridy = i + 2;
			d.anchor = GridBagConstraints.WEST;
			answerListPanel.add(inputField2, d);

			JPanel box = new JPanel();
			setComponentSize(box, 600, 40);
			box.setOpaque(false);
			box.setBackground(Color.white);
			d.gridx = 0;
			d.gridy = i + 3;
			d.gridwidth = 12;
			//returnPanel.add(box);
			test.add(box);

			answerListPanel.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

			i = i + 4;
			answerOption.add(inputField);


			//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
			inputText1 = String.valueOf(inputField1.getText());
			inputText2 = String.valueOf(inputField2.getText());

			textAnswer1.add(inputField1);
			textAnswer2.add(inputField2);
			test.add(answerListPanel);

		}

		final int[] x = {0};


		returnPanel.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {

			}

			@Override
			public void mouseMoved(MouseEvent e) {
			while (x[0] ==0) {
				setVertical(0);
				x[0]++;
			}
		}}
		);



		scrollFrame.getVerticalScrollBar().setValue(0);

		return returnPanel;


	}


	public void setVertical(int i){
		scrollFrame.getVerticalScrollBar().setValue(i);
	}

	@Override
	public boolean isValid() {
		scrollFrame.getVerticalScrollBar().setValue(0);

		int j = 0;
		for (int i=0; i < textAnswer2.size(); i++) {

			String[] parts = answerNumbers.get(i).split("/");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			String part4 = parts[3];
			String part5 = parts[4];
			String part6 = parts[5];
			String part7 = parts[6];
			String part8 = parts[7];
			String part9 = parts[8];
			String part10 = parts[9];
			String part11 = parts[10];
			String part12 = parts[11];
			String part13 = parts[12];
			String part14 = parts[13];
			String part15 = parts[14];
			String part16 = parts[15];
			String part17 = parts[16];
			String part18 = parts[17];

			switch (answerOption.get(i).getValue()) {
				case 1:
					sliderAnswer1.add(part1);
					break;
				case 2:
					sliderAnswer1.add(part2);
					break;
				case 3:
					sliderAnswer1.add(part3);
					break;
				case 4:
					sliderAnswer1.add(part4);
					break;
				case 5:
					sliderAnswer1.add(part5);
					break;
				case 6:
					sliderAnswer1.add(part6);
					break;
				case 7:
					sliderAnswer1.add(part7);
					break;
				case 8:
					sliderAnswer1.add(part8);
					break;
				case 9:
					sliderAnswer1.add(part9);
					break;
			}

			switch (answerOption.get(i).getValue()) {
				case 1:
					sliderAnswer2.add(part10);
					break;
				case 2:
					sliderAnswer2.add(part11);
					break;
				case 3:
					sliderAnswer2.add(part12);
					break;
				case 4:
					sliderAnswer2.add(part13);
					break;
				case 5:
					sliderAnswer2.add(part14);
					break;
				case 6:
					sliderAnswer2.add(part15);
					break;
				case 7:
					sliderAnswer2.add(part16);
					break;
				case 8:
					sliderAnswer2.add(part17);
					break;
				case 9:
					sliderAnswer2.add(part18);
					break;
			}

			if (sliderAnswer1.get(i).equals(textAnswer1.get(i).getText()) && (sliderAnswer2.get(i).equals(textAnswer2.get(i).getText()))) {
				j++;
			}
		}
		for (int i=0; i < textAnswer2.size(); i++) {
			if (sliderAnswer1.get(i).equals(textAnswer1.get(i).getText()) && (sliderAnswer2.get(i).equals(textAnswer2.get(i).getText())) && j==textAnswer2.size()) {

				return true;
			}
		}

		return false;

	}

	public static final String SPLIT_SIGN = ";";

	@Override
	public String getAnswer() {
		String answer = "";
		int selectedCounter = 0;
		for (JSlider anAnswerOption : answerOption) {
			if (anAnswerOption.isShowing()) {
				if (selectedCounter == 0) {
					answer = String.valueOf(anAnswerOption.getValue());
				} else {
					answer += (SPLIT_SIGN + String.valueOf(anAnswerOption.getValue()));
				}
				selectedCounter++;
			}
		}
		return answer;
	}


	public void setVertical(){
		scrollFrame.getVerticalScrollBar().setValue(0);
	}
}
