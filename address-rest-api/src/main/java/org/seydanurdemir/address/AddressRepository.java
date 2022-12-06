package org.seydanurdemir.address;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class AddressRepository {

    public List<Address> addresses;

    public AddressRepository() {
        addresses = new ArrayList<Address>();
        addresses.add(new Address(0, "TR", "Istanbul", "Sariyer", "Maslak Mh", "Ahi Evran Cd", "Olive Plaza", "No:11", "Kat:9", ""));
        addresses.add(new Address(1, "TR", "Kocaeli", "Cayirova", "Akse Mh", "Rahmi Dibek Cd", "Yapi Kredi Bankacilik Ussu", "No:275", "Kat:3", ""));
    }

    public List<Address> getAllAddresses() {
        return addresses;
    }

    public Optional<Address> getAddressById(long id) {
        return addresses.stream().filter(a -> a.id == id).findFirst();
    }

    public Address createAddress(Address address) {
        addresses.add(address);
        return address;
    }

    public Address updateAddress(long id, Address address) {
        addresses.removeIf(a -> a.id == id);
        addresses.add(address);
        return address;
    }

    public boolean deleteAddress(long id) {
        return addresses.removeIf(a -> a.id == id);
    }
}
