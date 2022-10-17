package edu.kit.exp.impl.continuousCompetition.client.Questionnaire;

import edu.kit.exp.client.gui.screens.question.questionnaire.*;

/**
 * Created by tondaroder on 30.01.17.
 */
public class ContinuousCompetitionQuestionnaireCompetition extends QuestionnaireScreen {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8841977439730389225L;

	public ContinuousCompetitionQuestionnaireCompetition(String gameId, ParamObject parameter, String screenId, Long showUpTime) {
		super(gameId, parameter, screenId, showUpTime);
		this.setTitleText("Fragebogen");
		this.setPreText("Klicken Sie \"Weiter\", um mit dem Fragebogen zum Experiment zu beginnen.");
		this.setPostText("Sie haben den Fragebogen erfolgreich abgeschlossen.<br>Klicken Sie \"Weiter\", um das Experiment zu beenden.");

		QuestionnaireMultipleChoice question;
		question = new QuestionnaireMultipleChoice("Welches Geschlecht haben Sie?");
		question.addAnswer("männlich");
		question.addAnswer("weiblich");
		question.addAnswer("divers");
		this.addQuestionnaireItem(question);

		QuestionnaireNumberInput numberInput = new QuestionnaireNumberInput("Wie alt sind Sie?");
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
		String[] studies = new String[]{"Bitte auswählen...", "Bildungs- und Erziehungsprozesse (Master)", "Business Administration and Economics (Bachelor)", "Business Administration (Master)", "Caritaswissenschaft und werteorientiertes Mangement (Master)", "Computational Mathematics (Master)", "Deutsches Recht für ausländische Studierende (Master)", "Deutsches und Russisches Recht (Doppelmaster)", "Development Studies (Master)", "European Studies (Bachelor)", "European Studies Major (Bachelor)", "European Studies (Master)", "Geographie: Kultur, Umwelt und Tourismus (Master)", "Governance and Public Policy - Staatswissenschaften (Bachelor)", "Governance and Public Policy - Staatswissenschaften (Master)", "Historische Wissenschaften (Bachelor)", "Historische Wissenschaften (Master)", "Informatik (Bachelor)", "Informatik (Master)", "International Economics and Business (Master)", "Internet Computing (Bachelor)", "Journalistik und Strategische Kommunikation (Bachelor)", "Jura", "Kulturwirtschaft (Bachelor)", "Kulturwirtschaft (Master)", "Lehramt", "Mathematik (Bachelor)", "Medien und Kommunikation (Bachelor)", "Medien und Kommunikation (Master)", "Mobile and Embedded Systems (Master)", "North and Latin American Studies (Master)", "Russian and East Central European Studies (Master)", "Sprach- und Textwissenschaften (Bachelor)", "Text- und Kultursemiotik (Master)", "Wirtschaftsinformatik (Bachelor)", "Wirtschaftsinformatik (Master)", "Sonstige"};
		questionDD.answerText = studies;
		this.addQuestionnaireItem(questionDD);

		numberInput = new QuestionnaireNumberInput("Wie oft haben Sie bereits an PAULA-Experimenten teilgenommen?");
		this.addQuestionnaireItem(numberInput);

		QuestionnaireLikert liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br<b>Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		liker.addAnswer("Ich mag den Wettbewerb.");
		liker.addAnswer("Ich genieße es, gegen Andere anzutreten.");
		liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.");

		liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.");
		liker.addAnswer("Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.");

		liker.addAnswer("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden.");
		liker.addAnswer("Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
		this.addQuestionnaireItem(liker);

		QuestionnaireTextInput textInput = new QuestionnaireTextInput("Wie würden Sie Ihre Strategie in eigenen Worten beschreiben?");
		this.addQuestionnaireItem(textInput);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		liker.addAnswer("Mein Gegenüber mag den Wettbewerb.");
		liker.addAnswer("Mein Gegenüber genießt es, gegen Andere anzutreten.");
		liker.addAnswer("Mein Gegenüber versuchte oft, mich zu übertrumpfen.");

		liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf meinen Gegenüber.");
		liker.addAnswer("Mein Gegenüber ist jemand, der gerne gewinnt und es hasst zu verlieren");

		liker.addAnswer("Das Ziel meines Gegenübers im Experiment war, besser als ich abzuschneiden.");
		liker.addAnswer("Das Ziel meines Gegenübers im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
		this.addQuestionnaireItem(liker);

		textInput = new QuestionnaireTextInput("Wie würden Sie die Strategie Ihres Gegenübers in eigenen Worten beschreiben?\n");
		this.addQuestionnaireItem(textInput);


		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		liker.addAnswer("Ich war bemüht ein gemeinsames Ziel mit meinem Gegenüber zu erreichen.");
		liker.addAnswer("Ich habe versucht, mit meinem Gegenüber zusammenzuarbeiten.");
		liker.addAnswer("Ich habe im Experiment versucht, den größtmöglichen Gewinn zu erzielen, indem ich mit meinem Gegenüber kooperiert habe.");


		liker.addAnswer("Mein Gegenüber war bemüht ein gemeinsames Ziel mit mir zu erreichen.");
		liker.addAnswer("Mein Gegenüber hat versucht, mit mir zusammenzuarbeiten.");
		liker.addAnswer("Mein Gegenüber hat im Experiment versucht, den größtmöglichen Gewinn zu erzielen, indem er mit mir kooperiert hat.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("<span style=\"font-weight:normal\">Bitte bewerten Sie auf einer Skala von 1 bis 7, wobei 1 für ''Ich stimme überhaupt nicht zu'' und 7 für ''Ich stimme vollkommen zu'' steht. Die Bewertungspunkte dazwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		liker.addAnswer("Es fiel mir leicht mit meinem Gegenüber zusammenzuarbeiten.");
		liker.addAnswer("Ich konnte zusammen mit meinem Gegenüber ein gemeinsames Ziel erreichen. \n");
		liker.addAnswer("Gemeinsam mit meinem Gegenüber konnten wir ein kooperatives Ergebnis erzielen.\n");
		liker.addAnswer("Ich habe verstanden, auf welches Ziel mein Gegenüber hinarbeiten wollte.");
		liker.addAnswer("Bei diesem Experiment sollte man mit anderen zusammenzuarbeiten, damit alle am Ende mehr Gewinn haben. \n");
		this.addQuestionnaireItem(liker);


		QuestionnaireSemantic semantic = new QuestionnaireSemantic("<span style=\"font-weight:normal\">Bitte bewerten Sie die folgende Aussage auf der Skala von 1 bis 7 mit den jeweiligen Endpunkten. Die Bewertungspunkte datwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Das Verhalten meines Gegenüber im Experiment empfand ich als...");
		semantic.addAnswer("Unintelligent/Intelligent");
		semantic.addAnswer("Inkompetent/Kompetent");
		semantic.addAnswer("Unwissend/Klug");
		semantic.addAnswer("Unangenehm/Angenehm");
		semantic.addAnswer("Hart/Nett");
		semantic.addAnswer("Unerfreulich/Erfreulich");
		semantic.addAnswer("Mechanisch/Kreativ");
		semantic.addAnswer("Starr/Lebendig");
		semantic.addAnswer("Künstlich/Menschlich");
		this.addQuestionnaireItem(semantic);

		semantic = new QuestionnaireSemantic("<span style=\"font-weight:normal\">Bitte bewerten Sie die folgende Aussage auf der Skala von 1 bis 7 mit den jeweiligen Endpunkten. Die Bewertungspunkte datwischen stellen Abstufungen zwischen den beiden Endpunkten dar.</span><br><br><b>Das Verhalten meines Gegenüber im Experiment empfand ich als...");
		semantic.addAnswer("Schwach/Stark");
		semantic.addAnswer("Gefügig/Dominant");
		semantic.addAnswer("Unsicher/Selbstbewusst");
		semantic.addAnswer("Unverlässlich/Verlässlich");
		semantic.addAnswer("Nicht vertrauenswürdig/Vertrauenswürdig");
		semantic.addAnswer("Unzuverlässig/Zuverlässig");
		this.addQuestionnaireItem(semantic);

		textInput = new QuestionnaireTextInput("Haben Sie weitere Anmerkungen zum Experiment?");
		this.addQuestionnaireItem(textInput);

		question = new QuestionnaireMultipleChoice("<span style=\"font-weight:normal\">Bob und John sind identisch in Bezug auf ihre körperlichen und geistigen Fähigkeiten. Die beiden erleiden Schiffbruch auf einer unbewohnten Insel, auf welcher Bananen die einzige Nahrung sind. 10 Bananen pro Tag fallen vor ihren Füßen auf den Boden, andere fallen ins Meer. Die beiden können so viele Bananen sammeln wie sie wollen, indem sie auf einen Baum klettern, die Bananen pflücken, bevor sie ins Meer fallen und dann auf einen Haufen werfen. Auf diese Weise pflückt Bob 7 Bananen pro Tag und John 3 pro Tag. Insgesamt gibt es also 20 Bananen pro Tag auf der Insel.<span style=\"font-weight:normal\"> <br> Wenn Sie über die Aufteilung der Bananen entscheiden könnten und gerecht sein möchten, welche der folgenden Aufteilungen würden Sie wählen?");
		this.addQuestionnaireItem(question);
	}
}
