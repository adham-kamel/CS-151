/**
   This interface describes the tasks that an invoice
   formatter needs to carry out.
*/
public interface InvoiceFormatter
{
   /**
      Formats the header of the invoice.
      @return the invoice header
   */
   String formatHeader();

   String formatHammerLine(Invoice invoice);
   
   String formatBundleLine(Invoice invoice);
   
   /**
      Formats a line item of the invoice.
      @return the formatted line item
   */
   /*
   String formatLineItem(LineItem item);
   */
   /**
      Formats the footer of the invoice.
      @return the invoice footer
   */
   String formatFooter(Invoice invoice);
}