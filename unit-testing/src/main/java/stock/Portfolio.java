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

import java.util.ArrayList;
import java.util.List;

public class Portfolio
{
   private StockService stockService;

   private List<Stock> stocks = new ArrayList<>();


   public StockService getStockService()
   {
      return this.stockService;
   }


   public void setStockService( final StockService stockService )
   {
      this.stockService = stockService;
   }


   public List<Stock> getStocks()
   {
      return this.stocks;
   }


   public void setStocks( final List<Stock> stocks )
   {
      this.stocks = stocks;
   }


   public void addStocks( final Stock stock )
   {
      this.stocks.add( stock );
   }


   public int getMarketValue()
   {
      return this.stocks.stream().mapToInt( stock -> this.stockService.getPrice( stock ) * stock.getQuantity() ).sum();
   }
}
