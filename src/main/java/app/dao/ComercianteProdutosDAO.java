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
@Repository("ComercianteProdutosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ComercianteProdutosDAO extends JpaRepository<ComercianteProdutos, java.lang.String> {

  /**
   * Obtém a instância de ComercianteProdutos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ComercianteProdutos entity WHERE entity.id = :id")
  public ComercianteProdutos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ComercianteProdutos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ComercianteProdutos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select cp from ComercianteProdutos cp")
  public Page<ComercianteProdutos> list(Pageable pageable);
  


  /**
   * Foreign Key comerciante
   * @generated
   */
  @Query("SELECT entity FROM ComercianteProdutos entity WHERE entity.comerciante.id = :id")
  public Page<ComercianteProdutos> findComercianteProdutossByComerciante(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key produtos
   * @generated
   */
  @Query("SELECT entity FROM ComercianteProdutos entity WHERE entity.produtos.id = :id")
  public Page<ComercianteProdutos> findComercianteProdutossByProdutos(@Param(value="id") java.lang.String id, Pageable pageable);

}
