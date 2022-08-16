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

public class Stock
{
   private String stockId;

   private String name;

   private int quantity;


   public Stock( final String stockId, final String name, final int quantity )
   {
      this.stockId = stockId;
      this.name = name;
      this.quantity = quantity;
   }


   public String getStockId()
   {
      return this.stockId;
   }


   public String getName()
   {
      return this.name;
   }


   public int getQuantity()
   {
      return this.quantity;
   }


   public void setStockId( final String stockId )
   {
      this.stockId = stockId;
   }


   public void setName( final String name )
   {
      this.name = name;
   }


   public void setQuantity( final int quantity )
   {
      this.quantity = quantity;
   }
}
