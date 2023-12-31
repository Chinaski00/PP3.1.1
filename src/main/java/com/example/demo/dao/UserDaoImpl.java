package com.example.demo.dao;

import com.example.demo.model.User;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Transactional
    @Override
    public void updateUser(Long id, User updatedUser) {
        em.merge(updatedUser);
    }

    @Transactional
    @Override
    public void removeUser(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));
    }

    @Override
    public User getUserById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getListUser() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
