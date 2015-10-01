package com.aviabooking.DAO_impl;

import com.aviabooking.DAO.UserDAO;
import com.aviabooking.entity.UserEntity;
import org.hibernate.Session;
//import util.HibernateUtil;
import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vataga on 01.10.2015.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(UserEntity user) throws SQLException {
        Session session = null;
        try {
            session = session.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateUser(UserEntity user) throws SQLException {
        Session session = null;
        try {
            session = session.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public UserEntity getUserById(Long id) throws SQLException {
        Session session = null;
        UserEntity user = null;
        try {
            session = session.getSessionFactory().openSession();
            user = (UserEntity) session.load(UserEntity.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public List<UserEntity> getAllUsers() throws SQLException {
        Session session = null;
        List<UserEntity> users = new ArrayList<UserEntity>();
        try {
            session = session.getSessionFactory().openSession();
            users = session.createCriteria(UserEntity.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return users;
    }

    @Override
    public void deleteUser(UserEntity user) throws SQLException {
        Session session = null;
        try {
            session = session.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
