package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela DEPENDENTES
 * @generated
 */
@Entity
@Table(name = "\"DEPENDENTES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Dependentes")
public class Dependentes implements Serializable {

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
  @Column(name = "nom_dep", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_dep;

  /**
  * @generated
  */
  @Column(name = "afiliciacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String afiliciacao;

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
  public Dependentes(){
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
  public Dependentes setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_dep
   * return nom_dep
   * @generated
   */
  
  public java.lang.String getNom_dep(){
    return this.nom_dep;
  }

  /**
   * Define nom_dep
   * @param nom_dep nom_dep
   * @generated
   */
  public Dependentes setNom_dep(java.lang.String nom_dep){
    this.nom_dep = nom_dep;
    return this;
  }

  /**
   * Obtém afiliciacao
   * return afiliciacao
   * @generated
   */
  
  public java.lang.String getAfiliciacao(){
    return this.afiliciacao;
  }

  /**
   * Define afiliciacao
   * @param afiliciacao afiliciacao
   * @generated
   */
  public Dependentes setAfiliciacao(java.lang.String afiliciacao){
    this.afiliciacao = afiliciacao;
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
  public Dependentes setFuncionario(Funcionario funcionario){
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
    Dependentes object = (Dependentes)obj;
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
