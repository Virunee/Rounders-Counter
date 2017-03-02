package uk.co.virunee.rounderscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0.0);
        displayForTeamAOut(0);
        displayForTeamB(0.0);
        displayForTeamBOut(0);
    }

    double team_a_score = 0;
    int team_a_outs = 0;
    double team_b_score = 0;
    int team_b_outs = 0;

    public void addOneRounderA(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }

    public void addHalfRounderA(View view) {
        team_a_score = team_a_score + 0.5;
        displayForTeamA(team_a_score);
    }

    public void addOneOutA(View view) {
        team_a_outs = team_a_outs + 1;
        displayForTeamAOut(team_a_outs);
    }


    //Displays the given score for Team A.

    public void displayForTeamA(double team_a_score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(team_a_score));
    }

    public void displayForTeamAOut(int team_a_outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(team_a_outs));
    }

    // TEAM B //

    public void addOneRounderB(View view) {
        team_b_score = team_b_score + 1;
        displayForTeamB(team_b_score);
    }

    public void addHalfRounderB(View view) {
        team_b_score = team_b_score + 0.5;
        displayForTeamB(team_b_score);
    }

    public void addOneOutB(View view) {
        team_b_outs = team_b_outs + 1;
        displayForTeamBOut(team_b_outs);
    }


    //Displays the given score for Team B.

    public void displayForTeamB(double team_b_score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(team_b_score));
    }

    public void displayForTeamBOut(int team_b_outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(team_b_outs));
    }

    // OVERFLOW MENU STUFF //

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
