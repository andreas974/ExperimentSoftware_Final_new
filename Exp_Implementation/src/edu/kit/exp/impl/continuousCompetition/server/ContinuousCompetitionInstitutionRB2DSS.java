package edu.kit.exp.impl.continuousCompetition.server;

import edu.kit.exp.server.communication.ServerMessageSender;
import edu.kit.exp.server.jpa.entity.Membership;

import java.util.List;

/**
 * Created by dschnurr on 17.10.14.
 */
public class ContinuousCompetitionInstitutionRB2DSS extends ContinuousCompetitionInstitution {

    public ContinuousCompetitionInstitutionRB2DSS(ContinuousCompetitionEnvironmentDuopoly environment, List<Membership> memberships, ServerMessageSender messageSender, String gameId) {
        super(environment, memberships, messageSender, gameId);
    }

    @Override
    protected void setupTreatmentConditions() {
        isTriopolyTreatment = false;
        isCournotTreatment = false;
        isDiscreteTreatment = false;
        isDecisionSupport = true;
        //duration = 120000;
        //duration = 5000;
        duration = 1800000;
        updateTimeStep = 500;
    }

}
