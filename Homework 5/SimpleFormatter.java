/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {

      return "     I N V O I C E\n\n\n";
   }

   public String formatHammerLine(Invoice invoice){
	   
	   return (String.format("%dx Hammer: $%.2f ($%.2f each)\n",invoice.getHammerCount(), invoice.getHammerSingle(), invoice.getHammerTotal()));
   }
   
   public String formatBundleLine(Invoice invoice){
	    return (String.format("%dx Bundle: $%.2f ($%.2f each)\n",invoice.getBundleCount(), invoice.getBundleSingle(), invoice.getBundleTotal()));
   }
   /*
   public String formatLineItem(LineItem item)
   {
      total += item.getPrice();
      if (item.toString().equals("Hammer")){
    	  hammerTotal += item.getPrice();
    	  return (String.format("%s: $%.2f ($%.2f each)\n",item.toString(), hammerTotal, item.getPrice()));
      }
      if (item.toString().contains("Ass")){
    	  bundleTotal += item.getPrice();
    	  return (String.format("%s: $%.2f ($%.2f each)\n",item.toString(), bundleTotal, item.getPrice()));
      }
      return "";
      
   }
	*/
   public String formatFooter(Invoice invoice)
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", invoice.getTotalPrice()));
   }


}