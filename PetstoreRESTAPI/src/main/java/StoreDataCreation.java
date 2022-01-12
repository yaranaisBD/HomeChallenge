import com.github.javafaker.Faker;


public class StoreDataCreation {
	public static StorePOJO store = new StorePOJO();
    public static Faker randomValue = new Faker();

    public StorePOJO NewOrderData()
    {
        store.setId(randomValue.number().numberBetween(13,999));
        store.setPetID(String.valueOf(randomValue.number().numberBetween(3000,10000)));
        store.setQuantity(randomValue.number().randomDigit());
        store.setShipDate("2021-03-14T12:39:37.622Z");
        store.setStatus("approved");
        store.setComplete(randomValue.bool().bool());

        return store;
    }
}

