package org.seydanurdemir.address;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/addresses")
public class AddressResource {

    @Inject
    AddressRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAddresses() {
        return Response.ok(repository.getAllAddresses()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAddressById(@PathParam("id") long id) {
        return Response.ok(repository.getAddressById(id)).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAddress(@Valid Address address) {
        return Response.ok(repository.createAddress(address)).build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAddress(@PathParam("id") long id, @Valid Address address) {
        return Response.ok(repository.updateAddress(id, address)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAddress(@PathParam("id") long id) {
        repository.deleteAddress(id);
        return Response.noContent().build();
    }
}
