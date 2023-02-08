package com.tienda_k.controller;

import com.tienda_k.domain.Cliente;
import com.tienda_k.service.ClienteService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    @GetMapping("/")
    public String inicio(Model model) {
        
        var clientes = clienteService.getClientes();
        
        model.addAttribute("clientes", clientes);
        return "index";
    }
}
