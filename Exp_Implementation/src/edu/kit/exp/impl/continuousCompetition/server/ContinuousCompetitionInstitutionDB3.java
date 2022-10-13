package edu.kit.exp.impl.continuousCompetition.server;

import edu.kit.exp.server.communication.ServerMessageSender;
import edu.kit.exp.server.jpa.entity.Membership;

import java.util.List;

/**
 * Created by dschnurr on 05.03.14.
 */
public class ContinuousCompetitionInstitutionDB3 extends ContinuousCompetitionInstitution {

    public ContinuousCompetitionInstitutionDB3(ContinuousCompetitionEnvironmentTriopoly environment, List<Membership> memberships, ServerMessageSender messageSender, String gameId) {
        super(environment, memberships, messageSender, gameId);
    }

    @Override
    protected void setupTreatmentConditions() {
        isTriopolyTreatment = true;
        isCournotTreatment = false;
        isDiscreteTreatment = true;
        isDecisionSupport = false;
        duration = 900000;
        updateTimeStep = 15000;
    }





}
