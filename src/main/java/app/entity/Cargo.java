package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARGO
 * @generated
 */
@Entity
@Table(name = "\"CARGO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cargo")
public class Cargo implements Serializable {

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
  @Column(name = "descricao_cargo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao_cargo;

  /**
  * @generated
  */
  @Column(name = "Salario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double salario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Funcionario funcionario;

  /**
   * Construtor
   * @generated
   */
  public Cargo(){
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
  public Cargo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém descricao_cargo
   * return descricao_cargo
   * @generated
   */
  
  public java.lang.String getDescricao_cargo(){
    return this.descricao_cargo;
  }

  /**
   * Define descricao_cargo
   * @param descricao_cargo descricao_cargo
   * @generated
   */
  public Cargo setDescricao_cargo(java.lang.String descricao_cargo){
    this.descricao_cargo = descricao_cargo;
    return this;
  }

  /**
   * Obtém salario
   * return salario
   * @generated
   */
  
  public java.lang.Double getSalario(){
    return this.salario;
  }

  /**
   * Define salario
   * @param salario salario
   * @generated
   */
  public Cargo setSalario(java.lang.Double salario){
    this.salario = salario;
    return this;
  }

  /**
   * Obtém funcionario
   * return funcionario
   * @generated
   */
  
  public Funcionario getFuncionario(){
    return this.funcionario;
  }

  /**
   * Define funcionario
   * @param funcionario funcionario
   * @generated
   */
  public Cargo setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cargo object = (Cargo)obj;
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
