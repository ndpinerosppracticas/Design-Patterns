public class NullCustomer extends AbstrCustomer {

   @Override
   public String getName() {
      return "No disponible en la base de datos de clientes";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}