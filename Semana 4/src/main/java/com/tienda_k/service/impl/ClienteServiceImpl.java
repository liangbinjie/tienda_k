package com.tienda_k.service.impl;

import com.tienda_k.dao.ClienteDao;
import com.tienda_k.domain.Cliente;
import com.tienda_k.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly=true)
    public List<Cliente> getClientes() {
        return clienteDao.findAll();
    }
}
