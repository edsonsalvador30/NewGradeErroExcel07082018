package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Funcionario")
public class Funcionario implements Serializable {

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
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dat_admissao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date dat_admissao;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIME)
  @Column(name = "hora_trab", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date hora_trab;

  /**
   * Construtor
   * @generated
   */
  public Funcionario(){
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
  public Funcionario setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Funcionario setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém dat_admissao
   * return dat_admissao
   * @generated
   */
  
  public java.util.Date getDat_admissao(){
    return this.dat_admissao;
  }

  /**
   * Define dat_admissao
   * @param dat_admissao dat_admissao
   * @generated
   */
  public Funcionario setDat_admissao(java.util.Date dat_admissao){
    this.dat_admissao = dat_admissao;
    return this;
  }

  /**
   * Obtém hora_trab
   * return hora_trab
   * @generated
   */
  
  public java.util.Date getHora_trab(){
    return this.hora_trab;
  }

  /**
   * Define hora_trab
   * @param hora_trab hora_trab
   * @generated
   */
  public Funcionario setHora_trab(java.util.Date hora_trab){
    this.hora_trab = hora_trab;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Funcionario object = (Funcionario)obj;
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
