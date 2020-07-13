package fansoffan.xymm.repo;

import fansoffan.xymm.entity.PartnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author yzx
 */
public interface PartnerRepo extends JpaRepository<PartnerEntity, Long> {

  Optional<List<PartnerEntity>> findByPid(Long pid);

  @Query("select t.pid from PartnerEntity t where t.openId = ?1")
  Long getPidByOpenId(String openId);

  @Query("select count(t.pid) from PartnerEntity t where t.pid = ?1")
  Integer getChildCount(Long pid);

}
