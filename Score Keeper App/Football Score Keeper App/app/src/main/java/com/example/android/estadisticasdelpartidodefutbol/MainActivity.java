package com.example.android.estadisticasdelpartidodefutbol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamShotsA = 0;
    private int teamShotsB = 0;
    private int teamGoalsA = 0;
    private int teamGoalsB = 0;
    private int teamTotalCardsA = 0;
    private int teamTotalCardsB = 0;
    private int teamYellowCardsA = 0;
    private int teamYellowCardsB = 0;
    private int teamRedCardsA = 0;
    private int teamRedCardsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given shots.
     *
     * @param score of the team
     * @param teamA to know if we are going to change the shots of team A or team B.
     */
    public void displayForTeamShots(int score, boolean teamA) {
        if (teamA) {
            TextView scoreView = (TextView) findViewById(R.id.tema_a_shots);
            scoreView.setText(String.valueOf(score));
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_shots);
            scoreView.setText(String.valueOf(score));
        }
    }

    /**
     * Displays the given goals.
     *
     * @param goals of the team.
     * @param teamA to know if we are going to change the goals score of team A or team B.
     */
    public void displayForTeamGoals(int goals, boolean teamA) {
        if (teamA) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
            scoreView.setText(String.valueOf(goals));
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
            scoreView.setText(String.valueOf(goals));
        }
    }

    /**
     * Displays the total cards.
     *
     * @param cards of the team.
     * @param teamA to know if we are going to change the cards of team A or team B.
     */
    public void displayForTeamTotalCards(int cards, boolean teamA) {
        if (teamA) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_total_cards);
            scoreView.setText(String.valueOf(cards));
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_total_cards);
            scoreView.setText(String.valueOf(cards));
        }
    }

    /**
     * Displays the given goals for Team a.
     *
     * @param yellowCards of the team.
     * @param teamA       to know if we are going to change the yellow cards of team A or team B.
     */
    public void displayForTeamYellowCards(int yellowCards, boolean teamA) {
        if (teamA) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_cards);
            scoreView.setText(String.valueOf(yellowCards));
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_cards);
            scoreView.setText(String.valueOf(yellowCards));
        }
    }

    /**
     * Displays the red cards.
     *
     * @param redCards of the team.
     * @param teamA    to know if we are going to change the red cards of team A or team B.
     */
    public void displayForTeamRedCards(int redCards, boolean teamA) {
        if (teamA) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_red_cards);
            scoreView.setText(String.valueOf(redCards));
        } else {
            TextView scoreView = (TextView) findViewById(R.id.team_b_red_cards);
            scoreView.setText(String.valueOf(redCards));
        }
    }

    /**
     * Add 1 shot to team A.
     *
     * @param view
     */
    public void addShotsA(View view) {
        teamShotsA++;
        displayForTeamShots(teamShotsA, true);
    }

    /**
     * Add 1 shot to team B.
     *
     * @param view
     */
    public void addShotsB(View view) {
        teamShotsB++;
        displayForTeamShots(teamShotsB, false);
    }

    /**
     * Add 1 goal to team a.
     *
     * @param view
     */
    public void addGoalsA(View view) {
        teamGoalsA = teamGoalsA + 1;
        displayForTeamGoals(teamGoalsA, true);
    }

    /**
     * Add 1 goal to team b.
     *
     * @param view
     */
    public void addGoalsB(View view) {
        teamGoalsB++;
        displayForTeamGoals(teamGoalsB, false);

    }

    /**
     * Add 1 yellow card to team a.
     *
     * @param view
     */

    public void addYellowCardsA(View view) {
        teamYellowCardsA++;
        teamTotalCardsA++;
        displayForTeamYellowCards(teamYellowCardsA, true);
        displayForTeamTotalCards(teamTotalCardsA, true);

    }

    /**
     * Add 1 yellow card to team b.
     *
     * @param view
     */
    public void addYellowCardsB(View view) {
        teamYellowCardsB++;
        teamTotalCardsB++;
        displayForTeamYellowCards(teamYellowCardsB, false);
        displayForTeamTotalCards(teamTotalCardsB, false);

    }

    /**
     * Add 1 red card to team a.
     *
     * @param view
     */

    public void addRedCardsA(View view) {
        teamRedCardsA++;
        teamTotalCardsA++;
        displayForTeamRedCards(teamRedCardsA, true);
        displayForTeamTotalCards(teamTotalCardsA, true);
    }

    /**
     * Add 1 red card to team b
     *
     * @param view
     */

    public void addRedCardsB(View view) {
        teamRedCardsB++;
        teamTotalCardsB++;
        displayForTeamRedCards(teamRedCardsB, false);
        displayForTeamTotalCards(teamTotalCardsB, false);

    }

    /**
     * Resets all parameters for both teams.
     *
     * @param view
     */
    public void reset(View view) {
        //TEAM A
        teamShotsA = 0;
        displayForTeamShots(teamShotsA, true);
        teamGoalsA = 0;
        displayForTeamGoals(teamGoalsA, true);
        teamTotalCardsA = 0;
        displayForTeamTotalCards(teamTotalCardsA, true);
        teamYellowCardsA = 0;
        displayForTeamYellowCards(teamYellowCardsA, true);
        teamRedCardsA = 0;
        displayForTeamRedCards(teamRedCardsA, true);
        //TEAM B
        teamShotsB = 0;
        displayForTeamShots(teamShotsB, false);
        teamGoalsB = 0;
        displayForTeamGoals(teamGoalsB, false);
        teamTotalCardsB = 0;
        displayForTeamTotalCards(teamTotalCardsB, false);
        teamYellowCardsB = 0;
        displayForTeamYellowCards(teamYellowCardsB, false);
        teamRedCardsB = 0;
        displayForTeamRedCards(teamRedCardsB, false);
    }
}
