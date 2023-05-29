package com.balloons;

import java.awt.Color;

/**
 * Balloon program.
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-05-15
 */
public final class main {

  /**
   * This is the main method.
   *
   * @param args //unused
   */
  public static void main(final String[] args) {
    Balloon balloon1 = new Balloon(75, 49, Color.BLUE, 1);
    Balloon balloon2 = new Balloon(30, 110, Color.PINK, 2);
    Spike spike1 = new Spike(51);

    System.out.print("Balloon1:" + balloon1.xPosition);
    System.out.println("," + balloon1.yPosition);
    System.out.print("Balloon2:" + balloon2.xPosition);
    System.out.println("," + balloon2.yPosition);
    balloon1.moveBalloon(20, -49);
    spike1.popBalloon(balloon1);
    System.out.println("moved!");
    System.out.print("Balloon1:" + balloon1.xPosition);
    System.out.println("," + balloon1.yPosition);
    System.out.print("Balloon2:" + balloon2.xPosition);
    System.out.println("," + balloon2.yPosition);

    System.out.print("Balloon1:" + balloon1.xPosition);
    System.out.println("," + balloon1.yPosition);
    System.out.print("Balloon2:" + balloon2.xPosition);
    System.out.println("," + balloon2.yPosition);
    balloon2.moveBalloon(21, -30);
    System.out.println("moved!");
    spike1.popBalloon(balloon2);
    System.out.print("Balloon1:" + balloon1.xPosition);
    System.out.println("," + balloon1.yPosition);
    System.out.print("Balloon2:" + balloon2.xPosition);
    System.out.println("," + balloon2.yPosition);

    System.out.println(spike1.xPosition + "," + Spike.Y_POSITION);
    spike1.moveSpikeHorizontally(40);
    System.out.println("moved!");
    spike1.popBalloon(balloon1);
    spike1.popBalloon(balloon2);
    System.out.println(spike1.xPosition + "," + Spike.Y_POSITION);
    if (balloon1.isPopped || balloon2.isPopped) {
      System.out.println("Popped!");
    }
  }
}
