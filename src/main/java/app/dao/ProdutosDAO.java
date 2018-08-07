package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ProdutosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProdutosDAO extends JpaRepository<Produtos, java.lang.String> {

  /**
   * Obtém a instância de Produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produtos entity WHERE entity.id = :id")
  public Produtos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produtos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ComercianteProdutos entity WHERE entity.produtos.id = :id")
  public Page<ComercianteProdutos> findComercianteProdutos(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.comerciante FROM ComercianteProdutos entity WHERE entity.produtos.id = :id")
  public Page<Comerciante> listComerciante(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ComercianteProdutos entity WHERE entity.produtos.id = :instanceId AND entity.comerciante.id = :relationId")
  public int deleteComerciante(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
