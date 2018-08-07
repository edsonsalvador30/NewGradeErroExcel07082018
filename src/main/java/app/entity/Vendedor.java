package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela VENDEDOR
 * @generated
 */
@Entity
@Table(name = "\"VENDEDOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Vendedor")
public class Vendedor implements Serializable {

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
  @Column(name = "nom_vend", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_vend;

  /**
   * Construtor
   * @generated
   */
  public Vendedor(){
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
  public Vendedor setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_vend
   * return nom_vend
   * @generated
   */
  
  public java.lang.String getNom_vend(){
    return this.nom_vend;
  }

  /**
   * Define nom_vend
   * @param nom_vend nom_vend
   * @generated
   */
  public Vendedor setNom_vend(java.lang.String nom_vend){
    this.nom_vend = nom_vend;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Vendedor object = (Vendedor)obj;
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
