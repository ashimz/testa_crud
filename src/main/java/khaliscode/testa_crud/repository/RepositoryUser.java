package khaliscode.testa_crud.repository;

import khaliscode.testa_crud.model.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepositoryUser extends JpaRepository<EntityUser, Integer>, PagingAndSortingRepository<EntityUser, Integer> {
}
