package edu.kit.exp.impl.continuousCompetition.client.Questionnaire;

import edu.kit.exp.client.gui.screens.question.questionnaire.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tondaroder on 30.01.17.
 */
public class ContinuousCompetitionQuestionnaireCompetition_DSS extends QuestionnaireScreen {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8841977439730389225L;

	public ContinuousCompetitionQuestionnaireCompetition_DSS(String gameId, ParamObject parameter, String screenId, Long showUpTime) {
		super(gameId, parameter, screenId, showUpTime);
		this.setTitleText("Fragebogen");
		this.setPreText("<html><center>Die zweite Phase des Experiments ist nun abgeschlossen.<br></b>Im Folgenden stellen wir Ihnen nun noch eine Reihe von Fragen. Bitte beantworten Sie diesen Fragebogen aufmerksam und vollständig.<br>Klicken Sie auf die Schaltfläche „Weiter“, um mit dem Fragebogen zu beginnen.</htmL>");
		this.setPostText("Sie haben den Fragebogen erfolgreich abgeschlossen.<br>Klicken Sie \"Weiter\", um das Experiment zu beenden.");
		Random r = new Random();
		ArrayList<String> Answers;
		QuestionnaireLikert liker;
		QuestionnaireSemantic semantic;


		QuestionnaireMultipleChoice question;
		question = new QuestionnaireMultipleChoice("Welche der folgenden Aussagen zum Experiment sind zutreffend? ");
		question.addAnswer("Die Firma, mit der ich während des Experiments im Wettbewerb stand, wurde von einem menschlichen Experimentteilnehmenden dargestellt.");
		question.addAnswer("Die Firma, mit der ich während des Experiments im Wettbewerb stand, wurde von einem Computeralgorithmus dargestellt.");
		question.addAnswer("Keine der oben angegebenen Antworten trifft zu.");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("Welche der folgenden Aussagen zum Experiment sind zutreffend? ");
		question.addAnswer("<html>Mir standen <u>keine</u> zusätzlichen Empfehlungen zur Preissetzung zur Verfügung.</html>");
		question.addAnswer("Mir standen zusätzliche Empfehlungen zur Preissetzung zur Verfügung.");
		question.addAnswer("Keine der oben angegebenen Antworten trifft zu.");
		this.addQuestionnaireItem(question);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br<b>Geben Sie an inwiefern Sie den folgenden Aussagen zu Ihren Zielen während des Experiments zustimmen:");
		liker.addAnswer("Mein Ziel war es, einen möglichst hohen Gesamtgewinn zu erzielen.");
		liker.addAnswer("Mein Ziel war es, besser als die andere Firma abzuschneiden.");
		liker.addAnswer("Mein Ziel war es, mit der anderen Firma im Experiment zu kooperieren.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br<b>Geben Sie an inwiefern Sie den folgenden Aussagen zu den <u>Zielen der anderen Firma</u>, mit der Sie im Experiment im Wettbewerb standen, zustimmen:");
		liker.addAnswer("Das Ziel der anderen Firma war es, den höchstmöglichen Gesamtgewinn zu erzielen.");
		liker.addAnswer("Das Ziel der anderen Firma war es, besser als ich abzuschneiden.");
		liker.addAnswer("Das Ziel der anderen Firma war es, mit mir zu kooperieren.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br<b>Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		/*//Random Order of Constructs
		Answers = new ArrayList<>();
		//For each Construct add one line with "/"-seperator
		Answers.add("Ich mag den Wettbewerb./Ich genieße es, gegen Andere anzutreten./Ich versuche oft, andere zu übertrumpfen.");
		Answers.add("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich./Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.");
		Answers.add("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden./Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
		ArrayList<Integer> order = new ArrayList<>();
		while (Answers.size()>0){
			int randomAnswer = r.nextInt(Answers.size());
			//To get order of random constructs for opponent questions
			order.add(randomAnswer);
			String[] parts = Answers.get(randomAnswer).split("/");
			for (int i = 0; i<parts.length; i++){
				liker.addAnswer(parts[i]);
			}
			Answers.remove(Answers.get(randomAnswer));
		}*/
		liker.addAnswer("Mir gefällt es, mich im Wettbewerb zu messen.");
		liker.addAnswer("Ich mag es, gegen andere anzutreten.");
		liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.");
		liker.addSpace(3);
		liker.addAnswer("Ich bin jemand, die/der gerne gewinnt und es hasst zu verlieren.");
		liker.addAnswer("Ich fühle mich schlecht, wenn ich in einem Wettbewerb verliere.");
		liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.");
		this.addQuestionnaireItem(liker);

		QuestionnaireTextInput textInput = new QuestionnaireTextInput("Beschreiben Sie kurz in eigenen Worten Ihre Strategie während des Experiments.");
		this.addQuestionnaireItem(textInput);

		textInput = new QuestionnaireTextInput("Beschreiben Sie kurz in eigenen Worten die Strategie der anderen Firma während des Experiments.");
		this.addQuestionnaireItem(textInput);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen zustimmen:");
		liker.addAnswer("Es fiel mir leicht mit der anderen Firma zusammenzuarbeiten.");
		liker.addAnswer("Ich konnte zusammen mit der anderen Firma ein gemeinsames Ziel erreichen.");
		liker.addSpace(2);
		liker.addAnswer("Ich habe verstanden, auf welches Ziel die andere Firma hinarbeiten wollte");
		liker.addAnswer("Bei diesem Experiment sollte man mit der anderen Firma zusammenarbeiten, damit am Ende alle mehr Gewinn erzielen.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen zustimmen:");
		liker.addAnswer("Wählen Sie hier bitte den Wert \"5\" aus, um zu zeigen, dass Sie diese Aussage aufmerksam gelesen haben.");
		liker.addAnswer("Wählen Sie hier bitte den Wert \"6\" aus, um zu zeigen, dass Sie diese Aussage aufmerksam gelesen haben.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen zustimmen:");
		liker.addAnswer("<span style='font-size:10px'>Bei meinen Preisentscheidungen während des Experiments bin ich den Empfehlungen des Algorithmus häufig gefolgt.");
		liker.addSpace(1);
		liker.addAnswer("<span style='font-size:10px'>Meine eigenen Preisentscheidungen waren geeignet, den größtmöglichen Gesamtgewinn zu erzielen.");
		liker.addAnswer("<span style='font-size:10px'>Die Preisempfehlungen des Algorithmus waren geeignet, den größmöglichen Gesamtgewinn zu erzielen.");
		liker.addAnswer("<span style='font-size:10px'>Ich glaube, dass die Empfehlungen des Algorithmus besser als meine eigenen Entscheidungen geeignet waren, um den größtmöglichen Gesamtgewinn zu erzielen.</span>");
		liker.addAnswer("<span style='font-size:10px'>Ich glaube, dass meine eigenen Entscheidungen besser als die Empfehlungen des Algorithmus geeignet waren, um den größtmöglichen Gesamtgewinn zu erzielen.</span>");
		liker.addSpace(5);
		liker.addAnswer("<span style='font-size:10px'>Ich hatte hohes Vertrauen in die Empfehlungen des Algorithmus.");
		this.addQuestionnaireItem(liker);



		semantic = new QuestionnaireSemantic("<span style=\"font-weight:normal\">Bitte bewerten Sie die folgende Aussage auf der Skala von 1 bis 7 mit den jeweiligen Endpunkten. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Das Verhalten der anderen Firma im Experiment empfand ich als...");
		Answers = new ArrayList<>();
		//For each Construct add one line with "/"-seperator
		Answers.add("Unintelligent/Intelligent&Inkompetent/Kompetent&Unklug/Klug");
		Answers.add("Unangenehm/Angenehm&Hart/Nett&Unerfreulich/Erfreulich");
		Answers.add("Mechanisch/Kreativ&Starr/Lebendig&Künstlich/Menschlich");
		Answers.add("Schwach/Stark&Gefügig/Dominant&Unsicher/Selbstbewusst");
		Answers.add("Unzuverlässig/Zuverlässig&Nicht vertrauenswürdig/Vertrauenswürdig&Unverlässlich/Verlässlich");
		while (Answers.size()>0){
			int randomAnswer = r.nextInt(Answers.size());
			String[] parts = Answers.get(randomAnswer).split("&");
			for (int i = 0; i<parts.length; i++){
				semantic.addAnswer(parts[i]);
			}
			Answers.remove(Answers.get(randomAnswer));
		}

		/*semantic.addAnswer("Unintelligent/Intelligent");
		semantic.addAnswer("Inkompetent/Kompetent");
		semantic.addAnswer("Unwissend/Klug");
		semantic.addAnswer("Unangenehm/Angenehm");
		semantic.addAnswer("Hart/Nett");
		semantic.addAnswer("Unerfreulich/Erfreulich");
		semantic.addAnswer("Mechanisch/Kreativ");
		semantic.addAnswer("Starr/Lebendig");
		semantic.addAnswer("Künstlich/Menschlich");
		//this.addQuestionnaireItem(semantic);

		//semantic = new QuestionnaireSemantic("<span style=\"font-weight:normal\">Bitte bewerten Sie die folgende Aussage auf der Skala von 1 bis 7 mit den jeweiligen Endpunkten. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Das Verhalten meines Gegenüber im Experiment empfand ich als...");
		semantic.addAnswer("Schwach/Stark");
		semantic.addAnswer("Gefügig/Dominant");
		semantic.addAnswer("Unsicher/Selbstbewusst");
		semantic.addAnswer("Unverlässlich/Verlässlich");
		semantic.addAnswer("Nicht vertrauenswürdig/Vertrauenswürdig");
		semantic.addAnswer("Unzuverlässig/Zuverlässig");*/
		this.addQuestionnaireItem(semantic);

		question = new QuestionnaireMultipleChoice("Welches Geschlecht haben Sie?");
		question.setSelectMultiple(false);
		question.addAnswer("männlich");
		question.addAnswer("weiblich");
		question.addAnswer("divers");
		this.addQuestionnaireItem(question);

		QuestionnaireNumberInput numberInput = new QuestionnaireNumberInput("Wie alt sind Sie?");
		numberInput.setMinValue(15);
		numberInput.setMaxValue(99);
		this.addQuestionnaireItem(numberInput);

		QuestionnaireDropDown questionDD;
		questionDD = new QuestionnaireDropDown("Welches ist das höchste Bildungsniveau, das Sie bisher erreicht haben?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		String[] answer = new String[]{"Bitte auswählen...", "Allgemeine oder fachgebundene Hochschulreife/Abitur", "Bachelorabschluss", "Masterabschluss oder Diplom", "Promotion", "Staatsexamen", "Anderer Abschluss"		};
		questionDD.answerText = answer;
		this.addQuestionnaireItem(questionDD);

		questionDD = new QuestionnaireDropDown("Welche Staatsangehörigkeit haben Sie?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		//String[] countries = new String[]{"Bitte auswählen...", "Afghanistan", "Albanien", "Algerien", "Amerikanisch-Samoa", "Andorra", "Angola", "Anguilla", "Antarktis", "Antigua und Barbuda", "Argentinien", "Armenien", "Aruba", "Australien", "Österreich", "Aserbaidschan", "Bahamas", "Bahrain", "Bangladesch", "Barbados", "Belarus", "Belgien", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivien", "Bosnien und Herzegowina", "Botswana", "Bouvetinsel", "Brasilien", "Britisches Territorium im Indischen Ozean", "Brunei Darussalam", "Bulgarien", "Burkina Faso", "Burundi", "Kambodscha", "Kamerun", "Kanada", "Kap Verde", "Kaimaninseln", "Zentralafrikanische Republik", "Tschad", "Chile", "China", "Weihnachtsinsel", "Kokosinseln (Keeling)", "Kolumbien", "Komoren", "Kongo", "Kongo, Demokratische Republik", "Cookinseln", "Costa Rica", "Elfenbeinküste", "Kroatien (Hrvatska)", "Kuba", "Zypern", "Tschechische Republik", "Dänemark", "Dschibuti", "Dominica", "Dominikanische Republik", "Osttimor", "Ecuador", "Ägypten", "El Salvador", "Äquatorialguinea", "Eritrea", "Estland", "Äthiopien", "Falklandinseln (Malwinen)", "Färöer-Inseln", "Fidschi", "Finnland", "Frankreich", "France Metropolitan", "Französisch-Guayana", "Französisch-Polynesien", "Französische Südterritorien", "Gabun", "Gambia", "Georgien", "Deutschland", "Ghana", "Gibraltar", "Griechenland", "Grönland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard- und Mc Donald-Inseln", "Heiliger Stuhl (Vatikanstadt)", "Honduras", "Hongkong", "Ungarn", "Island", "Indien", "Indonesien", "Iran (Islamische Republik)", "Irak", "Irland", "Israel", "Italien", "Jamaika", "Japan", "Jordanien", "Kasachstan", "Kenia", "Kiribati", "Korea, Demokratische Volksrepublik", "Korea, Republik", "Kuwait", "Kirgisistan", "Laos, Demokratische Volksrepublik", "Lettland", "Libanon", "Lesotho", "Liberia", "Libysch-Arabische Dschamahirija", "Liechtenstein", "Litauen", "Luxemburg", "Macau", "Mazedonien, ehemalige jugoslawische Republik", "Madagaskar", "Malawi", "Malaysia", "Malediven", "Mali", "Malta", "Marshallinseln", "Martinique", "Mauretanien", "Mauretanien", "Mauritius", "Mayotte", "Mexiko", "Mikronesien, Föderierte Staaten von", "Moldawien, Republik", "Monaco", "Mongolei", "Montserrat", "Marokko", "Mosambik", "Myanmar", "Namibia", "Nauru", "Nepal", "Niederlande", "Niederländische Antillen", "Neukaledonien", "Neuseeland", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolkinsel", "Nördliche Marianen", "Norwegen", "Oman", "Pakistan", "Palau", "Panama", "Papua-Neuguinea", "Paraguay", "Peru", "Philippinen", "Pitcairn", "Polen", "Portugal", "Puerto Rico", "Katar", "Reunion", "Rumänien", "Russische Föderation", "Ruanda", "St. Kitts und Nevis", "St. Lucia", "St. Vincent und die Grenadinen", "Samoa", "San Marino", "Sao Tome und Principe", "Saudi-Arabien", "Senegal", "Seychellen", "Sierra Leone", "Singapur", "Slowakei (Slowakische Republik)", "Slowenien", "Salomonen", "Somalia", "Südafrika", "Südgeorgien und die Südlichen Sandwichinseln", "Spanien", "Sri Lanka", "St. Helena", "St. Pierre und Miquelon", "Sudan", "Surinam", "Svalbard und Jan Mayen Inseln", "Swasiland", "Schweden", "Schweiz", "Syrische Arabische Republik", "Taiwan, Provinz China", "Tadschikistan", "Tansania, Vereinigte Republik", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad und Tobago", "Tunesien", "Türkei", "Turkmenistan", "Turks- und Caicosinseln", "Tuvalu", "Uganda", "Ukraine", "Vereinigte Arabische Emirate", "Vereinigtes Königreich", "Vereinigte Staaten", "United States Minor Outlying Islands", "Uruguay", "Usbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U. S.)", "Wallis und Futuna", "Westsahara", "Jemen", "Jugoslawien", "Sambia", "Simbabwe", "Palästina"};
		String[] countries = new String[]{"Bitte auswählen...", "---", "Deutschland", "Österreich", "Schweiz", "---", "Afghanistan", "Ägypten", "Albanien", "Algerien", "Andorra", "Angola", "Antigua und Barbuda", "Äquatorialguinea", "Argentinien", "Armenien", "Aserbaidschan", "Äthiopien", "Australien", "Bahamas", "Bahrain", "Bangladesch", "Barbados", "Belgien", "Belize","Benin", "Bhutan", "Bolivien", "Bosnien und Herzegowina", "Botsuana", "Brasilien", "Britische Überseegebiete", "Brunei Darussalam", "Bulgarien", "Burkina Faso", "Burundi", "Cabo Verde", "Chile", "China", "Costa Rica", "Côte dIvoire", "Dänemark", "Deutschland", "Dominica", "Dominikanische Republik", "Dschibuti", "Ecuador", "El Salvador", "Eritrea", "Estland", "Eswatini", "Fidschi", "Finnland", "Frankreich", "Gabun", "Gambia", "Georgien", "Ghana", "Grenada", "Griechenland", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hongkong", "Indien", "Indonesien", "Irak", "Iran", "Irland", "Island", "Israel", "Italien", "Jamaika", "Japan", "Jemen", "Jordanien", "Jugoslawien", "Jugoslawien, Bundesrepublik", "Kambodscha", "Kamerun", "Kanada", "Kasachstan", "Katar", "Kenia", "Kirgisistan", "Kiribati", "Kolumbien", "Komoren", "Kongo", "Kongo, Demokratische Republik", "Korea, Demokratische Volksrepublik", "Korea, Republik", "Kosovo", "Kroatien", "Kuba", "Kuwait", "Laos", "Lesotho", "Lettland", "Libanon", "Liberia", "Libyen", "Liechtenstein", "Litauen", "Luxemburg", "Macau", "Madagaskar", "Malawi", "Malaysia", "Malediven", "Mali", "Malta", "Marokko", "Marshallinseln", "Mauretanien", "Mauritius", "Mexiko", "Mikronesien", "Moldau", "Monaco", "Mongolei", "Montenegro", "Mosambik", "Myanmar", "Namibia", "Nauru", "Nepal", "Neuseeland", "Nicaragua", "Niederlande", "Niger", "Nigeria", "Nordmazedonien", "Norwegen", "Oman", "Österreich", "Pakistan", "Palästinensische Gebiete", "Palau", "Panama", "Papua-Neuguinea", "Paraguay", "Peru", "Philippinen", "Polen", "Portugal", "Ruanda", "Rumänien", "Russische Föderation", "Salomonen", "Sambia", "Samoa", "San Marino", "São Tomé und Príncipe", "Saudi-Arabien", "Schweden", "Schweiz", "Senegal", "Serbien", "Serbien (einschließlich Kosovo)", "Serbien und Montenegro", "Seychellen", "Sierra Leone", "Simbabwe", "Singapur", "Slowakei", "Slowenien", "Somalia", "Sowjetunion", "Spanien", "Sri Lanka", "St. Kitts und Nevis", "St. Lucia", "St. Vincent und die Grenadinen", "Südafrika", "Sudan", "Südsudan", "Suriname", "Syrien", "Tadschikistan", "Taiwan", "Tansania", "Thailand", "Timor-Leste", "Togo", "Tonga", "Trinidad und Tobago", "Tschad", "Tschechien", "Tschechoslowakei", "Tunesien", "Türkei", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "Ungarn", "Uruguay", "Usbekistan", "Vanuatu", "Vatikanstadt", "Venezuela", "Vereinigte Arabische Emirate", "Vereinigte Staaten", "Vereinigtes Königreich", "Vietnam", "Weißrussland", "Zentralafrikanische Republik", "Zypern"};
		//Arrays.sort(countries);
		questionDD.answerText = countries;
		this.addQuestionnaireItem(questionDD);

		questionDD = new QuestionnaireDropDown("Welchen Studiengang studieren Sie aktuell (oder haben Sie als letztes studiert)?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		String[] studies = new String[]{"Bitte auswählen...", "Artificial Intelligence Engineering (Master)","Bildungs- und Erziehungsprozesse (Master)", "Business Administration and Economics (Bachelor)", "Business Administration (Master)", "Caritaswissenschaft und werteorientiertes Mangement (Master)", "Computational Mathematics (Master)", "Deutsches Recht für ausländische Studierende (Master)", "Deutsches und Russisches Recht (Doppelmaster)", "Development Studies (Master)", "Digital Transformation in Business and Society (Bachelor)","European Studies (Bachelor)", "European Studies Major (Bachelor)", "European Studies (Master)", "Geographie: Kultur, Umwelt und Tourismus (Master)", "Governance and Public Policy - Staatswissenschaften (Bachelor)", "Governance and Public Policy - Staatswissenschaften (Master)", "Historische Wissenschaften (Bachelor)", "Historische Wissenschaften (Master)", "Informatik (Bachelor)", "Informatik (Master)", "International Economics and Business (Master)", "Internet Computing (Bachelor)", "Journalistik und Strategische Kommunikation (Bachelor)", "Jura/Rechtswissenschaften", "Kulturwirtschaft (Bachelor)", "Kulturwirtschaft (Master)", "Legal Tech", "Lehramt", "Lehramtsbezogener Bachelorstudiengang Realschule", "Mathematik (Bachelor)", "Medien und Kommunikation (Bachelor)", "Rechtsinformatik (Master)", "Sprach- und Textwissenschaften (Bachelor)", "Text- und Kultursemiotik (Master)", "Wirtschaftsinformatik (Bachelor)", "Wirtschaftsinformatik (Master)", "Sonstige"};
		questionDD.answerText = studies;
		this.addQuestionnaireItem(questionDD);

		numberInput = new QuestionnaireNumberInput("Wie oft haben Sie bereits an PAULA-Experimenten teilgenommen?");
		numberInput.setMinValue(0);
		numberInput.setMaxValue(50);
		this.addQuestionnaireItem(numberInput);


		QuestionnaireMultipleChoiceKonow k1 = new QuestionnaireMultipleChoiceKonow("Bitte wählen Sie...");
		k1.setQText("<p style=\"font-family: Tahoma; font-size: 12px\"; align=\"justify\">Bob und John sind identisch in Bezug auf ihre körperlichen und geistigen Fähigkeiten. Die beiden erleiden Schiffbruch auf einer unbewohnten Insel, auf welcher Bananen die einzige Nahrung sind. 10 Bananen pro Tag fallen vor ihren Füßen auf den Boden, andere fallen ins Meer. Die beiden können so viele Bananen sammeln wie sie wollen, indem sie auf einen Baum klettern, die Bananen pflücken, bevor sie ins Meer fallen und dann auf einen Haufen werfen. Auf diese Weise pflückt Bob 7 Bananen pro Tag und John 3 pro Tag. Insgesamt gibt es also 20 Bananen pro Tag auf der Insel. Wenn Sie über die Aufteilung der Bananen entscheiden könnten und gerecht sein möchten, welche der folgenden Aufteilungen würden Sie wählen?");
		k1.addAnswer("<b>Bob bekommt 10 Bananen</b>, die 7, die er gepflückt hat, plus 3 die heruntergefallen sind, und <br><b>John bekommt 10</b>, die 3, die er gepflückt hat, plus 7 die heruntergefallen sind.");
		k1.addAnswer("<b>Bob bekommt 12 Bananen</b>, die 7, die er gepflückt hat, plus 5 die heruntergefallen sind, und <br><b>John bekommt 8</b>, die 3, die er gepflückt hat, plus 5 die heruntergefallen sind.");
		k1.addAnswer("<b>Bob bekommt 14 Bananen</b>, die 7, die er gepflückt hat, plus 7 die heruntergefallen sind, und <br><b>John bekommt 6</b>, die 3, die er gepflückt hat, plus 3 die heruntergefallen sind.");
		this.addQuestionnaireItem(k1);

		k1 = new QuestionnaireMultipleChoiceKonow("Bitte wählen Sie...");
		k1.setQText("<p style=\"font-family: Tahoma; font-size: 12px\"; align=\"justify\">Smith und Jones arbeiten in identischen Bürojobs in einem großen Unternehmen, haben dieselbe Berufserfahrung und Betriebszugehörigkeit und haben in der Vergangenheit dieselben beruflichen Erfolge erzielt. Smith entscheidet sich dafür 40 Stunden pro Woche zu arbeiten und bekommt dafür 800 Euro Gehalt, während Jones sich dafür entscheidet 20 Stunden pro Woche zu arbeiten und dafür 400 Euro Gehalt bekommt. Bitte bewerten Sie diese Situation auf der folgenden Skala:");
		k1.addAnswer("Sehr gerecht");
		k1.addAnswer("Gerecht");
		k1.addAnswer("Ungerecht");
		k1.addAnswer("Sehr ungerecht");
		this.addQuestionnaireItem(k1);

		k1 = new QuestionnaireMultipleChoiceKonow("Bitte wählen Sie...");
		k1.setQText("<p style=\"font-family: Tahoma; font-size: 12px\"; align=\"justify\">Bill und Sam managen einen kleinen Lebensmittelladen zu unterschiedlichen Zeiten an unterschiedlichen Tagen. Die Pflichten des Managers sind immer gleich, und die Tage und Zeiten, die jeder arbeitet, schwanken ziemlich zufällig, aber Bill arbeitet 40 Stunden pro Woche, während Sam 20 Stunden pro Woche arbeitet. Angenommen das Gehalt des Managers für eine 60-Stunden-Woche beträgt 1200 Euro. Welche der folgenden ist die gerechteste Aufteilung dieses Gehalts?");
		k1.addAnswer("<span vertical-align: middle;>Bill erhält 600 Euro und Sam erhält 600 Euro.");
		k1.addAnswer("Bill erhält 700 Euro und Sam erhält 500 Euro.");
		k1.addAnswer("Bill erhält 800 Euro und Sam erhält 400 Euro");
		this.addQuestionnaireItem(k1);
	}
}
