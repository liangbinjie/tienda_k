package com.tienda_k.service;

import com.tienda_k.domain.Cliente;
import java.util.List;


public interface ClienteService {
    // Se obtiene un listado de clientes en un List
    public List<Cliente> getClientes();
    
    // se obtiene un Cliente, a partir del id de un cliente.
    public Cliente getCliente(Cliente cliente);
    
    // se inserta un nuevo cliente si el id del cliente esta vacio
    // se actualiza un cliente si el id del cliente NO esta vacio
    public void save(Cliente cliente);
    
    // se elimina el cliente que tiene el id pasado por parametro
    public void delete(Cliente cliente);
    
}
