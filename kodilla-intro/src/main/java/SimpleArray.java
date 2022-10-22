public class SimpleArray {
    public static void main(String[] args) {
        String[] brandsOfPhones = new String[] {"Samsung", "Apple", "Xiaomi", "Nokia", "Oppo"};
        System.out.println(brandsOfPhones[1]);
        String phone = brandsOfPhones[3];
        System.out.println(phone);
        int numberOfElements = brandsOfPhones.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
