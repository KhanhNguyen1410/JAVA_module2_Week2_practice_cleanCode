package refactoring;

public class TennisGame {
    private static final int SCORE_WIN = 4;
    private static final int ADVANTAGE = 1;
    public static final int LEVEL0 = 0;
    public static final int LEVEL1 = 1;
    public static final int LEVEL2 = 2;
    public static final int LEVEL3 = 3;
    private static String scoreCall = "";
    String player1Name, player2Name;
    int scorePlayer1, scorePlayer2;

    public TennisGame() {
    }

    public TennisGame(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.scorePlayer1 = scorePlayer1;
        this.scorePlayer2 = scorePlayer2;
    }

    public String getScoreTied() {

        switch (scorePlayer1) {
            case LEVEL0:
                scoreCall = "Love-All";
                break;
            case LEVEL1:
                scoreCall = "Fifteen-All";
                break;
            case LEVEL2:
                scoreCall = "Thirty-All";
                break;
            case LEVEL3:
                scoreCall = "Forty-All";
                break;
            default:
                scoreCall = "Deuce";
                break;

        }
        return scoreCall;
    }


    public String getPlayerWin() {

        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == ADVANTAGE) scoreCall = "Advantage player1";
        else if (minusResult == -ADVANTAGE) scoreCall = "Advantage player2";
        else if (minusResult >= 2) scoreCall = "Win for player1";
        else scoreCall = "Win for player2";
        return scoreCall;
    }

    public String getScoreInMatch() {
        int tempScore = 0;
        for (int score = 1; score < 3; score++) {
            if (score == 1) tempScore = scorePlayer1;
            else {
                scoreCall += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    scoreCall += "Love";
                    break;
                case 1:
                    scoreCall += "Fifteen";
                    break;
                case 2:
                    scoreCall += "Thirty";
                    break;
                case 3:
                    scoreCall += "Forty";
                    break;
            }
        }
        return scoreCall;
    }

    public void disPlay() {
        boolean scoreTied = scorePlayer1 == scorePlayer2;boolean player1Win = scorePlayer1 >= SCORE_WIN;
        boolean player2Win = scorePlayer2 >= SCORE_WIN;

        if (scoreTied) {
            System.out.println(getScoreTied());
        } else if (player1Win || player2Win) {
            System.out.println(getPlayerWin());
        } else {
            System.out.println(getScoreInMatch());
        }
    }
}


//    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
//        int tempScore=0;
//        boolean scoreTied = scorePlayer1 == scorePlayer2;
//        if (scoreTied)
//        {
//            switch (scorePlayer1)
//            {
//                case LEVEL0:
//                    scoreCall = "Love-All";
//                    break;
//                case LEVEL1:
//                    scoreCall = "Fifteen-All";
//                    break;
//                case LEVEL2:
//                    scoreCall = "Thirty-All";
//                    break;
//                case LEVEL3:
//                    scoreCall = "Forty-All";
//                    break;
//                default:
//                    scoreCall = "Deuce";
//                    break;
//
//            }
//        }
//        else {
//            boolean player1Win = scorePlayer1 >= SCORE_WIN;
//            boolean player2Win = scorePlayer2 >= SCORE_WIN;
//            if (player1Win || player2Win)
//            {
//                int minusResult = scorePlayer1-scorePlayer2;
//                if (minusResult==ADVANTAGE) scoreCall ="Advantage player1";
//                else if (minusResult =ADVANTAGE) scoreCall ="Advantage player2";
//                else if (minusResult>=2) scoreCall = "Win for player1";
//                else scoreCall ="Win for player2";
//            }
//            else
//            {
//                for (int i=1; i<3; i++)
//                {
//                    if (i==1) tempScore = scorePlayer1;
//                    else { scoreCall+="-"; tempScore = scorePlayer2;}
//                    switch(tempScore)
//                    {
//                        case 0:
//                            scoreCall+="Love";
//                            break;
//                        case 1:
//                            scoreCall+="Fifteen";
//                            break;
//                        case 2:
//                            scoreCall+="Thirty";
//                            break;
//                        case 3:
//                            scoreCall+="Forty";
//                            break;
//                    }
//                }
//            }
//        }
//        return scoreCall;
//    }

