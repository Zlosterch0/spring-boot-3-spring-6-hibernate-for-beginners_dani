package com.luv2code.springboot.demo.mycoolapp.db.daos;

import com.luv2code.springboot.demo.mycoolapp.db.entities.Student;
import jakarta.persistence.EntityManager;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

  private final EntityManager em;

  @Autowired
  public StudentDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public Student save(Student student) {
    Student s = em.merge(student);
    return s;
  }

  @Override
  public void deleteById(int id) {
    Student student = em.find(Student.class, id);
    em.remove(student);
  }

  @Override
  public Student getById(int id) {
    return em.find(Student.class, id);
  }

  @Override
  public List<Student> findAll() {
    return em.createQuery("from Student", Student.class).getResultList();
  }
}
