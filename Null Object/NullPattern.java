public class NullPattern {
   public static void main(String[] args) {

      AbstrCustomer customer1 = CustomerFactory.getCustomer("Rob");
      AbstrCustomer customer2 = CustomerFactory.getCustomer("Bob");
      AbstrCustomer customer3 = CustomerFactory.getCustomer("Julie");
      AbstrCustomer customer4 = CustomerFactory.getCustomer("Laura");

      System.out.println("Clientes");
      System.out.println(customer1.getName());
      System.out.println(customer2.getName());
      System.out.println(customer3.getName());
      System.out.println(customer4.getName());
   }
}