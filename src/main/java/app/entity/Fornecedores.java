package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FORNECEDORES
 * @generated
 */
@Entity
@Table(name = "\"FORNECEDORES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Fornecedores")
public class Fornecedores implements Serializable {

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
  @Column(name = "nom_forn", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_forn;

  /**
  * @generated
  */
  @Column(name = "pontuacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer pontuacao;

  /**
   * Construtor
   * @generated
   */
  public Fornecedores(){
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
  public Fornecedores setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_forn
   * return nom_forn
   * @generated
   */
  
  public java.lang.String getNom_forn(){
    return this.nom_forn;
  }

  /**
   * Define nom_forn
   * @param nom_forn nom_forn
   * @generated
   */
  public Fornecedores setNom_forn(java.lang.String nom_forn){
    this.nom_forn = nom_forn;
    return this;
  }

  /**
   * Obtém pontuacao
   * return pontuacao
   * @generated
   */
  
  public java.lang.Integer getPontuacao(){
    return this.pontuacao;
  }

  /**
   * Define pontuacao
   * @param pontuacao pontuacao
   * @generated
   */
  public Fornecedores setPontuacao(java.lang.Integer pontuacao){
    this.pontuacao = pontuacao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Fornecedores object = (Fornecedores)obj;
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
