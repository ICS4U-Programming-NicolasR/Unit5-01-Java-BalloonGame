package com.balloons;

public class Spike {
  int xPosition;

  public static final int Y_POSITION = 80;

  public Spike(int posX) {
    xPosition = posX;
  }

  public void popBalloon(Balloon balloon) {
    if (xPosition == balloon.xPosition && Y_POSITION == balloon.yPosition) {
      balloon.isPopped = true;
    }
  }

  public void moveSpikeHorizontally(int spaces) {
    this.xPosition = xPosition + spaces;
  }
}
