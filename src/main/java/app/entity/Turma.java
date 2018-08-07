package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TURMA
 * @generated
 */
@Entity
@Table(name = "\"TURMA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Turma")
public class Turma implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nom_Turma", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_Turma;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_professor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Professor professor;

  /**
   * Construtor
   * @generated
   */
  public Turma(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Turma setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_Turma
   * return nom_Turma
   * @generated
   */
  
  public java.lang.String getNom_Turma(){
    return this.nom_Turma;
  }

  /**
   * Define nom_Turma
   * @param nom_Turma nom_Turma
   * @generated
   */
  public Turma setNom_Turma(java.lang.String nom_Turma){
    this.nom_Turma = nom_Turma;
    return this;
  }

  /**
   * Obtém professor
   * return professor
   * @generated
   */
  
  public Professor getProfessor(){
    return this.professor;
  }

  /**
   * Define professor
   * @param professor professor
   * @generated
   */
  public Turma setProfessor(Professor professor){
    this.professor = professor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Turma object = (Turma)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
