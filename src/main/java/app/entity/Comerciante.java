package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela COMERCIANTE
 * @generated
 */
@Entity
@Table(name = "\"COMERCIANTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Comerciante")
public class Comerciante implements Serializable {

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
  @Column(name = "nome_comer", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome_comer;

  /**
   * Construtor
   * @generated
   */
  public Comerciante(){
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
  public Comerciante setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome_comer
   * return nome_comer
   * @generated
   */
  
  public java.lang.String getNome_comer(){
    return this.nome_comer;
  }

  /**
   * Define nome_comer
   * @param nome_comer nome_comer
   * @generated
   */
  public Comerciante setNome_comer(java.lang.String nome_comer){
    this.nome_comer = nome_comer;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Comerciante object = (Comerciante)obj;
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
