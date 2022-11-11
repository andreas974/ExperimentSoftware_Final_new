package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

/**
 * The class QuestionnaireItemNumberInput provides a QuestionnaireItem where clients can enter
 * numbers as an answer.
 *
 * @author tonda roder
 */
public class QuestionnaireMurphy_v2 extends QuestionnaireItem {

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
	private JSlider inputField1_1;
	private JTextField textinput1_1;

	private JTextField textinput2_1;

	private JTextPane text1_1;
	private JTextPane text2_1;
	private JTextPane text3_1;
	private JTextPane text4_1;
	private JTextPane text5_1;
	private JTextPane text6_1;
	private JTextPane text7_1;
	private JTextPane text8_1;
	private JTextPane text9_1;
	private JTextPane btext1_1;
	private JTextPane btext2_1;
	private JTextPane btext3_1;
	private JTextPane btext4_1;
	private JTextPane btext5_1;
	private JTextPane btext6_1;
	private JTextPane btext7_1;
	private JTextPane btext8_1;
	private JTextPane btext9_1;

	private JSlider inputField1_2;
	private JTextField textinput1_2;

	private JTextField textinput2_2;

	private JTextPane text1_2;
	private JTextPane text2_2;
	private JTextPane text3_2;
	private JTextPane text4_2;
	private JTextPane text5_2;
	private JTextPane text6_2;
	private JTextPane text7_2;
	private JTextPane text8_2;
	private JTextPane text9_2;
	private JTextPane btext1_2;
	private JTextPane btext2_2;
	private JTextPane btext3_2;
	private JTextPane btext4_2;
	private JTextPane btext5_2;
	private JTextPane btext6_2;
	private JTextPane btext7_2;
	private JTextPane btext8_2;
	private JTextPane btext9_2;

	//third Panel

	private JSlider inputField1_3;
	private JTextField textinput1_3;

	private JTextField textinput2_3;

	private JTextPane text1_3;
	private JTextPane text2_3;
	private JTextPane text3_3;
	private JTextPane text4_3;
	private JTextPane text5_3;
	private JTextPane text6_3;
	private JTextPane text7_3;
	private JTextPane text8_3;
	private JTextPane text9_3;
	private JTextPane btext1_3;
	private JTextPane btext2_3;
	private JTextPane btext3_3;
	private JTextPane btext4_3;
	private JTextPane btext5_3;
	private JTextPane btext6_3;
	private JTextPane btext7_3;
	private JTextPane btext8_3;
	private JTextPane btext9_3;

	//Fourth Panel

	private JSlider inputField1_4;
	private JTextField textinput1_4;

	private JTextField textinput2_4;

	private JTextPane text1_4;
	private JTextPane text2_4;
	private JTextPane text3_4;
	private JTextPane text4_4;
	private JTextPane text5_4;
	private JTextPane text6_4;
	private JTextPane text7_4;
	private JTextPane text8_4;
	private JTextPane text9_4;
	private JTextPane btext1_4;
	private JTextPane btext2_4;
	private JTextPane btext3_4;
	private JTextPane btext4_4;
	private JTextPane btext5_4;
	private JTextPane btext6_4;
	private JTextPane btext7_4;
	private JTextPane btext8_4;
	private JTextPane btext9_4;

	//Fifth Panel

	private JSlider inputField1_5;
	private JTextField textinput1_5;

	private JTextField textinput2_5;

	private JTextPane text1_5;
	private JTextPane text2_5;
	private JTextPane text3_5;
	private JTextPane text4_5;
	private JTextPane text5_5;
	private JTextPane text6_5;
	private JTextPane text7_5;
	private JTextPane text8_5;
	private JTextPane text9_5;
	private JTextPane btext1_5;
	private JTextPane btext2_5;
	private JTextPane btext3_5;
	private JTextPane btext4_5;
	private JTextPane btext5_5;
	private JTextPane btext6_5;
	private JTextPane btext7_5;
	private JTextPane btext8_5;
	private JTextPane btext9_5;

	//Sixth Panel

	private JSlider inputField1_6;
	private JTextField textinput1_6;

	private JTextField textinput2_6;

	private JTextPane text1_6;
	private JTextPane text2_6;
	private JTextPane text3_6;
	private JTextPane text4_6;
	private JTextPane text5_6;
	private JTextPane text6_6;
	private JTextPane text7_6;
	private JTextPane text8_6;
	private JTextPane text9_6;
	private JTextPane btext1_6;
	private JTextPane btext2_6;
	private JTextPane btext3_6;
	private JTextPane btext4_6;
	private JTextPane btext5_6;
	private JTextPane btext6_6;
	private JTextPane btext7_6;
	private JTextPane btext8_6;
	private JTextPane btext9_6;


	/**
	 * This constructor instantiates a new number input quiz item.
	 *
	 * @param question
	 *            A String which contains the question to be shown to a client.
	 */
	public QuestionnaireMurphy_v2(String question) {
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
		test.setLayout(new BoxLayout(test, BoxLayout.Y_AXIS));

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


		//First Panel

		JPanel answerListPanel1 = new JPanel();
		answerListPanel1.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel1);
		answerListPanel1.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel1, 800, 100);
		GridBagConstraints d = new GridBagConstraints();

		JTextPane LeftText1;
		LeftText1 = new JTextPane();
		LeftText1.setEditable(false);
		setComponentSize(LeftText1, 100, 20);
		LeftText1.setText("  Sie erhalten");
		LeftText1.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(LeftText1, d);

		text1_1 = new JTextPane();
		text1_1.setEditable(false);
		setComponentSize(text1_1, 50, 20);
		text1_1.setText("85");
		StyledDocument doc1 = text1_1.getStyledDocument();
		SimpleAttributeSet center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text1_1, d);

		text2_1 = new JTextPane();
		text2_1.setEditable(false);
		setComponentSize(text2_1, 50, 20);
		text2_1.setText("85");
		StyledDocument doc2 = text2_1.getStyledDocument();
		SimpleAttributeSet center2 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
		doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);
		text2_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text2_1, d);

		text3_1 = new JTextPane();
		text3_1.setEditable(false);
		setComponentSize(text3_1, 50, 20);
		text3_1.setText("85");
		StyledDocument doc3 = text3_1.getStyledDocument();
		SimpleAttributeSet center3 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center3, StyleConstants.ALIGN_CENTER);
		doc3.setParagraphAttributes(0, doc3.getLength(), center3, false);
		text3_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text3_1, d);

		text4_1 = new JTextPane();
		text4_1.setEditable(false);
		setComponentSize(text4_1, 50, 20);
		text4_1.setText("85");
		StyledDocument doc4 = text4_1.getStyledDocument();
		SimpleAttributeSet center4 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center4, StyleConstants.ALIGN_CENTER);
		doc4.setParagraphAttributes(0, doc4.getLength(), center4, false);
		text4_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text4_1, d);

		text5_1 = new JTextPane();
		text5_1.setEditable(false);
		setComponentSize(text5_1, 50, 20);
		text5_1.setText("85");
		StyledDocument doc5 = text5_1.getStyledDocument();
		SimpleAttributeSet center5 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center5, StyleConstants.ALIGN_CENTER);
		doc5.setParagraphAttributes(0, doc5.getLength(), center5, false);
		text5_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text5_1, d);

		text6_1 = new JTextPane();
		text6_1.setEditable(false);
		setComponentSize(text6_1, 50, 20);
		text6_1.setText("85");
		StyledDocument doc6 = text6_1.getStyledDocument();
		SimpleAttributeSet center6 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center6, StyleConstants.ALIGN_CENTER);
		doc6.setParagraphAttributes(0, doc6.getLength(), center6, false);
		text6_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text6_1, d);

		text7_1 = new JTextPane();
		text7_1.setEditable(false);
		setComponentSize(text7_1, 50, 20);
		text7_1.setText("85");
		StyledDocument doc7 = text7_1.getStyledDocument();
		SimpleAttributeSet center7 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center7, StyleConstants.ALIGN_CENTER);
		doc7.setParagraphAttributes(0, doc7.getLength(), center7, false);
		text7_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text7_1, d);

		text8_1 = new JTextPane();
		text8_1.setEditable(false);
		setComponentSize(text8_1, 50, 20);
		text8_1.setText("85");
		StyledDocument doc8 = text8_1.getStyledDocument();
		SimpleAttributeSet center8 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center8, StyleConstants.ALIGN_CENTER);
		doc8.setParagraphAttributes(0, doc8.getLength(), center8, false);
		text8_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text8_1, d);

		text9_1 = new JTextPane();
		text9_1.setEditable(false);
		setComponentSize(text9_1, 50, 20);
		text9_1.setText("85");
		StyledDocument doc9 = text9_1.getStyledDocument();
		SimpleAttributeSet center9 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_CENTER);
		doc9.setParagraphAttributes(0, doc9.getLength(), center9, false);
		text9_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text9_1, d);

		JTextPane text10_1 = new JTextPane();
		text10_1.setEditable(false);
		setComponentSize(text10_1, 60, 20);
		text10_1.setText("Sie: ");
		StyledDocument doc10 = text10_1.getStyledDocument();
		SimpleAttributeSet center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(text10_1, d);

		textinput1_1 = new JTextField();
		textinput1_1.setFont(inputFONT);
		textinput1_1.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_1, 60, 20);
		textinput1_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(textinput1_1, d);


		inputField1_1 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_1.setBackground(Color.white);
		inputField1_1.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_1.setMajorTickSpacing(1);
		inputField1_1.setPaintTicks(false);
		inputField1_1.setSnapToTicks(true);
		inputField1_1.setPaintLabels(false);
		setComponentSize(inputField1_1, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel1.add(inputField1_1, d);

		JTextPane RightText1;
		RightText1 = new JTextPane();
		RightText1.setEditable(false);
		setComponentSize(RightText1, 100, 20);
		RightText1.setText("  Jemand erhält");
		RightText1.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(RightText1, d);

		btext1_1 = new JTextPane();
		btext1_1.setEditable(false);
		setComponentSize(btext1_1, 50, 20);
		btext1_1.setText("85");
		doc1 = btext1_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext1_1, d);

		btext2_1 = new JTextPane();
		btext2_1.setEditable(false);
		setComponentSize(btext2_1, 50, 20);
		btext2_1.setText("76");
		doc1 = btext2_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext2_1, d);

		btext3_1 = new JTextPane();
		btext3_1.setEditable(false);
		setComponentSize(btext3_1, 50, 20);
		btext3_1.setText("68");
		doc1 = btext3_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext3_1, d);

		btext4_1 = new JTextPane();
		btext4_1.setEditable(false);
		setComponentSize(btext4_1, 50, 20);
		btext4_1.setText("59");
		doc1 = btext4_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext4_1, d);

		btext5_1 = new JTextPane();
		btext5_1.setEditable(false);
		setComponentSize(btext5_1, 50, 20);
		btext5_1.setText("50");
		doc1 = btext5_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext5_1, d);

		btext6_1 = new JTextPane();
		btext6_1.setEditable(false);
		setComponentSize(btext6_1, 50, 20);
		btext6_1.setText("41");
		doc1 = btext6_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext6_1, d);

		btext7_1 = new JTextPane();
		btext7_1.setEditable(false);
		setComponentSize(btext7_1, 50, 20);
		btext7_1.setText("33");
		doc1 = btext7_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext7_1, d);

		btext8_1 = new JTextPane();
		btext8_1.setEditable(false);
		setComponentSize(btext8_1, 50, 20);
		btext8_1.setText("24");
		doc1 = btext8_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext8_1, d);

		btext9_1 = new JTextPane();
		btext9_1.setEditable(false);
		setComponentSize(btext9_1, 50, 20);
		btext9_1.setText("15");
		doc1 = btext9_1.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext9_1, d);

		JTextPane btext10_1 = new JTextPane();
		btext10_1.setEditable(false);
		setComponentSize(btext10_1, 60, 20);
		btext10_1.setText("Jemand: ");
		doc10 = btext10_1.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(btext10_1, d);


		textinput2_1 = new JTextField();
		textinput2_1.setFont(inputFONT);
		textinput2_1.setHorizontalAlignment(JTextField.CENTER);
		textinput2_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_1, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel1.add(textinput2_1, d);


		answerListPanel1.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

		answerOption.add(inputField1_1);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_1.getText());
		inputText2 = String.valueOf(textinput2_1.getText());

		textAnswer1.add(textinput1_1);
		textAnswer2.add(textinput2_1);
		test.add(answerListPanel1);


		JPanel box_1 = new JPanel();
		setComponentSize(box_1, 600, 40);
		box_1.setOpaque(false);
		box_1.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_1);
			

		//Second Panel

		JPanel answerListPanel2 = new JPanel();
		answerListPanel2.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel2);
		answerListPanel2.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel2, 800, 100);
		d = new GridBagConstraints();

		JTextPane LeftText2;
		LeftText2 = new JTextPane();
		LeftText2.setEditable(false);
		setComponentSize(LeftText2, 100, 20);
		LeftText2.setText("  Sie erhalten");
		LeftText2.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(LeftText2, d);

		text1_2 = new JTextPane();
		text1_2.setEditable(false);
		setComponentSize(text1_2, 50, 20);
		text1_2.setText("85");
		doc1 = text1_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text1_2, d);

		text2_2 = new JTextPane();
		text2_2.setEditable(false);
		setComponentSize(text2_2, 50, 20);
		text2_2.setText("87");
		doc1 = text2_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text2_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text2_2, d);

		text3_2 = new JTextPane();
		text3_2.setEditable(false);
		setComponentSize(text3_2, 50, 20);
		text3_2.setText("89");
		doc1 = text3_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text3_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text3_2, d);

		text4_2 = new JTextPane();
		text4_2.setEditable(false);
		setComponentSize(text4_2, 50, 20);
		text4_2.setText("91");
		doc1 = text4_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text4_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text4_2, d);

		text5_2 = new JTextPane();
		text5_2.setEditable(false);
		setComponentSize(text5_2, 50, 20);
		text5_2.setText("93");
		doc1 = text5_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text5_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text5_2, d);

		text6_2 = new JTextPane();
		text6_2.setEditable(false);
		setComponentSize(text6_2, 50, 20);
		text6_2.setText("94");
		doc1 = text6_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text6_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text6_2, d);

		text7_2 = new JTextPane();
		text7_2.setEditable(false);
		setComponentSize(text7_2, 50, 20);
		text7_2.setText("96");
		doc1 = text7_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text7_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text7_2, d);

		text8_2 = new JTextPane();
		text8_2.setEditable(false);
		setComponentSize(text8_2, 50, 20);
		text8_2.setText("98");
		doc1 = text8_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text8_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text8_2, d);

		text9_2 = new JTextPane();
		text9_2.setEditable(false);
		setComponentSize(text9_2, 50, 20);
		text9_2.setText("100");
		doc1 = text9_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text9_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text9_2, d);

		JTextPane text10_2 = new JTextPane();
		text10_2.setEditable(false);
		setComponentSize(text10_2, 60, 20);
		text10_2.setText("Sie: ");
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(text10_2, d);

		textinput1_2 = new JTextField();
		textinput1_2.setFont(inputFONT);
		textinput1_2.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_2, 60, 20);
		textinput1_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(textinput1_2, d);


		inputField1_2 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_2.setBackground(Color.white);
		inputField1_2.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_2.setMajorTickSpacing(1);
		inputField1_2.setPaintTicks(false);
		inputField1_2.setSnapToTicks(true);
		inputField1_2.setPaintLabels(false);
		setComponentSize(inputField1_2, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel2.add(inputField1_2, d);

		JTextPane RightText2;
		RightText2 = new JTextPane();
		RightText2.setEditable(false);
		setComponentSize(RightText2, 100, 20);
		RightText2.setText("  Jemand erhält");
		RightText2.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(RightText2, d);

		btext1_2 = new JTextPane();
		btext1_2.setEditable(false);
		setComponentSize(btext1_2, 50, 20);
		btext1_2.setText("15");
		doc1 = btext1_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext1_2, d);

		btext2_2 = new JTextPane();
		btext2_2.setEditable(false);
		setComponentSize(btext2_2, 50, 20);
		btext2_2.setText("19");
		doc1 = btext2_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext2_2, d);

		btext3_2 = new JTextPane();
		btext3_2.setEditable(false);
		setComponentSize(btext3_2, 50, 20);
		btext3_2.setText("24");
		doc1 = btext3_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext3_2, d);

		btext4_2 = new JTextPane();
		btext4_2.setEditable(false);
		setComponentSize(btext4_2, 50, 20);
		btext4_2.setText("28");
		doc1 = btext4_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext4_2, d);

		btext5_2 = new JTextPane();
		btext5_2.setEditable(false);
		setComponentSize(btext5_2, 50, 20);
		btext5_2.setText("33");
		doc1 = btext5_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext5_2, d);

		btext6_2 = new JTextPane();
		btext6_2.setEditable(false);
		setComponentSize(btext6_2, 50, 20);
		btext6_2.setText("37");
		doc1 = btext6_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext6_2, d);

		btext7_2 = new JTextPane();
		btext7_2.setEditable(false);
		setComponentSize(btext7_2, 50, 20);
		btext7_2.setText("41");
		doc1 = btext7_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext7_2, d);

		btext8_2 = new JTextPane();
		btext8_2.setEditable(false);
		setComponentSize(btext8_2, 50, 20);
		btext8_2.setText("46");
		doc1 = btext8_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext8_2, d);

		btext9_2 = new JTextPane();
		btext9_2.setEditable(false);
		setComponentSize(btext9_2, 50, 20);
		btext9_2.setText("50");
		doc1 = btext9_2.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext9_2, d);

		JTextPane btext10_2 = new JTextPane();
		btext10_2.setEditable(false);
		setComponentSize(btext10_2, 60, 20);
		btext10_2.setText("Jemand: ");
		doc10 = btext10_2.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(btext10_2, d);


		textinput2_2 = new JTextField();
		textinput2_2.setFont(inputFONT);
		textinput2_2.setHorizontalAlignment(JTextField.CENTER);
		textinput2_2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_2, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel2.add(textinput2_2, d);


		answerListPanel2.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

		answerOption.add(inputField1_2);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_2.getText());
		inputText2 = String.valueOf(textinput2_2.getText());

		textAnswer1.add(textinput1_2);
		textAnswer2.add(textinput2_2);
		test.add(answerListPanel2);


		JPanel box_2 = new JPanel();
		setComponentSize(box_2, 600, 40);
		box_2.setOpaque(false);
		box_2.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_2);

		//Third Panel

		JPanel answerListPanel3 = new JPanel();
		answerListPanel3.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel3);
		answerListPanel3.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel3, 800, 100);
		d = new GridBagConstraints();

		JTextPane LeftText3;
		LeftText3 = new JTextPane();
		LeftText3.setEditable(false);
		setComponentSize(LeftText3, 100, 20);
		LeftText3.setText("  Sie erhalten");
		LeftText3.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(LeftText3, d);

		text1_3 = new JTextPane();
		text1_3.setEditable(false);
		setComponentSize(text1_3, 50, 20);
		text1_3.setText("50");
		doc1 = text1_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text1_3, d);

		text2_3 = new JTextPane();
		text2_3.setEditable(false);
		setComponentSize(text2_3, 50, 20);
		text2_3.setText("54");
		doc1 = text2_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text2_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text2_3, d);

		text3_3 = new JTextPane();
		text3_3.setEditable(false);
		setComponentSize(text3_3, 50, 20);
		text3_3.setText("59");
		doc1 = text3_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text3_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text3_3, d);

		text4_3 = new JTextPane();
		text4_3.setEditable(false);
		setComponentSize(text4_3, 50, 20);
		text4_3.setText("63");
		doc1 = text4_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text4_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text4_3, d);

		text5_3 = new JTextPane();
		text5_3.setEditable(false);
		setComponentSize(text5_3, 50, 20);
		text5_3.setText("68");
		doc1 = text5_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text5_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text5_3, d);

		text6_3 = new JTextPane();
		text6_3.setEditable(false);
		setComponentSize(text6_3, 50, 20);
		text6_3.setText("72");
		doc1 = text6_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text6_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text6_3, d);

		text7_3 = new JTextPane();
		text7_3.setEditable(false);
		setComponentSize(text7_3, 50, 20);
		text7_3.setText("76");
		doc1 = text7_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text7_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text7_3, d);

		text8_3 = new JTextPane();
		text8_3.setEditable(false);
		setComponentSize(text8_3, 50, 20);
		text8_3.setText("81");
		doc1 = text8_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text8_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text8_3, d);

		text9_3 = new JTextPane();
		text9_3.setEditable(false);
		setComponentSize(text9_3, 50, 20);
		text9_3.setText("85");
		doc1 = text9_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text9_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text9_3, d);

		JTextPane text10_3 = new JTextPane();
		text10_3.setEditable(false);
		setComponentSize(text10_3, 60, 20);
		text10_3.setText("Sie: ");
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(text10_3, d);

		textinput1_3 = new JTextField();
		textinput1_3.setFont(inputFONT);
		textinput1_3.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_3, 60, 20);
		textinput1_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(textinput1_3, d);


		inputField1_3 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_3.setBackground(Color.white);
		inputField1_3.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_3.setMajorTickSpacing(1);
		inputField1_3.setPaintTicks(false);
		inputField1_3.setSnapToTicks(true);
		inputField1_3.setPaintLabels(false);
		setComponentSize(inputField1_3, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel3.add(inputField1_3, d);

		JTextPane RightText3;
		RightText3 = new JTextPane();
		RightText3.setEditable(false);
		setComponentSize(RightText2, 100, 20);
		RightText3.setText("  Jemand erhält");
		RightText3.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(RightText3, d);

		btext1_3 = new JTextPane();
		btext1_3.setEditable(false);
		setComponentSize(btext1_3, 50, 20);
		btext1_3.setText("100");
		doc1 = btext1_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext1_3, d);

		btext2_3 = new JTextPane();
		btext2_3.setEditable(false);
		setComponentSize(btext2_3, 50, 20);
		btext2_3.setText("98");
		doc1 = btext2_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext2_3, d);

		btext3_3 = new JTextPane();
		btext3_3.setEditable(false);
		setComponentSize(btext3_3, 50, 20);
		btext3_3.setText("96");
		doc1 = btext3_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext3_3, d);

		btext4_3 = new JTextPane();
		btext4_3.setEditable(false);
		setComponentSize(btext4_3, 50, 20);
		btext4_3.setText("94");
		doc1 = btext4_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext4_3, d);

		btext5_3 = new JTextPane();
		btext5_3.setEditable(false);
		setComponentSize(btext5_3, 50, 20);
		btext5_3.setText("93");
		doc1 = btext5_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext5_3, d);

		btext6_3 = new JTextPane();
		btext6_3.setEditable(false);
		setComponentSize(btext6_3, 50, 20);
		btext6_3.setText("91");
		doc1 = btext6_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext6_3, d);

		btext7_3 = new JTextPane();
		btext7_3.setEditable(false);
		setComponentSize(btext7_3, 50, 20);
		btext7_3.setText("89");
		doc1 = btext7_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext7_3, d);

		btext8_3 = new JTextPane();
		btext8_3.setEditable(false);
		setComponentSize(btext8_3, 50, 20);
		btext8_3.setText("87");
		doc1 = btext8_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext8_3, d);

		btext9_3 = new JTextPane();
		btext9_3.setEditable(false);
		setComponentSize(btext9_3, 50, 20);
		btext9_3.setText("85");
		doc1 = btext9_3.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext9_3, d);

		JTextPane btext10_3 = new JTextPane();
		btext10_3.setEditable(false);
		setComponentSize(btext10_3, 60, 20);
		btext10_3.setText("Jemand: ");
		doc10 = btext10_3.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(btext10_3, d);


		textinput2_3 = new JTextField();
		textinput2_3.setFont(inputFONT);
		textinput2_3.setHorizontalAlignment(JTextField.CENTER);
		textinput2_3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_3, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel3.add(textinput2_3, d);
		answerListPanel3.setBorder(BorderFactory.createLineBorder(Color.gray, 2));



		answerOption.add(inputField1_3);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_3.getText());
		inputText2 = String.valueOf(textinput2_3.getText());

		textAnswer1.add(textinput1_3);
		textAnswer2.add(textinput2_2);
		test.add(answerListPanel3);

		JPanel box_3 = new JPanel();
		setComponentSize(box_3, 600, 40);
		box_3.setOpaque(false);
		box_3.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_3);

		//Fourth Panel

		JPanel answerListPanel4 = new JPanel();
		answerListPanel4.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel4);
		answerListPanel4.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel4, 800, 100);
		d = new GridBagConstraints();

		JTextPane LeftText4;
		LeftText4 = new JTextPane();
		LeftText4.setEditable(false);
		setComponentSize(LeftText4, 100, 20);
		LeftText4.setText("  Sie erhalten");
		LeftText4.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(LeftText4, d);

		text1_4 = new JTextPane();
		text1_4.setEditable(false);
		setComponentSize(text1_4, 50, 20);
		text1_4.setText("50");
		doc1 = text1_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text1_4, d);

		text2_4 = new JTextPane();
		text2_4.setEditable(false);
		setComponentSize(text2_4, 50, 20);
		text2_4.setText("54");
		doc1 = text2_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text2_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text2_4, d);

		text3_4 = new JTextPane();
		text3_4.setEditable(false);
		setComponentSize(text3_4, 50, 20);
		text3_4.setText("59");
		doc1 = text3_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text3_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text3_4, d);

		text4_4 = new JTextPane();
		text4_4.setEditable(false);
		setComponentSize(text4_4, 50, 20);
		text4_4.setText("63");
		doc1 = text4_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text4_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text4_4, d);

		text5_4 = new JTextPane();
		text5_4.setEditable(false);
		setComponentSize(text5_4, 50, 20);
		text5_4.setText("68");
		doc1 = text5_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text5_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text5_4, d);

		text6_4 = new JTextPane();
		text6_4.setEditable(false);
		setComponentSize(text6_4, 50, 20);
		text6_4.setText("72");
		doc1 = text6_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text6_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text6_4, d);

		text7_4 = new JTextPane();
		text7_4.setEditable(false);
		setComponentSize(text7_4, 50, 20);
		text7_4.setText("76");
		doc1 = text7_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text7_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text7_4, d);

		text8_4 = new JTextPane();
		text8_4.setEditable(false);
		setComponentSize(text8_4, 50, 20);
		text8_4.setText("81");
		doc1 = text8_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text8_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text8_4, d);

		text9_4 = new JTextPane();
		text9_4.setEditable(false);
		setComponentSize(text9_4, 50, 20);
		text9_4.setText("85");
		doc1 = text9_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text9_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text9_4, d);

		JTextPane text10_4 = new JTextPane();
		text10_4.setEditable(false);
		setComponentSize(text10_4, 60, 20);
		text10_4.setText("Sie: ");
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(text10_4, d);

		textinput1_4 = new JTextField();
		textinput1_4.setFont(inputFONT);
		textinput1_4.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_4, 60, 20);
		textinput1_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(textinput1_4, d);


		inputField1_4 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_4.setBackground(Color.white);
		inputField1_4.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_4.setMajorTickSpacing(1);
		inputField1_4.setPaintTicks(false);
		inputField1_4.setSnapToTicks(true);
		inputField1_4.setPaintLabels(false);
		setComponentSize(inputField1_4, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel4.add(inputField1_4, d);

		JTextPane RightText4;
		RightText4 = new JTextPane();
		RightText4.setEditable(false);
		setComponentSize(RightText2, 100, 20);
		RightText4.setText("  Jemand erhält");
		RightText4.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(RightText4, d);

		btext1_4 = new JTextPane();
		btext1_4.setEditable(false);
		setComponentSize(btext1_4, 50, 20);
		btext1_4.setText("100");
		doc1 = btext1_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext1_4, d);

		btext2_4 = new JTextPane();
		btext2_4.setEditable(false);
		setComponentSize(btext2_4, 50, 20);
		btext2_4.setText("89");
		doc1 = btext2_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext2_4, d);

		btext3_4 = new JTextPane();
		btext3_4.setEditable(false);
		setComponentSize(btext3_4, 50, 20);
		btext3_4.setText("79");
		doc1 = btext3_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext3_4, d);

		btext4_4 = new JTextPane();
		btext4_4.setEditable(false);
		setComponentSize(btext4_4, 50, 20);
		btext4_4.setText("68");
		doc1 = btext4_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext4_4, d);

		btext5_4 = new JTextPane();
		btext5_4.setEditable(false);
		setComponentSize(btext5_4, 50, 20);
		btext5_4.setText("58");
		doc1 = btext5_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext5_4, d);

		btext6_4 = new JTextPane();
		btext6_4.setEditable(false);
		setComponentSize(btext6_4, 50, 20);
		btext6_4.setText("47");
		doc1 = btext6_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext6_4, d);

		btext7_4 = new JTextPane();
		btext7_4.setEditable(false);
		setComponentSize(btext7_4, 50, 20);
		btext7_4.setText("36");
		doc1 = btext7_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext7_4, d);

		btext8_4 = new JTextPane();
		btext8_4.setEditable(false);
		setComponentSize(btext8_4, 50, 20);
		btext8_4.setText("26");
		doc1 = btext8_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext8_4, d);

		btext9_4 = new JTextPane();
		btext9_4.setEditable(false);
		setComponentSize(btext9_4, 50, 20);
		btext9_4.setText("15");
		doc1 = btext9_4.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext9_4, d);

		JTextPane btext10_4 = new JTextPane();
		btext10_4.setEditable(false);
		setComponentSize(btext10_4, 60, 20);
		btext10_4.setText("Jemand: ");
		doc10 = btext10_4.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(btext10_4, d);


		textinput2_4 = new JTextField();
		textinput2_4.setFont(inputFONT);
		textinput2_4.setHorizontalAlignment(JTextField.CENTER);
		textinput2_4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_4, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel4.add(textinput2_4, d);


		answerListPanel4.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

		answerOption.add(inputField1_4);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_4.getText());
		inputText2 = String.valueOf(textinput2_4.getText());

		textAnswer1.add(textinput1_4);
		textAnswer2.add(textinput2_2);
		test.add(answerListPanel4);
		JPanel box_4 = new JPanel();
		setComponentSize(box_4, 600, 40);
		box_4.setOpaque(false);
		box_4.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_4);

		//Fifth Panel

		JPanel answerListPanel5 = new JPanel();
		answerListPanel5.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel5);
		answerListPanel5.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel5, 800, 100);
		d = new GridBagConstraints();

		JTextPane LeftText5;
		LeftText5 = new JTextPane();
		LeftText5.setEditable(false);
		setComponentSize(LeftText5, 100, 20);
		LeftText5.setText("  Sie erhalten");
		LeftText5.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(LeftText5, d);

		text1_5 = new JTextPane();
		text1_5.setEditable(false);
		setComponentSize(text1_5, 50, 20);
		text1_5.setText("100");
		doc1 = text1_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text1_5, d);

		text2_5 = new JTextPane();
		text2_5.setEditable(false);
		setComponentSize(text2_5, 50, 20);
		text2_5.setText("94");
		doc1 = text2_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text2_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text2_5, d);

		text3_5 = new JTextPane();
		text3_5.setEditable(false);
		setComponentSize(text3_5, 50, 20);
		text3_5.setText("88");
		doc1 = text3_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text3_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text3_5, d);

		text4_5 = new JTextPane();
		text4_5.setEditable(false);
		setComponentSize(text4_5, 50, 20);
		text4_5.setText("81");
		doc1 = text4_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text4_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text4_5, d);

		text5_5 = new JTextPane();
		text5_5.setEditable(false);
		setComponentSize(text5_5, 50, 20);
		text5_5.setText("75");
		doc1 = text5_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text5_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text5_5, d);

		text6_5 = new JTextPane();
		text6_5.setEditable(false);
		setComponentSize(text6_5, 50, 20);
		text6_5.setText("69");
		doc1 = text6_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text6_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text6_5, d);

		text7_5 = new JTextPane();
		text7_5.setEditable(false);
		setComponentSize(text7_5, 50, 20);
		text7_5.setText("63");
		doc1 = text7_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text7_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text7_5, d);

		text8_5 = new JTextPane();
		text8_5.setEditable(false);
		setComponentSize(text8_5, 50, 20);
		text8_5.setText("56");
		doc1 = text8_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text8_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text8_5, d);

		text9_5 = new JTextPane();
		text9_5.setEditable(false);
		setComponentSize(text9_5, 50, 20);
		text9_5.setText("50");
		doc1 = text9_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text9_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text9_5, d);

		JTextPane text10_5 = new JTextPane();
		text10_5.setEditable(false);
		setComponentSize(text10_5, 60, 20);
		text10_5.setText("Sie: ");
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(text10_5, d);

		textinput1_5 = new JTextField();
		textinput1_5.setFont(inputFONT);
		textinput1_5.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_5, 60, 20);
		textinput1_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(textinput1_5, d);


		inputField1_5 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_5.setBackground(Color.white);
		inputField1_5.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_5.setMajorTickSpacing(1);
		inputField1_5.setPaintTicks(false);
		inputField1_5.setSnapToTicks(true);
		inputField1_5.setPaintLabels(false);
		setComponentSize(inputField1_5, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel5.add(inputField1_5, d);

		JTextPane RightText5;
		RightText5 = new JTextPane();
		RightText5.setEditable(false);
		setComponentSize(RightText2, 100, 20);
		RightText5.setText("  Jemand erhält");
		RightText5.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(RightText5, d);

		btext1_5 = new JTextPane();
		btext1_5.setEditable(false);
		setComponentSize(btext1_5, 50, 20);
		btext1_5.setText("50");
		doc1 = btext1_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext1_5, d);

		btext2_5 = new JTextPane();
		btext2_5.setEditable(false);
		setComponentSize(btext2_5, 50, 20);
		btext2_5.setText("56");
		doc1 = btext2_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext2_5, d);

		btext3_5 = new JTextPane();
		btext3_5.setEditable(false);
		setComponentSize(btext3_5, 50, 20);
		btext3_5.setText("63");
		doc1 = btext3_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext3_5, d);

		btext4_5 = new JTextPane();
		btext4_5.setEditable(false);
		setComponentSize(btext4_5, 50, 20);
		btext4_5.setText("69");
		doc1 = btext4_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext4_5, d);

		btext5_5 = new JTextPane();
		btext5_5.setEditable(false);
		setComponentSize(btext5_5, 50, 20);
		btext5_5.setText("75");
		doc1 = btext5_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext5_5, d);

		btext6_5 = new JTextPane();
		btext6_5.setEditable(false);
		setComponentSize(btext6_5, 50, 20);
		btext6_5.setText("81");
		doc1 = btext6_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext6_5, d);

		btext7_5 = new JTextPane();
		btext7_5.setEditable(false);
		setComponentSize(btext7_5, 50, 20);
		btext7_5.setText("88");
		doc1 = btext7_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext7_5, d);

		btext8_5 = new JTextPane();
		btext8_5.setEditable(false);
		setComponentSize(btext8_5, 50, 20);
		btext8_5.setText("94");
		doc1 = btext8_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext8_5, d);

		btext9_5 = new JTextPane();
		btext9_5.setEditable(false);
		setComponentSize(btext9_5, 50, 20);
		btext9_5.setText("100");
		doc1 = btext9_5.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext9_5, d);

		JTextPane btext10_5 = new JTextPane();
		btext10_5.setEditable(false);
		setComponentSize(btext10_5, 60, 20);
		btext10_5.setText("Jemand: ");
		doc10 = btext10_5.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(btext10_5, d);


		textinput2_5 = new JTextField();
		textinput2_5.setFont(inputFONT);
		textinput2_5.setHorizontalAlignment(JTextField.CENTER);
		textinput2_5.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_5, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel5.add(textinput2_5, d);


		answerListPanel5.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

		answerOption.add(inputField1_5);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_5.getText());
		inputText2 = String.valueOf(textinput2_5.getText());

		textAnswer1.add(textinput1_5);
		textAnswer2.add(textinput2_2);
		test.add(answerListPanel5);
		JPanel box_5 = new JPanel();
		setComponentSize(box_5, 600, 40);
		box_5.setOpaque(false);
		box_5.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_5);


		//Sixth Panel

		JPanel answerListPanel6 = new JPanel();
		answerListPanel6.setLayout(new GridBagLayout());
		//returnPanel.add(answerListPanel5);
		answerListPanel6.setBackground(returnPanel.getBackground());
		setComponentSize(answerListPanel6, 800, 100);
		d = new GridBagConstraints();

		JTextPane LeftText6;
		LeftText6 = new JTextPane();
		LeftText6.setEditable(false);
		setComponentSize(LeftText6, 100, 20);
		LeftText6.setText("  Sie erhalten");
		LeftText6.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(LeftText6, d);

		text1_6 = new JTextPane();
		text1_6.setEditable(false);
		setComponentSize(text1_6, 50, 20);
		text1_6.setText("100");
		doc1 = text1_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text1_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text1_6, d);

		text2_6 = new JTextPane();
		text2_6.setEditable(false);
		setComponentSize(text2_6, 50, 20);
		text2_6.setText("98");
		doc1 = text2_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text2_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text2_6, d);

		text3_6 = new JTextPane();
		text3_6.setEditable(false);
		setComponentSize(text3_6, 50, 20);
		text3_6.setText("96");
		doc1 = text3_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text3_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text3_6, d);

		text4_6 = new JTextPane();
		text4_6.setEditable(false);
		setComponentSize(text4_6, 50, 20);
		text4_6.setText("94");
		doc1 = text4_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text4_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text4_6, d);

		text5_6 = new JTextPane();
		text5_6.setEditable(false);
		setComponentSize(text5_6, 50, 20);
		text5_6.setText("93");
		doc1 = text5_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text5_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text5_6, d);

		text6_6 = new JTextPane();
		text6_6.setEditable(false);
		setComponentSize(text6_6, 50, 20);
		text6_6.setText("91");
		doc1 = text6_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text6_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text6_6, d);

		text7_6 = new JTextPane();
		text7_6.setEditable(false);
		setComponentSize(text7_6, 50, 20);
		text7_6.setText("89");
		doc1 = text7_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text7_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text7_6, d);

		text8_6 = new JTextPane();
		text8_6.setEditable(false);
		setComponentSize(text8_6, 50, 20);
		text8_6.setText("87");
		doc1 = text8_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text8_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text8_6, d);

		text9_6 = new JTextPane();
		text9_6.setEditable(false);
		setComponentSize(text9_6, 50, 20);
		text9_6.setText("85");
		doc1 = text9_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		text9_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text9_6, d);

		JTextPane text10_6 = new JTextPane();
		text10_6.setEditable(false);
		setComponentSize(text10_6, 60, 20);
		text10_6.setText("Sie: ");
		StyleConstants.setAlignment(center9, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center9, false);
		d.gridx = 10;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(text10_6, d);

		textinput1_6 = new JTextField();
		textinput1_6.setFont(inputFONT);
		textinput1_6.setHorizontalAlignment(JTextField.CENTER);
		setComponentSize(textinput1_6, 60, 20);
		textinput1_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 11;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(textinput1_6, d);


		inputField1_6 = new JSlider(JSlider.HORIZONTAL, 1, 9, 1);
		inputField1_6.setBackground(Color.white);
		inputField1_6.putClientProperty("JSlider.isFilled", Boolean.FALSE);
		/*Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );*/
		inputField1_6.setMajorTickSpacing(1);
		inputField1_6.setPaintTicks(false);
		inputField1_6.setSnapToTicks(true);
		inputField1_6.setPaintLabels(false);
		setComponentSize(inputField1_6, 430, 50);
		d.insets = new Insets(0, 10, 0, 0);
		d.gridx = 1;
		d.gridy = 0 + 1;
		d.weightx = 1;
		d.gridwidth = 10;
		answerListPanel6.add(inputField1_6, d);

		JTextPane RightText6;
		RightText6 = new JTextPane();
		RightText6.setEditable(false);
		setComponentSize(RightText6, 100, 20);
		RightText6.setText("  Jemand erhält");
		RightText6.setBackground(Color.white);
		d.gridx = 0;
		d.insets = new Insets(0, 0, 0, 0);
		d.weightx = 0.5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(RightText6, d);

		btext1_6 = new JTextPane();
		btext1_6.setEditable(false);
		setComponentSize(btext1_6, 50, 20);
		btext1_6.setText("50");
		doc1 = btext1_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext1_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 1;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext1_6, d);

		btext2_6 = new JTextPane();
		btext2_6.setEditable(false);
		setComponentSize(btext2_6, 50, 20);
		btext2_6.setText("54");
		doc1 = btext2_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext2_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 2;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext2_6, d);

		btext3_6 = new JTextPane();
		btext3_6.setEditable(false);
		setComponentSize(btext3_6, 50, 20);
		btext3_6.setText("59");
		doc1 = btext3_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext3_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 3;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext3_6, d);

		btext4_6 = new JTextPane();
		btext4_6.setEditable(false);
		setComponentSize(btext4_6, 50, 20);
		btext4_6.setText("63");
		doc1 = btext4_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext4_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 4;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext4_6, d);

		btext5_6 = new JTextPane();
		btext5_6.setEditable(false);
		setComponentSize(btext5_6, 50, 20);
		btext5_6.setText("68");
		doc1 = btext5_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext5_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 5;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext5_6, d);

		btext6_6 = new JTextPane();
		btext6_6.setEditable(false);
		setComponentSize(btext6_6, 50, 20);
		btext6_6.setText("72");
		doc1 = btext6_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext6_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 6;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext6_6, d);

		btext7_6 = new JTextPane();
		btext7_6.setEditable(false);
		setComponentSize(btext7_6, 50, 20);
		btext7_6.setText("76");
		doc1 = btext7_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext7_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 7;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext7_6, d);

		btext8_6 = new JTextPane();
		btext8_6.setEditable(false);
		setComponentSize(btext8_6, 50, 20);
		btext8_6.setText("81");
		doc1 = btext8_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext8_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 8;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext8_6, d);

		btext9_6 = new JTextPane();
		btext9_6.setEditable(false);
		setComponentSize(btext9_6, 50, 20);
		btext9_6.setText("85");
		doc1 = btext9_6.getStyledDocument();
		center1 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center1, StyleConstants.ALIGN_CENTER);
		doc1.setParagraphAttributes(0, doc1.getLength(), center1, false);
		btext9_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		d.gridx = 9;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext9_6, d);

		JTextPane btext10_6 = new JTextPane();
		btext10_6.setEditable(false);
		setComponentSize(btext10_6, 60, 20);
		btext10_6.setText("Jemand: ");
		doc10 = btext10_6.getStyledDocument();
		center10 = new SimpleAttributeSet();
		StyleConstants.setAlignment(center10, StyleConstants.ALIGN_LEFT);
		doc10.setParagraphAttributes(0, doc10.getLength(), center10, false);
		d.gridx = 10;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(btext10_6, d);


		textinput2_6 = new JTextField();
		textinput2_6.setFont(inputFONT);
		textinput2_6.setHorizontalAlignment(JTextField.CENTER);
		textinput2_6.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		setComponentSize(textinput2_6, 60, 20);
		d.gridx = 11;
		d.gridy = 0 + 2;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel6.add(textinput2_6, d);


		answerListPanel6.setBorder(BorderFactory.createLineBorder(Color.gray, 2));

		answerOption.add(inputField1_6);


		//return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
		inputText1 = String.valueOf(textinput1_6.getText());
		inputText2 = String.valueOf(textinput2_6.getText());

		textAnswer1.add(textinput1_6);
		textAnswer2.add(textinput2_2);
		test.add(answerListPanel6);
		JPanel box_6 = new JPanel();
		setComponentSize(box_6, 600, 40);
		box_6.setOpaque(false);
		box_6.setBackground(Color.white);
		d.gridx = 0;
		d.gridy = 0 + 3;
		d.gridwidth = 12;
		//returnPanel.add(box);
		test.add(box_6);

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

		answerText.get(0);

		MouseMotionListener e = new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {

			}
			String[] parts = answerNumbers.get(1).split("/");
			@Override
			public void mouseMoved(MouseEvent e) {
				textinput1_1.setText(parts[inputField1_1.getValue()-1]);
				textinput2_1.setText(parts[inputField1_1.getValue()-1+9]);

				textinput1_2.setText(String.valueOf(inputField1_2.getValue()));
				textinput2_2.setText(String.valueOf(inputField1_2.getValue()));

				textinput1_3.setText(String.valueOf(inputField1_3.getValue()));
				textinput2_3.setText(String.valueOf(inputField1_3.getValue()));

				textinput1_4.setText(String.valueOf(inputField1_4.getValue()));
				textinput2_4.setText(String.valueOf(inputField1_4.getValue()));

				textinput1_5.setText(String.valueOf(inputField1_5.getValue()));
				textinput2_5.setText(String.valueOf(inputField1_5.getValue()));

				textinput1_6.setText(String.valueOf(inputField1_6.getValue()));
				textinput2_6.setText(String.valueOf(inputField1_6.getValue()));
			}
		};

		inputField1_1.addMouseMotionListener(e);
		inputField1_2.addMouseMotionListener(e);
		inputField1_3.addMouseMotionListener(e);
		inputField1_4.addMouseMotionListener(e);
		inputField1_5.addMouseMotionListener(e);
		inputField1_6.addMouseMotionListener(e);



		scrollFrame.getVerticalScrollBar().setValue(0);
		scrollFrame.getVerticalScrollBar().setUnitIncrement(10);

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
