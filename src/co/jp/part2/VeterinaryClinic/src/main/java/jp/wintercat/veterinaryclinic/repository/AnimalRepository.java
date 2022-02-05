package jp.wintercat.veterinaryclinic.repository;

import jp.wintercat.veterinaryclinic.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  動物　Repository
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {
    // 全て　の　動物検索
    List<Animal> findAll();
    // 動物類　検索　（ Integer Id ）
    Animal findAnimalByAid(Integer aid);
}
