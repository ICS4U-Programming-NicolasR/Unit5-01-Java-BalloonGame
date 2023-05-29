package com.balloons;

import java.awt.*;

/**
 * Sort with Select sort.
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-05-15
 */
public final class Balloon {
  int xPosition;
  int yPosition;
  Color color;
  boolean isPopped;
  int id;

  /**
   * This is the balloon method.
   *
   * @param xPos // x position
   * @param yPos // y position
   * @param colour // colour
   * @param id // id
   * @return nums
   */
  public Balloon(int xPos, int yPos, Color inputColour, int inputId) {
    xPosition = xPos;
    yPosition = yPos;
    color = inputColour;
    id = inputId;
  }

  public void moveBalloon(int xSpaces, int ySpaces) {
    this.xPosition = xPosition + xSpaces;
    this.yPosition = yPosition + ySpaces;
  }

  public void changeColour(Color colour) {
    this.color = colour;
  }
}
