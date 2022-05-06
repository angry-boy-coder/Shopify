package kz.microhard.microdelivery.repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<DeliveryEntity, Long> {

}
