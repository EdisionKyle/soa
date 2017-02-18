package com.miles.cxf.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/fruit")
public class FruitService {

	private Map<String, Integer> fruitBasket = new ConcurrentHashMap<String, Integer>();

	// you can test this using curl from the command line.
	// curl http://localhost/cxf/fruit/
	@GET()
	@Produces({ "application/json" })
	public Map<String, Integer> getAllFruits() {
		return fruitBasket;
	}

	// you can test this using curl from the command line.
	// curl http://localhost/cxf/fruit/pineapple
	@GET()
	@Path("/{fruit}")
	@Produces({ "application/json" })
	public Integer getFruitCount(@PathParam("fruit") String fruit) {
		Integer integer = fruitBasket.get(fruit);
		if (integer == null) {
			return 0;
		}
		return integer;
	}

	// you can test this using curl from the command line.
	// curl -X PUT http://localhost/cxf/fruit/pineapple/3
	@PUT()
	@Path("/{fruitName}/{count}")
	public void addFruit(@PathParam("fruitName") String fruit,
			@PathParam("count") String count) {
		fruitBasket.put(fruit, Integer.parseInt(count));
	}

}
