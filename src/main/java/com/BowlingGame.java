package com;

/**
 * Created by yangliu on 18/01/2017.
 */
public class BowlingGame {
    private static final int MAX_FRAME = 10;
    private static final int MAX_PIN = 10;
    private int rolls[] = new int[22];
    private int currentRoll = 0;

    public void roll(int noOfPins) {
        rolls[currentRoll++] = noOfPins;
    }

    public int score() {
        int score = 0;
        for(int frame = 1; frame <= MAX_FRAME; frame++) {
            if(isStrike(frame)) {
                if(isStrike(frame+1)) {
                    if(frame == MAX_FRAME) {
                        score += MAX_PIN*2 + rolls[frameSecondRollNumber(frame+1)];
                    }
                    else {
                        score += MAX_PIN*2 + rolls[frameFirstRollNumber(frame+2)];
                    }
                }
                else {
                    score += MAX_PIN+ rolls[frameFirstRollNumber(frame+1)] + rolls[frameSecondRollNumber(frame+1)];
                }
            }
            else if(isSpare(frame)) {
                score += MAX_PIN + rolls[frameFirstRollNumber(frame+1)];
            }
            else {
                score += rolls[frameFirstRollNumber(frame)] + rolls[frameSecondRollNumber(frame)];
            }
        }
        return score;
    }

    private boolean isStrike(int frame) {
        return rolls[frameFirstRollNumber(frame)] == MAX_PIN;
    }

    private boolean isSpare(int frame) {
        return rolls[frameFirstRollNumber(frame)] + rolls[frameSecondRollNumber(frame)] == MAX_PIN;
    }

    private int frameFirstRollNumber(int frame) {
        return frame*2-2;
    }

    private int frameSecondRollNumber(int frame) {
        return frame*2-1;
    }
}
