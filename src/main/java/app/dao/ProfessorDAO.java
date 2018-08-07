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
@Repository("ProfessorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProfessorDAO extends JpaRepository<Professor, java.lang.String> {

  /**
   * Obtém a instância de Professor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Professor entity WHERE entity.id = :id")
  public Professor findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Professor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Professor entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Turma entity WHERE entity.professor.id = :id")
  public Page<Turma> findTurma(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key escola
   * @generated
   */
  @Query("SELECT entity FROM Professor entity WHERE entity.escola.id = :id")
  public Page<Professor> findProfessorsByEscola(@Param(value="id") java.lang.String id, Pageable pageable);

}
