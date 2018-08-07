package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela COMERCIANTEPRODUTOS
 * @generated
 */
@Entity
@Table(name = "\"COMERCIANTEPRODUTOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ComercianteProdutos")
public class ComercianteProdutos implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_comerciante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Comerciante comerciante;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_produtos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Produtos produtos;

  /**
   * Construtor
   * @generated
   */
  public ComercianteProdutos(){
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
  public ComercianteProdutos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém comerciante
   * return comerciante
   * @generated
   */
  
  public Comerciante getComerciante(){
    return this.comerciante;
  }

  /**
   * Define comerciante
   * @param comerciante comerciante
   * @generated
   */
  public ComercianteProdutos setComerciante(Comerciante comerciante){
    this.comerciante = comerciante;
    return this;
  }

  /**
   * Obtém produtos
   * return produtos
   * @generated
   */
  
  public Produtos getProdutos(){
    return this.produtos;
  }

  /**
   * Define produtos
   * @param produtos produtos
   * @generated
   */
  public ComercianteProdutos setProdutos(Produtos produtos){
    this.produtos = produtos;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ComercianteProdutos object = (ComercianteProdutos)obj;
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
