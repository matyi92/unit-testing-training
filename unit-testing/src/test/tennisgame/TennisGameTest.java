/************************************************************************
 ** PROJECT:   XVP
 ** LANGUAGE:  Java, J2SE JDK 1.8
 **
 ** COPYRIGHT: FREQUENTIS AG
 **            Innovationsstrasse 1
 **            A-1100 VIENNA
 **            AUSTRIA
 **            tel +43 1 811 50-0
 **
 ** The copyright to the computer program(s) herein
 ** is the property of Frequentis AG, Austria.
 ** The program(s) shall not be used and/or copied without
 ** the written permission of Frequentis AG.
 **
 ************************************************************************/
package tennisgame;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TennisGameTest
{
   @Parameterized.Parameters(name = "playerOneScore={0} ; playerTwoScore={1} ; score={2}")
   public static Collection<Object[]> data()
   {
      return Arrays.asList( new Object[][] {
            { 0, 0, "Love All" }, { 1, 0, "Fifteen Love" }, { 2, 0, "Thirty Love" },
            { 3, 0, "Forty Love" }, { 0, 1, "Love Fifteen" }, { 1, 1, "Fifteen All" },
            { 2, 2, "Thirty All" }, { 3, 3, "Deuce" }, { 4, 3, "Player1 Advantage" },
            { 3, 4, "Player2 Advantage" }, { 5, 4, "Player1 Advantage" },
            { 4, 5, "Player2 Advantage" },
      } );
   }


   @Parameterized.Parameter
   public int playerOneScore;

   @Parameterized.Parameter(1)
   public int playerTwoScore;

   @Parameterized.Parameter(2)
   public String score;


   @Test
   public void givenPlayersScored_getScore_scoreIsCorrect()
   {
      // GIVEN
      final TennisGame tennisGame = new TennisGame();
      for ( int i = 0; i < this.playerOneScore; i++ )
      {
         tennisGame.playerOneScores();
      }

      for ( int i = 0; i < this.playerTwoScore; i++ )
      {
         tennisGame.playerTwoScores();
      }
      // WHEN
      // THEN
      Assert.assertEquals( this.score, tennisGame.getScore() );
   }
}
