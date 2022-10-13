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
		this.setTitleText("Verhalten im Experiment");
		this.setPreText("Klicken Sie \"Weiter\", um mit dem Fragebogen zum Ihrem Verhalten im Experiment zu beginnen.");
		this.setPostText("Sie haben den Fragebogen erfolgreich abgeschlossen.<br>Klicken Sie \"Weiter\", um das Experiment zu beenden.");
		QuestionnaireMultipleChoice question;


		QuestionnaireLikert liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
		//<br><i><br>1... Ich stimme überhaupt nicht zu<br>2... Ich stimme eher nicht zu</i>");
			/*liker.addAnswer("Ich mag den Wettbewerb.                                                                                                ");
			liker.addAnswer("Ich genieße es, gegen Andere anzutreten.                                                                       ");
			liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.                                     ");
			liker.addAnswer("Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.                                         ");
			liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.                                                                      ");
			liker.addAnswer("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden.                     ");
			liker.addAnswer("Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.            ");*/
		liker.addAnswer("Ich mag den Wettbewerb.");
		liker.addAnswer("Ich genieße es, gegen Andere anzutreten.");
		liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.");
		liker.addAnswer("Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.");
		liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.");
		liker.addAnswer("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden.");
		liker.addAnswer("Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
		this.addQuestionnaireItem(liker);

		QuestionnaireTextInput textInput = new QuestionnaireTextInput("Wie würden Sie Ihre Strategie in eigenen Worten beschreiben?");
		this.addQuestionnaireItem(textInput);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über Ihren Gegenüber im Experiment zustimmen.");
		liker.addAnswer("Mein Gegenüber mag den Wettbewerb.");
		liker.addAnswer("Mein Gegenüber genießt es, gegen Andere anzutreten.");
		liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf meinen Gegenüber.");
		liker.addAnswer("Mein Gegenüber ist jemand, der gerne gewinnt und es hasst zu verlieren");
		liker.addAnswer("Mein Gegenüber versuchte oft, mich zu übertrumpfen.");
		liker.addAnswer("Das Ziel meines Gegenübers im Experiment war, besser als ich abzuschneiden.");
		liker.addAnswer("Das Ziel meines Gegenübers im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
		this.addQuestionnaireItem(liker);

		textInput = new QuestionnaireTextInput("Wie würden Sie die Strategie Ihres Gegenübers in eigenen Worten beschreiben?\n");
		this.addQuestionnaireItem(textInput);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen zustimmen.");
		liker.addAnswer("Bei diesem Experiment konnte man mit anderen zusammenzuarbeiten, damit alle am Ende mehr Gewinn haben.");
		liker.addAnswer("Ich war bemüht ein vorgegebenes Ziel zu erreichen.");
		liker.addAnswer("Ich habe versucht, mit meinem Gegenüber zusammenzuarbeiten.");
		liker.addAnswer("Es fiel mir leicht mit meinem Gegenüber zusammenzuarbeiten.");
		liker.addAnswer("Ich habe verstanden, auf welches Ziel mein Gegenüber hinarbeiten wollte.");
		liker.addAnswer("Ich konnte zusammen mit meinem Gegenüber ein gemeinsames Ziel erreichen.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über Ihren Gegenüber zustimmen.");
		liker.addAnswer("Mein Gegenüber war bemüht ein vorgegebenes Ziel zu erreichen.");
		liker.addAnswer("Mein Gegenüber hat versucht, mit mir zusammenzuarbeiten.");
		liker.addAnswer("Es war für meinen Gegenüber leicht, mit mir zusammenzuarbeiten.");
		liker.addAnswer("Mein Gegenüber hat verstanden, auf welches Ziel ich hinarbeiten wollte.");
		liker.addAnswer("Mein Gegenüber konnte mit mir ein gemeinsames Ziel erreichen.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über Ihr eigenes Verhalten im Experiment zustimmen.");
		liker.addAnswer("Ich habe mich intelligent verhalten.");
		liker.addAnswer("Ich habe mich kompetent verhalten.");
		liker.addAnswer("Ich habe mich klug verhalten.");
		liker.addAnswer("Ich habe mich freundlich verhalten.");
		liker.addAnswer("Ich habe mich nett verhalten.");
		liker.addAnswer("Ich habe mich angenehm verhalten.");
		liker.addAnswer("Ich habe mich lebendig verhalten.");
		liker.addAnswer("Ich habe mich beweglich verhalten.");
		liker.addAnswer("Ich habe mich künstlich verhalten.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über Ihr eigenes Verhalten im Experiment zustimmen.");
		liker.addAnswer("Ich habe mich gewöhnlich verhalten.");
		liker.addAnswer("Ich habe mich kreativ verhalten.");
		liker.addAnswer("Ich habe mich für meinen Gegenüber nachvollziehbar verhalten.");
		liker.addAnswer("Ich habe eine starke Position eingenommen");
		liker.addAnswer("Ich habe mich dominant verhalten.");
		liker.addAnswer("Ich habe mich selbstvewusst verhalten.");
		liker.addAnswer("Mein Verhalten war verlässlich.");
		liker.addAnswer("Mein Verhalten war vertrauenswürdig.");
		liker.addAnswer("Mein Verhalten war glaubwürdig.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über das Verhalten Ihres Gegenüber im Experiment zustimmen.");
		liker.addAnswer("Mein Gegenüber hat sich intelligent verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich kompetent verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich klug verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich freundlich verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich nett verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich angenehm verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich lebendig verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich beweglich verhalten.");
		this.addQuestionnaireItem(liker);

		liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über das Verhalten Ihres Gegenüber im Experiment zustimmen.");
		liker.addAnswer("Mein Gegenüber hat sich künstlich verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich gewöhnlich verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich kreativ verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich für mich nachvollziehbar verhalten.");
		liker.addAnswer("Mein Gegenüber hat eine starke Position eingenommen");
		liker.addAnswer("Mein Gegenüber hat sich dominant verhalten.");
		liker.addAnswer("Mein Gegenüber hat sich selbstvewusst verhalten.");
		liker.addAnswer("Das Verhalten meines Gegenübers war verlässlich.");
		liker.addAnswer("Das Verhalten meines Gegenübers war vertrauenswürdig.");
		liker.addAnswer("Das Verhalten meines Gegenübers war glaubwürdig.");
		this.addQuestionnaireItem(liker);

	}
}
