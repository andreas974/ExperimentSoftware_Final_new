package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import java.awt.*;
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
	public static final Font FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Dimension PREFERRED_SIZE = new Dimension(300, 50);
	/** The input field. */
	private JSlider inputField;

	/**
	 * This constructor instantiates a new number input quiz item.
	 *
	 * @param question
	 *            A String which contains the question to be shown to a client.
	 */
	public QuestionnaireMurphy(String question) {
		super(question);

	}

	private void setComponentSize(JComponent comp, int width, int height) {
		comp.setPreferredSize(new Dimension(width, height));
		comp.setMaximumSize(new Dimension(width, height));
		comp.setMinimumSize(new Dimension(width, height));
	}

	@Override
	public JPanel getAnswerPanel() {
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));

		JTextPane bob = new JTextPane();
		bob.setEditable(false);
		setComponentSize(bob, 400, 200);
		bob.setContentType("text/html");
		bob.setText("Bob und John sind identisch in Bezug auf ihre körperlichen und geistigen Fähigkeiten. Die beiden erleiden Schiffbruch auf einer unbewohnten Insel, auf welcher Bananen die einzige Nahrung sind. 10 Bananen pro Tag fallen vor ihren Füßen auf den Boden, andere fallen ins Meer. Die beiden können so viele Bananen sammeln wie sie wollen, indem sie auf einen Baum klettern, die Bananen pflücken, bevor sie ins Meer fallen und dann auf einen Haufen werfen. Auf diese Weise pflückt Bob 7 Bananen pro Tag und John 3 pro Tag. Insgesamt gibt es also 20 Bananen pro Tag auf der Insel. Wenn Sie über die Aufteilung der Bananen entscheiden könnten und gerecht sein möchten, welche der folgenden Aufteilungen würden Sie wählen?");

		JPanel answerListPanel = new JPanel();
		returnPanel.add(answerListPanel);
		answerListPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		answerListPanel.setBackground(returnPanel.getBackground());
		answerListPanel.setLayout(new BoxLayout(answerListPanel, BoxLayout.Y_AXIS));
		answerListPanel.setPreferredSize(PREFERRED_SIZE);
		answerListPanel.setMinimumSize(PREFERRED_SIZE);
		answerListPanel.setMaximumSize(PREFERRED_SIZE);


		inputField = new JSlider(JSlider.HORIZONTAL, 0, 11, 0);
		Dictionary map = new Hashtable();
		map.put( new Integer(0), new JLabel("Gering") );
		map.put( new Integer(11), new JLabel("Hoch") );
		inputField.setMajorTickSpacing(1);
		inputField.setPaintTicks(true);
		inputField.setLabelTable(map);
		inputField.setSnapToTicks(true);
		inputField.setPaintLabels(true);

		answerListPanel.add(inputField);

		return returnPanel;
	}

	@Override
	public boolean isValid() {
		Pattern pattern = Pattern.compile(PATTERN_FOR_VALIDATION);
		String inputText = String.valueOf(inputField.getValue());
		return (inputText.isEmpty() == false && pattern.matcher(inputText).matches());
	}

	@Override
	public String getAnswer() {
		return (String.valueOf(inputField.getValue()));
	}

}
