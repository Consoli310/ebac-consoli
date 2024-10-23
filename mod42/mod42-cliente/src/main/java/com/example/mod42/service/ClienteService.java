package com.example.mod42.service;

import com.example.mod42.DTO.ClienteDTO;
import com.example.mod42.entity.Cliente;
import com.example.mod42.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    private final RestTemplate restTemplate;

    public ClienteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ClienteDTO buscarProduto(Long produtoId) {
        String produtoServiceUrl = "http://produto-service/produtos/" + produtoId;
        return restTemplate.getForObject(produtoServiceUrl, ClienteDTO.class);
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public Cliente atualizarCliente(Long id, Cliente cliente) {
        Cliente clienteExistente = buscarClientePorId(id);
        clienteExistente.setName(cliente.getName());
        clienteExistente.setEmail(cliente.getEmail());
        clienteExistente.setTelefone(cliente.getTelefone());
        return clienteRepository.save(clienteExistente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
