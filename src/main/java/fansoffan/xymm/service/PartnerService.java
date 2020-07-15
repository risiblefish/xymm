package fansoffan.xymm.service;

import fansoffan.xymm.bean.Partner;
import fansoffan.xymm.entity.PartnerEntity;
import fansoffan.xymm.repo.PartnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author yzx
 */
@Service
public class PartnerService {

    private PartnerRepo partnerRepo;


    @Autowired
    public PartnerService(final PartnerRepo partnerRepo) {
        this.partnerRepo = partnerRepo;
    }

    public int getSubPartnerCount(String openId){
        Long pid = partnerRepo.getPidByOpenId(openId);
        Optional<List<PartnerEntity>> childPartners = partnerRepo.findByPid(pid);
        int count = 0;
        if(childPartners.isPresent()) {
            //count child partners
            count += childPartners.get().size();
            //count grandchild partners
            count += childPartners.get().stream().mapToInt( e -> partnerRepo.getChildCount(e.getPid())).sum();
        }
        return count;
    }

    public String getOpenId(String callbackCode) {
        //todo :  remove mock
        return "test";
    }

    /**
     * test add candidate
     * @param partner
     */
    public void saveCandidate(Partner partner){
        PartnerEntity entity = new PartnerEntity();
        entity.setUserName(partner.getUserName());
        entity.setEmail(partner.getEmail());
        entity.setOpenId(partner.getOpenId());
        entity.setPhone(partner.getPhone());
        entity.setStatus(partner.getStatus());
        partnerRepo.save(entity);
    }
}
