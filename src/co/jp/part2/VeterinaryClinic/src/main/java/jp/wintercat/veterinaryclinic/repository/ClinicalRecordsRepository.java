package jp.wintercat.veterinaryclinic.repository;

import jp.wintercat.veterinaryclinic.entity.ClinicalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  カルテ
 */
@Repository
public interface ClinicalRecordsRepository extends JpaRepository<ClinicalRecords,Long> {
    // カルテ検索
    ClinicalRecords findClinicalRecordsByCid(Long cid);
    //　カルテ検索　初診 [0] 初診ではない　[1] 初診対象
    List<ClinicalRecords> findClinicalRecordsByFirstVisit(Integer firstVisit);


}
