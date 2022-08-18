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
package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest
{
   @Test
   public void sum1And1_equals2()
   {
      // GIVEN
      final Calculator calculator = new Calculator();
      // WHEN
      final int result = calculator.sum( 1, 1 );
      // THEN
      Assert.assertEquals( 2, result );
   }


   @Test
   public void sum1And2_equals3()
   {
      // GIVEN
      final Calculator calculator = new Calculator();
      // WHEN
      final int result = calculator.sum( 1, 2 );
      // THEN
      Assert.assertEquals( 3, result );
   }

}
