package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DISTRIBUIDOR
 * @generated
 */
@Entity
@Table(name = "\"DISTRIBUIDOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Distribuidor")
public class Distribuidor implements Serializable {

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
  @Column(name = "nom_dist", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_dist;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_compras", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Compras compras;

  /**
   * Construtor
   * @generated
   */
  public Distribuidor(){
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
  public Distribuidor setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_dist
   * return nom_dist
   * @generated
   */
  
  public java.lang.String getNom_dist(){
    return this.nom_dist;
  }

  /**
   * Define nom_dist
   * @param nom_dist nom_dist
   * @generated
   */
  public Distribuidor setNom_dist(java.lang.String nom_dist){
    this.nom_dist = nom_dist;
    return this;
  }

  /**
   * Obtém compras
   * return compras
   * @generated
   */
  
  public Compras getCompras(){
    return this.compras;
  }

  /**
   * Define compras
   * @param compras compras
   * @generated
   */
  public Distribuidor setCompras(Compras compras){
    this.compras = compras;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Distribuidor object = (Distribuidor)obj;
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
