package jp.wintercat.veterinaryclinic.repository;

import jp.wintercat.veterinaryclinic.entity.DrugList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 薬物 Repository
 */
@Repository
public interface DrugRepository extends JpaRepository<DrugList,Integer> {



}
