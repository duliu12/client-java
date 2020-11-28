package com.ustc.qinpark.client.service;

import com.ustc.qinpark.client.dto.ClientsDTO;
import com.ustc.qinpark.client.entity.Client;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface ClientService {

    public ClientsDTO listAllClient();
    public Client findClientById(int id);
    public void update(Client client);
    public void add(Client client);
    public void deleteClientById(int id);
    public void changeStatus(int id,String status);
    public void saveStatus(int id,String status,int currsize);
}
