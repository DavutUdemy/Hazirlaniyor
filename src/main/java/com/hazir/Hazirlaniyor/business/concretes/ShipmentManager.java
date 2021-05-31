package com.hazir.Hazirlaniyor.business.concretes;

import com.hazir.Hazirlaniyor.business.abstracts.ShipmentService;
import com.hazir.Hazirlaniyor.dataAccess.abstracts.ShipmentDao;
import com.hazir.Hazirlaniyor.entity.concretes.Shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
  public class ShipmentManager implements ShipmentService {
 	private final ShipmentDao shipmentDao;
@Autowired
	public ShipmentManager(ShipmentDao shipmentDao) {
 		this.shipmentDao = shipmentDao;
	}

	@Override
	public void addNewShipment(Shipment shipment) {
		this.shipmentDao.save (shipment);
	}

	@Override
	public void deleteById(Long Id) {
  this.shipmentDao.deleteById (Id);
	}

	@Override
	public List<Shipment> getAllShipments() {
		return this.shipmentDao.findAll ();
	}

	@Override
	public List<Shipment> findShipmentsByFirstName(String firstName) {
		return this.shipmentDao.findShipmentByName (firstName);
	}

	@Override
	public List<Shipment> getCanceledShipment( ) {
 			return this.shipmentDao.findShipmentByCanceledOrder (false);
		}

	@Override
	public Integer cancelShipment(Shipment shipment,Long Id) {
		LocalDateTime expiresDate = shipment.getPaymentDate ().plusDays (4);

		if(expiresDate.isBefore(LocalDateTime.now())){
			throw new IllegalStateException ("You can not cancel your order");
		}
		return this.shipmentDao.cancelOrder(Id);
	}






}
