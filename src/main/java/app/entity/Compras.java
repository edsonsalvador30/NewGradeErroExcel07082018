package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela COMPRAS
 * @generated
 */
@Entity
@Table(name = "\"COMPRAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Compras")
public class Compras implements Serializable {

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
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "qtd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer qtd;

  /**
  * @generated
  */
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_vendedor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Vendedor vendedor;

  /**
   * Construtor
   * @generated
   */
  public Compras(){
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
  public Compras setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Compras setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém qtd
   * return qtd
   * @generated
   */
  
  public java.lang.Integer getQtd(){
    return this.qtd;
  }

  /**
   * Define qtd
   * @param qtd qtd
   * @generated
   */
  public Compras setQtd(java.lang.Integer qtd){
    this.qtd = qtd;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Compras setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém vendedor
   * return vendedor
   * @generated
   */
  
  public Vendedor getVendedor(){
    return this.vendedor;
  }

  /**
   * Define vendedor
   * @param vendedor vendedor
   * @generated
   */
  public Compras setVendedor(Vendedor vendedor){
    this.vendedor = vendedor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Compras object = (Compras)obj;
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
