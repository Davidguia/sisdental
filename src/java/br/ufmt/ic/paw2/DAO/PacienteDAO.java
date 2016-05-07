/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.paw2.DAO;

import br.ufmt.ic.paw2.entities.Paciente;
import br.ufmt.paw2.model.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DavidFrancisco
 */
public class PacienteDAO {
    
    public List<Paciente> getListPaciente(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        List listaPaciente = session
                .createQuery("from Paciente a ORDER BY nome ASC").list();
        t.commit();
        return listaPaciente;
    }
    
    public void gravar(final Paciente paciente) {
        
        Paciente merge;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        if ((paciente != null) && (paciente.getId() > 0)) {
            merge = (Paciente)session.merge(paciente);
            session.persist(merge);
        }            
        
        else
            session.persist(paciente);
                
        t.commit();

    }
    
    public void excluir(final Paciente paciente) {
        
        Paciente merge;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        if ((paciente != null) && (paciente.getId() > 0)) {
            merge = (Paciente)session.merge(paciente);
            session.delete(merge);
        }
                
        t.commit();

    }
    
    
}
