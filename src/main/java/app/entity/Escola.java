package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ESCOLA
 * @generated
 */
@Entity
@Table(name = "\"ESCOLA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Escola")
public class Escola implements Serializable {

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
  @Column(name = "nom_escola", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_escola;

  /**
   * Construtor
   * @generated
   */
  public Escola(){
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
  public Escola setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_escola
   * return nom_escola
   * @generated
   */
  
  public java.lang.String getNom_escola(){
    return this.nom_escola;
  }

  /**
   * Define nom_escola
   * @param nom_escola nom_escola
   * @generated
   */
  public Escola setNom_escola(java.lang.String nom_escola){
    this.nom_escola = nom_escola;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Escola object = (Escola)obj;
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
