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
package stock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class PortfolioTest
{
   @Test
   public void givenTwoStocks_getMarketValue_returnsCorrectMarketValue()
   {
      // GIVEN
      final Portfolio sut = mock( Portfolio.class );

      // WHEN
      when( sut.getMarketValue() ).thenReturn( 200 );
      final int result = sut.getMarketValue();

      // THEN
      Assert.assertEquals( 200, result );
   }
}
