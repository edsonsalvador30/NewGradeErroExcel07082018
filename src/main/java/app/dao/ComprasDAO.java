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
@Repository("ComprasDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ComprasDAO extends JpaRepository<Compras, java.lang.String> {

  /**
   * Obtém a instância de Compras utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Compras entity WHERE entity.id = :id")
  public Compras findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Compras utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Compras entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Distribuidor entity WHERE entity.compras.id = :id")
  public Page<Distribuidor> findDistribuidor(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key vendedor
   * @generated
   */
  @Query("SELECT entity FROM Compras entity WHERE entity.vendedor.id = :id")
  public Page<Compras> findComprassByVendedor(@Param(value="id") java.lang.String id, Pageable pageable);

}
