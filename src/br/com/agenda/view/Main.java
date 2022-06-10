/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.agenda.view;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cassi
 */
public class Main {
    
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoDAO();
        
        Contato contato = new Contato();
        /*
        contato.setNome("Teste3");
        contato.setIdade(21);
        contato.setDataCadastro(new Date());
        */
        
       // contatoDAO.create(contato);
        
        /*
        for(Contato c : contatoDAO.read()){
        System.out.println("Contato: "+ c.getNome());
        System.out.println("Idade: "+c.getIdade());
        System.out.println("Data de cadastro: "+c.getDataCadastro());
        }*/
        
        //contatoDAO.read();
        
       
        Contato contatoedit = new Contato();
        /*
        contatoedit.setNome("Joao Benedito");
        contatoedit.setIdade(44);
        contatoedit.setDataCadastro(new Date());
        contatoedit.setId(3);*/
        
       // contatoDAO.update(contatoedit);
        
        contatoDAO.delete(5);
    }
    
}
