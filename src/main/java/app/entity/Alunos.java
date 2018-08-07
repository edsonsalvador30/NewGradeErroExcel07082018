package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNOS
 * @generated
 */
@Entity
@Table(name = "\"ALUNOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Alunos")
public class Alunos implements Serializable {

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
  @Column(name = "nom_Aluno", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_Aluno;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_turma", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Turma turma;

  /**
   * Construtor
   * @generated
   */
  public Alunos(){
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
  public Alunos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_Aluno
   * return nom_Aluno
   * @generated
   */
  
  public java.lang.String getNom_Aluno(){
    return this.nom_Aluno;
  }

  /**
   * Define nom_Aluno
   * @param nom_Aluno nom_Aluno
   * @generated
   */
  public Alunos setNom_Aluno(java.lang.String nom_Aluno){
    this.nom_Aluno = nom_Aluno;
    return this;
  }

  /**
   * Obtém turma
   * return turma
   * @generated
   */
  
  public Turma getTurma(){
    return this.turma;
  }

  /**
   * Define turma
   * @param turma turma
   * @generated
   */
  public Alunos setTurma(Turma turma){
    this.turma = turma;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Alunos object = (Alunos)obj;
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
